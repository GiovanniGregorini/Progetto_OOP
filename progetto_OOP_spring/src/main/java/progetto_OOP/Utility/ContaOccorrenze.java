package progetto_OOP.Utility;


import java.util.HashMap; 
import java.util.Map;

import progetto_OOP.StrutturaDati.BancaDati;
import progetto_OOP.StrutturaDati.Dati; 
/**
 * Classe contenente metodi per effettuare calcoli statistici su attributi di tipo String
 */
public class ContaOccorrenze { 
	/**
	 * Metodo ausiliario che conta le occorrenze degli elementi singoli del campo nome regione
	 * @param dati oggetto di tipo dati
	 * @return elementi singoli e il numero delle loro occorrenze
	 */
 public static Map<String, Integer> contaOccorrenzeNomeRegione(BancaDati dati) {
     Map<String, Integer> hm = new HashMap<String, Integer>(); 

     for(Dati elem : dati.getDati()) { 
         Integer j = hm.get(elem.getDati_regione().getNome()); 
         hm.put(elem.getDati_regione().getNome(), (j == null) ? 1 : j + 1); 
     }
     return hm;
 }
 /**
	 * Metodo ausiliario che conta le occorrenze degli elementi singoli del campo codice regione
	 * @param dati oggetto di tipo dati
	 * @return elementi singoli e il numero delle loro occorrenze
	 */
 public static Map<String, Integer> contaOccorrenzeCodiceRegione(BancaDati dati) {
     Map<String, Integer> hm = new HashMap<String, Integer>(); 

     for(Dati elem : dati.getDati()) { 
         Integer j = hm.get(elem.getDati_regione().getCodice()); 
         hm.put(elem.getDati_regione().getCodice(), (j == null) ? 1 : j + 1); 
     }
     return hm;
 }
 /**
	 * Metodo ausiliario che conta le occorrenze degli elementi singoli del campo nome ente
	 * @param dati oggetto di tipo dati
	 * @return elementi singoli e il numero delle loro occorrenze
	 */
 public static Map<String, Integer> contaOccorrenzeNomeEnte(BancaDati dati) {
     Map<String, Integer> hm = new HashMap<String, Integer>(); 

     for(Dati elem : dati.getDati()) { 
         Integer j = hm.get(elem.getDati_ente().getNome()); 
         hm.put(elem.getDati_ente().getNome(), (j == null) ? 1 : j + 1); 
     }
     return hm;
 }
 /**
	 * Metodo ausiliario che conta le occorrenze degli elementi singoli del campo codice ente
	 * @param dati oggetto di tipo dati
	 * @return elementi singoli e il numero delle loro occorrenze
	 */
 public static Map<String, Integer> contaOccorrenzeCodiceEnte(BancaDati dati) {
     Map<String, Integer> hm = new HashMap<String, Integer>(); 

     for(Dati elem : dati.getDati()) { 
         Integer j = hm.get(elem.getDati_ente().getCodice()); 
         hm.put(elem.getDati_ente().getCodice(), (j == null) ? 1 : j + 1); 
     }
     return hm;
 }
 /**
	 * Metodo ausiliario che conta le occorrenze degli elementi singoli del campo nome istituto
	 * @param dati oggetto di tipo dati
	 * @return elementi singoli e il numero delle loro occorrenze
	 */
 public static Map<String, Integer> contaOccorrenzeNomeIstituto(BancaDati dati) {
     Map<String, Integer> hm = new HashMap<String, Integer>(); 

     for(Dati elem : dati.getDati()) { 
         Integer j = hm.get(elem.getDati_istituto().getNome()); 
         hm.put(elem.getDati_istituto().getNome(), (j == null) ? 1 : j + 1); 
     }
     return hm;
 }
 /**
	 * Metodo ausiliario che conta le occorrenze degli elementi singoli del campo codice istituto
	 * @param dati oggetto di tipo dati
	 * @return elementi singoli e il numero delle loro occorrenze
	 */
 public static Map<String, Integer> contaOccorrenzeCodiceIstituto(BancaDati dati) {
     Map<String, Integer> hm = new HashMap<String, Integer>(); 

     for(Dati elem : dati.getDati()) { 
         Integer j = hm.get(elem.getDati_istituto().getCodice()); 
         hm.put(elem.getDati_istituto().getCodice(), (j == null) ? 1 : j + 1); 
     }
     return hm;
 }
 /**
	 * Metodo ausiliario che conta le occorrenze degli elementi singoli del campo tipo istituto
	 * @param dati oggetto di tipo dati
	 * @return elementi singoli e il numero delle loro occorrenze
	 */
 public static Map<String, Integer> contaOccorrenzeTipoIstituto(BancaDati dati) {
     Map<String, Integer> hm = new HashMap<String, Integer>(); 

     for(Dati elem : dati.getDati()) { 
         Integer j = hm.get(elem.getDati_istituto().getTipo_istituto()); 
         hm.put(elem.getDati_istituto().getTipo_istituto(), (j == null) ? 1 : j + 1); 
     }
     return hm;
 }
 /**
	 * Metodo ausiliario che conta le occorrenze degli elementi singoli del campo nome spesa
	 * @param dati oggetto di tipo dati
	 * @return elementi singoli e il numero delle loro occorrenze
	 */
 public static Map<String, Integer> contaOccorrenzeNomeSpesa(BancaDati dati) {
     Map<String, Integer> hm = new HashMap<String, Integer>(); 

     for(Dati elem : dati.getDati()) { 
         Integer j = hm.get(elem.getDati_spesa().getNome()); 
         hm.put(elem.getDati_spesa().getNome(), (j == null) ? 1 : j + 1); 
     }
     return hm;
 }
 /**
	 * Metodo ausiliario che conta le occorrenze degli elementi singoli del campo codice spesa
	 * @param dati oggetto di tipo dati
	 * @return elementi singoli e il numero delle loro occorrenze
	 */
 public static Map<String, Integer> contaOccorrenzeCodiceSpesa(BancaDati dati) {
     Map<String, Integer> hm = new HashMap<String, Integer>(); 

     for(Dati elem : dati.getDati()) { 
         Integer j = hm.get(elem.getDati_spesa().getCodice()); 
         hm.put(elem.getDati_spesa().getCodice(), (j == null) ? 1 : j + 1); 
     }
     return hm;
 }
}