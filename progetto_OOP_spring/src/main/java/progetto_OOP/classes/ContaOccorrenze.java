package progetto_OOP.classes;

//Java program to count frequencies of elements 
//using HashMap. 
import java.util.HashMap; 
import java.util.Map; 

public class ContaOccorrenze { 
 public static Map<String, Integer> contaOccorrenzeNomeRegione(BancaDati dati) { 
     // hashmap to store the frequency of element 
     Map<String, Integer> hm = new HashMap<String, Integer>(); 

     for(Dati elem : dati.getDati()) { 
         Integer j = hm.get(elem.getDati_regione().getNome()); 
         hm.put(elem.getDati_regione().getNome(), (j == null) ? 1 : j + 1); 
     }
     return hm;
 }
 public static Map<String, Integer> contaOccorrenzeCodiceRegione(BancaDati dati) { 
     // hashmap to store the frequency of element 
     Map<String, Integer> hm = new HashMap<String, Integer>(); 

     for(Dati elem : dati.getDati()) { 
         Integer j = hm.get(elem.getDati_regione().getCodice()); 
         hm.put(elem.getDati_regione().getCodice(), (j == null) ? 1 : j + 1); 
     }
     return hm;
 }
 public static Map<String, Integer> contaOccorrenzeNomeEnte(BancaDati dati) { 
     // hashmap to store the frequency of element 
     Map<String, Integer> hm = new HashMap<String, Integer>(); 

     for(Dati elem : dati.getDati()) { 
         Integer j = hm.get(elem.getDati_ente().getNome()); 
         hm.put(elem.getDati_ente().getNome(), (j == null) ? 1 : j + 1); 
     }
     return hm;
 }
 public static Map<String, Integer> contaOccorrenzeCodiceEnte(BancaDati dati) { 
     // hashmap to store the frequency of element 
     Map<String, Integer> hm = new HashMap<String, Integer>(); 

     for(Dati elem : dati.getDati()) { 
         Integer j = hm.get(elem.getDati_ente().getCodice()); 
         hm.put(elem.getDati_ente().getCodice(), (j == null) ? 1 : j + 1); 
     }
     return hm;
 }
 public static Map<String, Integer> contaOccorrenzeNomeIstituto(BancaDati dati) { 
     // hashmap to store the frequency of element 
     Map<String, Integer> hm = new HashMap<String, Integer>(); 

     for(Dati elem : dati.getDati()) { 
         Integer j = hm.get(elem.getDati_istituto().getNome()); 
         hm.put(elem.getDati_istituto().getNome(), (j == null) ? 1 : j + 1); 
     }
     return hm;
 }
 public static Map<String, Integer> contaOccorrenzeCodiceIstituto(BancaDati dati) { 
     // hashmap to store the frequency of element 
     Map<String, Integer> hm = new HashMap<String, Integer>(); 

     for(Dati elem : dati.getDati()) { 
         Integer j = hm.get(elem.getDati_istituto().getCodice()); 
         hm.put(elem.getDati_istituto().getCodice(), (j == null) ? 1 : j + 1); 
     }
     return hm;
 }
 public static Map<String, Integer> contaOccorrenzeTipoIstituto(BancaDati dati) { 
     // hashmap to store the frequency of element 
     Map<String, Integer> hm = new HashMap<String, Integer>(); 

     for(Dati elem : dati.getDati()) { 
         Integer j = hm.get(elem.getDati_istituto().getTipo_istituto()); 
         hm.put(elem.getDati_istituto().getTipo_istituto(), (j == null) ? 1 : j + 1); 
     }
     return hm;
 }
 public static Map<String, Integer> contaOccorrenzeNomeSpesa(BancaDati dati) { 
     // hashmap to store the frequency of element 
     Map<String, Integer> hm = new HashMap<String, Integer>(); 

     for(Dati elem : dati.getDati()) { 
         Integer j = hm.get(elem.getDati_spesa().getNome()); 
         hm.put(elem.getDati_spesa().getNome(), (j == null) ? 1 : j + 1); 
     }
     return hm;
 }
 public static Map<String, Integer> contaOccorrenzeCodiceSpesa(BancaDati dati) { 
     // hashmap to store the frequency of element 
     Map<String, Integer> hm = new HashMap<String, Integer>(); 

     for(Dati elem : dati.getDati()) { 
         Integer j = hm.get(elem.getDati_spesa().getCodice()); 
         hm.put(elem.getDati_spesa().getCodice(), (j == null) ? 1 : j + 1); 
     }
     return hm;
 }
}