package progetto_OOP;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import progetto_OOP.Filter.Filtro;
import progetto_OOP.Metadata.Metadata;
import progetto_OOP.Stats.StatsList;
import progetto_OOP.StrutturaDati.BancaDati;
import progetto_OOP.Utility.GetMetadata;
import progetto_OOP.Utility.GetStats;
import progetto_OOP.Utility.LettoreCSV;

/**
 * Controller cheche inizializza le varie GET utili per sperimentare funzionalità implementate per il server Spring
 */
@RestController
public class Progetto_OopSpringController {
	
	private BancaDati dati = new BancaDati(LettoreCSV.ottieni_elenco());
	
	private BancaDati filtrata = new BancaDati(LettoreCSV.ottieni_elenco());
	
	private Metadata metadata = new Metadata(GetMetadata.getmetadata());
	
	private Filtro filtro = new Filtro();
	
	private StatsList stats = new StatsList(GetStats.getstats(dati));
	
	/**
	 * GET che restituisce la home del programma
	 * @return nome del programma
	 */
	@GetMapping("/")
	public String stampa() {
		return"Progetto_OOP di Giovanni Gregorini e Cristian Schiaroli";
	}

	/**
	 * GET che restituisce la lista di tutti i dati
	 * @return dati lisat dei dati
	 * @throws FileNotFoundException Se non trova il file
	 * @throws IOException Classe base per le eccezioni di flussi di dati
	 */
	@GetMapping("/dati")
	public BancaDati ottieniBancadati() throws FileNotFoundException, IOException {
		return dati;
	}
	/**
	 * GET che restituisce la lista di tutti i metadati
	 * @return metadata lista dei metadati
	 * @throws FileNotFoundException Se non trova il file
	 * @throws IOException Classe base per le eccezioni di flussi di dati
	 * @throws ClassNotFoundException Se non trova la classe
	 */
	@GetMapping("/metadata")
	public Metadata ottieniMetadata() throws FileNotFoundException, IOException, ClassNotFoundException {
		return metadata;
	}
	/**
	 * GET che restituisce la lista delle statistiche sulla Banca Dati intera
	 * @return stats lista delle statistiche
	 * @throws FileNotFoundException Se non trova il file
	 * @throws IOException Classe base per le eccezioni di flussi di dati
	 * @throws ClassNotFoundException Se non trova la classe
	 */
	@GetMapping("/stats")
	public StatsList ottieniStats() throws FileNotFoundException, IOException, ClassNotFoundException {
		return stats;
	}
	/**
	 * GET che richiama i metodi asiliari filterBT e filterGLTE per i filtri condizionali.
	 * @param tipo tipo di filtro
	 * @param attributo attributo scelto
	 * @param min valore minimo
	 * @param max valore massimo
	 * @param val valore discriminante
	 * @return filtrata BancaDati filtrata in base ai dati immessi dall'utente
	 * @throws NoSuchMethodException Se il metodo cercato non esiste
	 * @throws SecurityException In caso di violazione nella sicurezza
	 * @throws IllegalAccessException Se si tenta di accedere ad un metodo la cui visibilita' non e' consentita
	 * @throws IllegalArgumentException Se il metodo ha passato un argomento non adeguato
	 * @throws InvocationTargetException Controlla le eccezioni chiamate da un invoke method
	 */
	@GetMapping("/condfilter") //Filtri condizionali
	public ResponseEntity CondFilter (@RequestParam String tipo, String attributo, String min, String max, String val	) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException

	{	
		BancaDati filtroBT =filtro.filterBT(tipo, attributo, min, max, dati, filtrata);
		BancaDati filtroGLTE =filtro.filterGLTE(tipo, attributo, val, dati, filtrata);
		if((filtroBT.getDati().isEmpty())&&(filtroGLTE.getDati().isEmpty())) return new ResponseEntity ("Non esiste",HttpStatus.NOT_FOUND); //Se le liste sono vuote Non esiste 
		else if((!filtroBT.getDati().isEmpty())&&(tipo.equals("$bt"))) return new ResponseEntity <BancaDati> (filtroBT,HttpStatus.OK); //Se mette BT fa between
		else if((!filtroGLTE.getDati().isEmpty())&&((tipo.equals("$lte"))||(tipo.equals("$gte")))) return new ResponseEntity <BancaDati> (filtro.filterGLTE(tipo, attributo, val, dati, filtrata),HttpStatus.OK); //gte controlla se è maggiore, lte controlla se è minore
		else return new ResponseEntity ("Immetti dei valori consoni",HttpStatus.BAD_REQUEST); //Se non è nessuna delle precedenti è una Bad Request

	}
	/**
	 * GET che richiama i metodi filterAND e filterOR per i filtri oogici.
	 * @param tipo tipo di filtro desiderato
	 * @param attributo1  primoattributo scelto
	 * @param valore1 valore scelto per il primo attributo
	 * @param attributo2 secondo attributo scelto
	 * @param valore2 valose scelto per il secondo attributo
	 * @return filtrata BancaDati filtrata in base ai dati immessi dall'utente
	 * @throws NoSuchMethodException Se il metodo cercato non esiste
	 * @throws SecurityException In caso di violazione nella sicurezza
	 * @throws IllegalAccessException Se si tenta di accedere ad un metodo la cui visibilita' non e' consentita
	 * @throws IllegalArgumentException Se il metodo ha passato un argomento non adeguato
	 * @throws InvocationTargetException Controlla le eccezioni chiamate da un invoke method
	 */
	@GetMapping("/logfilter") //Filtri logici

	public ResponseEntity LogFilter (@RequestParam String tipo, String attributo1, String valore1, String attributo2, String valore2) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException
	{
		if((filtro.filterAND(attributo1, valore1, attributo2, valore2, dati, filtrata).getDati().isEmpty())&&(filtro.filterOR(attributo1, valore1, attributo2, valore2, dati, filtrata).getDati().isEmpty())) return new ResponseEntity ("Non esiste",HttpStatus.NOT_FOUND); //Se le liste sono vuote Non esiste
		else if((!filtro.filterAND(attributo1, valore1, attributo2, valore2, dati, filtrata).getDati().isEmpty())&&(tipo.equals("$and"))) return new ResponseEntity <BancaDati> (filtro.filterAND(attributo1, valore1, attributo2, valore2, dati, filtrata),HttpStatus.OK); //Cerca tutte le aziende che hanno 2 specifici valori
		else if((!filtro.filterOR(attributo1, valore1, attributo2, valore2, dati, filtrata).getDati().isEmpty())&&(tipo.equals("$or"))) return new ResponseEntity <BancaDati> (filtro.filterOR(attributo1, valore1, attributo2, valore2, dati, filtrata),HttpStatus.OK); //Cerca tutte le aziende che hanno o uno o l'altro tipo di valore
		else return new ResponseEntity ("Immetti dei valori consoni",HttpStatus.BAD_REQUEST); //Se non è nessuna delle precedenti è una Bad Request
	
	}
}