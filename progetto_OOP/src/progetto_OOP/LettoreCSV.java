package progetto_OOP;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * 
 * Classe adibita al parsing dei dati contenuti nel dataset
 *
 */
public class LettoreCSV {

    public static void main(String[] args) {

        String file_csv = "dataset_1.csv";
        String line = "";
        String divisore = ";";

        try (BufferedReader br = new BufferedReader(new FileReader(file_csv))) {

        	int i = 0;
        	final int MAX = 999;
            Dati[] elenco = new Dati[MAX];
            
            while ((line = br.readLine()) != null) {

                String[] dati_input = line.split(divisore, -1);
                
                int anno_solare;
                if(dati_input[0].contentEquals("")) {
                	anno_solare = 0;
                }
                else anno_solare = Integer.parseInt(dati_input[0]);
                
                int spesa_laurea;
                if(dati_input[10].contentEquals("")) {
                	spesa_laurea = 0;
                }
                else spesa_laurea = Integer.parseInt(dati_input[10]);
                
                int spesa_dottorato;
                if(dati_input[11].contentEquals("")) {
                	spesa_dottorato = 0;
                }
                else spesa_dottorato = Integer.parseInt(dati_input[11]);
                
                int spesa_specializzazione;
                if(dati_input[12].contentEquals("")) {
                	spesa_specializzazione = 0;
                }
                else spesa_specializzazione = Integer.parseInt(dati_input[12]);
                
                elenco[i] = new Dati(anno_solare,
                					 dati_input[1], dati_input[2],
                					 dati_input[3], dati_input[4],
                					 dati_input[5], dati_input[6], dati_input[7],
                					 dati_input[8], dati_input[9], spesa_laurea, spesa_dottorato, spesa_specializzazione);
                i++;
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}