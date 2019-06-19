package progetto_OOP.classes;

//Java program to count frequencies of elements 
//using HashMap. 
import java.util.HashMap; 
import java.util.Map; 

public class ContaOccorrenze { 
 public static Map<String, Integer> contaOccorrenze(BancaDati dati) { 
     // hashmap to store the frequency of element 
     Map<String, Integer> hm = new HashMap<String, Integer>(); 

     for(Dati elem : dati.getDati()) { 
         Integer j = hm.get(elem.getDati_regione().getNome()); 
         hm.put(elem.getDati_regione().getNome(), (j == null) ? 1 : j + 1); 
     }
     return hm;
 }
}