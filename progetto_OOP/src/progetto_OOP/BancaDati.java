package progetto_OOP;

import java.util.Vector;

/**
 * Classe avente come attributo un vettore di Dati, ideale per inglobare tutti gli oggetti costruiti attraverso il parsing del file csv
 */
public class BancaDati {
	
	private Vector<Dati> elenco;
	
	/**
	 * Costruttore della classe BancaDati
	 * @param elenco vettore di elementi di tipo Dati
	 */
	public BancaDati(Vector<Dati> elenco) {
		this.elenco = elenco;
	}
	
	/**
	 * Metodo ausiliario che stampa a schermo tutte le informazioni di ciascun oggetto di tipo Dati conenuto nel vettore
	 */
	public void stampa() {
		for(Dati i: elenco)
			System.out.println(i.stampa());
	}
}