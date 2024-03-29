package progetto_OOP.Utility;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

import progetto_OOP.StrutturaDati.Dati;

/**
 * Classe adibita al parsing dei dati contenuti nel dataset
 */
public class LettoreCSV {

    /**
     * Metodo ausiliario che legge il file csv e sistema tutti i dati all'interno di classi di tipo Dati
     * @return vettore di elementi di tipo Dati contenente tutte le informazioni all'interno del dataset
     */
	public static Vector<Dati> ottieni_elenco() {

        String file_csv = "dataset_1.csv";
        String line = "";
        String divisore = ";";

        //prova a leggere dal file csv
        try (BufferedReader br = new BufferedReader(new FileReader(file_csv))) {

            //creazione del vettore dove saranno inseriti gli oggetti di tipo Dati ottenuti dal parsing del csv
        	Vector<Dati> dati = new Vector<Dati>();
            
        	//dichiarazione delle variabili dove saranno inseriti i dati
            int anno_solare;
            String codice_regione;
            String nome_regione;
            String codice_ente;
            String nome_ente;
            String codice_istituto;
            String nome_istituto;
            String tipo_istituto;
            String codice_spesa;
            String descrizione_spesa;
            int spesa_laurea;
            int spesa_dottorato;
            int spesa_specializzazione;
            String[] dati_input;
            
            while ((line = br.readLine()) != null) {

            	//sistemazione dei dati di una riga all'interno del vettore
            	dati_input = line.split(divisore, 13);
                
                
                try {
                	//inserimento dei dati contenuti nel vettore dati_input nelle variabili dichiarate in precedenza
                	anno_solare = Integer.parseInt(dati_input[0]);
                	codice_regione = dati_input[1];
                	nome_regione = dati_input[2];
                	codice_ente = dati_input[3];
                	nome_ente = dati_input[4];
                	codice_istituto = dati_input[5];
                	nome_istituto = dati_input[6];
                	tipo_istituto = dati_input[7];
                	codice_spesa = dati_input[8];
                	descrizione_spesa = dati_input[9];
                	//se il dato riguardante le varie spese non è presente nel csv o è <0 verrà inserito 0
                	if(dati_input[10].contentEquals("")||Integer.parseInt(dati_input[10])<0) {
                		spesa_laurea = 0;
                	}
                	else spesa_laurea = Integer.parseInt(dati_input[10]);
                	if(dati_input[11].contentEquals("")||Integer.parseInt(dati_input[11])<0) {
                		spesa_dottorato = 0;
                	}
                	else spesa_dottorato = Integer.parseInt(dati_input[11]);
                	if(dati_input[12].contentEquals("")||Integer.parseInt(dati_input[12])<0) {
                		spesa_specializzazione = 0;
                	}
                	else spesa_specializzazione = Integer.parseInt(dati_input[12]);
                	//costruzione dell'oggetto di tipo Dati e inserimento del medesimo all'interno del vettore elenco
                	dati.add(new Dati(anno_solare,
       					 				codice_regione, nome_regione,
       					 				codice_ente, nome_ente,
       					 				codice_istituto, nome_istituto, tipo_istituto,
       					 				codice_spesa, descrizione_spesa, spesa_laurea, spesa_dottorato, spesa_specializzazione));
                }
                //se non è possibile la conversione dei dati contenuti nel csv viene bypassata l'intera riga
                catch (Exception e) {
                }
            }
            //vene restituito l'intero vettore contenente tutti gli oggetti di tipo Dato creati mediante il parsing del csv
            return dati;
        }
        //in caso di assenza del file csv
        catch (IOException e) {
            e.printStackTrace();
        }
        //viene restituiyo un vettore vuoto
        return new Vector<Dati>();
    }
}