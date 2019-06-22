package progetto_OOP.Filter;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import progetto_OOP.StrutturaDati.BancaDati;
import progetto_OOP.Utility.LettoreCSV;

public class Filtro {
	/**
	 * Costruttore della classe Filtro
	 */
	public Filtro() {
		
	}
	
	private BancaDati lista = new BancaDati(LettoreCSV.ottieni_elenco());

/**
 * Filtro condizionale che filtra tutti gli elementi compresi tra 2 valori impostati dall'utente.
 * @param tipo Dichiara il tipo di filtro scelto 
 * @param attributo E' l'attributo che si vuole filtrare
 * @param min E' il valore minimo
 * @param max E' il valore massimo
 * @param originale E' la BancaDati non ancora filtrata
 * @param filtrata E' la BancaDati che dovrà essere filtrata
 * @return filtrata E' la BancaDati filtrata
 * @throws NoSuchMethodException Se il metodo che vado a cercare non esiste
 * @throws SecurityException Se c'è stata una violazione nella sicurezza
 * @throws IllegalAccessException Se si tenta di accedere ad un metodo la cui visibilità non è consentita
 * @throws IllegalArgumentException Se il metodo ha passato un argomento non appropriato
 * @throws InvocationTargetException Controlla le eccezioni che sono chiamate da un invoke method
 */
	public BancaDati filterBT(String tipo, String attributo,String min,String max, BancaDati originale,BancaDati filtrata) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		try {
		
		int size=originale.getDati().size(); //Prende la taglia della lista
		Object v=null; //inizializzo v
		if (tipo.equals("$bt")) {//controlla il tipo di filtro richiesto
			for(int i=0; i<max.length();i++) {
				if(Character.isLetter(max.charAt(i))) return filtrata;	//Serve per vedere se si immettono dei valori non appropriati
				}
			for(int i=0; i<min.length();i++) {
				if(Character.isLetter(min.charAt(i))) return filtrata;	//Serve per vedere se si immettono dei valori non appropriati
				}
				filtrata.getDati().clear(); //Pulisce la lista 
				double MIN = Double.parseDouble(min); //Trasformo min in float
				double MAX = Double.parseDouble(max); //Trasformo max in float
		    	for(int a=0; a<size; a++)
		    	{
		    	
		    		if((attributo.equals("spesa_laurea"))||(attributo.equals("spesa_dottorato"))||(attributo.contentEquals("spesa_specializzazione"))) { //Controllo che serve perchè i dati delle spese sono contenute in dati_spesa e non in BancaDati
		    			//Con questa funzione in base al nome tra spesa_laurea, spesa_dottorato e spesa_specializzazione richiama il get adeguato
		    			//Ho dovuto instaziare una nuova lista tipo BancaDati per raggiungere il metodo altrimenti avrebbe dato errore perchè non è istanzata all'interno di questa classe
		    			Method u = lista.getDati().get(a).getDati_spesa().getClass().getMethod("get"+attributo.substring(0, 1).toUpperCase()+attributo.substring(1), null);
		    			//grazie invece all'invoke riprendo il valore appunto del metodo richiamato precendentemente
		    			v = u.invoke(originale.getDati().get(a).getDati_spesa(), null);
		    		}
		    		else if((attributo.equals("anno_solare"))) {
		    			Method u= lista.getDati().get(a).getClass().getMethod("get"+attributo.substring(0, 1).toUpperCase()+attributo.substring(1), null);
		    			v = u.invoke(originale.getDati().get(a), null);
		    		}
		    		
		    			double V = ((Number)v).doubleValue();	//Converto in double
		    			if((V >= MIN) && (V <= MAX))	filtrata.getDati().add(originale.getDati().get(a)); //se il valore è tra max e min lo mette dentro filtrata
		    		}
		    	} 	
		}catch(NoSuchMethodError a) {a.printStackTrace();
		}catch (SecurityException b) {b.printStackTrace();
		}catch(IllegalAccessException c) {c.printStackTrace();
		}catch(IllegalArgumentException d) {d.printStackTrace();
		}catch(InvocationTargetException e) {e.printStackTrace();
		}
		return filtrata;
	}
	/**
	 * Filtro condizionale che filtra tutti gli elementi maggiori o minori del valore impostato dall'utente.
	 * @param tipo Dichiara il tipo di filtro scelto 
	 * @param attributo Dichiara l'attributo scelto
	 * @param val Dichiara il valore di soglia
	 * @param originale E' la BancaDati non ancora filtrata
	 * @param filtrata E' la BancaDati che dovrà essere filtrata
	 * @return filtrata E' la BancaDati filtrata
	 * @throws NoSuchMethodException Se il metodo che vado a cercare non esiste
	 * @throws SecurityException Se c'è stata una violazione nella sicurezza
	 * @throws IllegalAccessException Se si tenta di accedere ad un metodo la cui visibilità non è consentita
	 * @throws IllegalArgumentException Se il metodo ha passato un argomento non appropriato
	 * @throws InvocationTargetException Controlla le eccezioni che sono chiamate da un invoke method
	 */
	public BancaDati filterGLTE(String tipo,String attributo,String val, BancaDati originale,BancaDati filtrata) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		try {
		
		int size=originale.getDati().size();
		Object v=null;
		for(int i=0; i<val.length();i++) {
			if((Character.isLetter(val.charAt(i)))) return filtrata; //Serve per vedere se si immettono dei valori non appropriati
			}		
		if (tipo.equals("$gte")) {//controlla il tipo di filtro richiesto	
			filtrata.getDati().clear();
			double VAL = Double.parseDouble(val);
		    	for(int a=0; a<size; a++)
		    	{
		    		if((attributo.equals("spesa_laurea"))||(attributo.equals("spesa_dottorato"))||(attributo.contentEquals("spesa_specializzazione"))) {
		    			Method u = lista.getDati().get(a).getDati_spesa().getClass().getMethod("get"+attributo.substring(0, 1).toUpperCase()+attributo.substring(1), null);
		    			v = u.invoke(originale.getDati().get(a).getDati_spesa(), null);
		    		}
		    		else if((attributo.equals("anno_solare"))) {
		    			Method u= lista.getDati().get(a).getClass().getMethod("get"+attributo.substring(0, 1).toUpperCase()+attributo.substring(1), null);
		    			v = u.invoke(originale.getDati().get(a), null);
		    		}
		    		double V = ((Number)v).doubleValue();	//Converto in double
		    		if(V >= VAL)	filtrata.getDati().add(originale.getDati().get(a)); //se il valore è minore lo mette dentro filtrata
		    	} 	
		}
		else if (tipo.equals("$lte")) {//controlla il tipo di filtro richiesto
			filtrata.getDati().clear();
			double VAL = Double.parseDouble(val);
	    	for(int a=0; a<size; a++)
	    	{
	    		if((attributo.equals("spesa_laurea"))||(attributo.equals("spesa_dottorato"))||(attributo.contentEquals("spesa_specializzazione"))) {
	    			Method u = lista.getDati().get(a).getDati_spesa().getClass().getMethod("get"+attributo.substring(0, 1).toUpperCase()+attributo.substring(1), null);
	    			v = u.invoke(originale.getDati().get(a).getDati_spesa(), null);
	    		}
	    		else if((attributo.equals("anno_solare"))) {
	    			Method u= lista.getDati().get(a).getClass().getMethod("get"+attributo.substring(0, 1).toUpperCase()+attributo.substring(1), null);
	    			v = u.invoke(originale.getDati().get(a), null);
	    		}
	    		double V = ((Number)v).doubleValue();	//Converto in double
	    		if(V <= VAL)	filtrata.getDati().add(originale.getDati().get(a));  //se il valore è maggiore lo mette dentro filtrata
	    	} 	
		}
		}catch(NoSuchMethodError a) {a.printStackTrace();
		}catch (SecurityException b) {b.printStackTrace();
		}catch(IllegalAccessException c) {c.printStackTrace();
		}catch(IllegalArgumentException d) {d.printStackTrace();
		}catch(InvocationTargetException e) {e.printStackTrace();
		}
	return filtrata;
}
	/**
	 * Filtro Logico "And" che filtra tutti gli elementi che hanno 2 attributi specificati dall'utente uguali ai valori immessi.
	 * @param attributo1 E' il primo attributo
	 * @param valore1 Valore del primo attributo
	 * @param attributo2 E' il secondo attributo
	 * @param valore2 Valore del secondo attributo
	 * @param originale E' la BancaDati non ancora filtrata
	 * @param filtrata E' la BancaDati che dovrà essere filtrata
	 * @return filtrata E' la BancaDati filtrata
	 * @throws NoSuchMethodException Se il metodo che vado a cercare non esiste
	 * @throws SecurityException Se c'è stata una violazione nella sicurezza
	 * @throws IllegalAccessException Se si tenta di accedere ad un metodo la cui visibilità non è consentita
	 * @throws IllegalArgumentException Se il metodo ha passato un argomento non appropriato
	 * @throws InvocationTargetException Controlla le eccezioni che sono chiamate da un invoke method
	 */
	public BancaDati filterAND(String attributo1,String valore1,String attributo2, String valore2, BancaDati originale,BancaDati filtrata) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		try {
		filtrata.getDati().clear();
		double ATTRIBUTO1 = Double.parseDouble(attributo1);
		double ATTRIBUTO2 = Double.parseDouble(attributo2);
		int size=originale.getDati().size();
		Object v1=null;
		Object v2=null;
		for(int a=0; a<size; a++)
    	{
			if((attributo1.equals("spesa_laurea"))||(attributo1.equals("spesa_dottorato"))||(attributo1.contentEquals("spesa_specializzazione"))) {
				Method u1= lista.getDati().get(a).getDati_spesa().getClass().getMethod("get"+attributo1.substring(0, 1).toUpperCase()+attributo1.substring(1), null);
				v1 = u1.invoke(originale.getDati().get(a).getDati_spesa(), null);
			}
			else {
				Method u1 = lista.getDati().get(a).getClass().getMethod("get"+attributo1.substring(0, 1).toUpperCase()+attributo1.substring(1), null);
				v1 = u1.invoke(originale.getDati().get(a), null); 
			}
			if((attributo2.equals("spesa_laurea"))||(attributo2.equals("spesa_dottorato"))||(attributo2.contentEquals("spesa_specializzazione"))) {
				Method u2= lista.getDati().get(a).getDati_spesa().getClass().getMethod("get"+attributo2.substring(0, 1).toUpperCase()+attributo2.substring(1), null);
				v2 = u2.invoke(originale.getDati().get(a).getDati_spesa(), null);
			}
			else {
				Method u2 = lista.getDati().get(a).getClass().getMethod("get"+attributo2.substring(0, 1).toUpperCase()+attributo2.substring(1), null);
				v2 = u2.invoke(originale.getDati().get(a), null); 
			}
    		double V1 = ((Number)v1).doubleValue();	//Converto in double
    		double V2 = ((Number)v2).doubleValue();	//Converto in double
    		
    		if((ATTRIBUTO1==V1)&&(ATTRIBUTO2==V2))	filtrata.getDati().add(originale.getDati().get(a)); //Se entrambi gli attributi sono equivalenti ai valori immessi, inserisce l'elemento in filtrata
    	}
		}catch(NoSuchMethodError a) {a.printStackTrace();
		}catch (SecurityException b) {b.printStackTrace();
		}catch(IllegalAccessException c) {c.printStackTrace();
		}catch(IllegalArgumentException d) {d.printStackTrace();
		}catch(InvocationTargetException e) {e.printStackTrace();
		}
		return filtrata;
	}
	/**
	 * Filtro Logico "Or" che filtra tutti gli elementi che hanno uno dei 2 campi specificati dall'utente.
	 * @param attributo1 E' il primo attributo
	 * @param valore1 Valore del primo attributo
	 * @param attributo2 E' il secondo attributo
	 * @param valore2 Valore del secondo attributo
	 * @param originale E' la BancaDati non ancora filtrata
	 * @param filtrata E' la BancaDati che dovrà essere filtrata
	 * @return filtrata E' la BancaDati filtrata
	 * @throws NoSuchMethodException Se il metodo che vado a cercare non esiste
	 * @throws SecurityException Se c'è stata una violazione nella sicurezza
	 * @throws IllegalAccessException Se si tenta di accedere ad un metodo la cui visibilità non è consentita
	 * @throws IllegalArgumentException Se il metodo ha passato un argomento non appropriato
	 * @throws InvocationTargetException Controlla le eccezioni che sono chiamate da un invoke method
	 */
	public BancaDati filterOR(String attributo1,String valore1,String attributo2, String valore2, BancaDati originale,BancaDati filtrata) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		try {
		filtrata.getDati().clear();
		double VALORE1 = Double.parseDouble(valore1);
		double VALORE2 = Double.parseDouble(valore2);
		int size=originale.getDati().size();
		Object v1=null;
		Object v2=null;
		for(int a=0; a<size; a++)
    	{
			if((attributo1.equals("spesa_laurea"))||(attributo1.equals("spesa_dottorato"))||(attributo1.contentEquals("spesa_specializzazione"))) {
				Method u1= lista.getDati().get(a).getDati_spesa().getClass().getMethod("get"+attributo1.substring(0, 1).toUpperCase()+attributo1.substring(1), null);
				v1 = u1.invoke(originale.getDati().get(a).getDati_spesa(), null);
			}
			else {
				Method u1 = lista.getDati().get(a).getClass().getMethod("get"+attributo1.substring(0, 1).toUpperCase()+attributo1.substring(1), null);
				v1 = u1.invoke(originale.getDati().get(a), null); 
			}
			if((attributo2.equals("spesa_laurea"))||(attributo2.equals("spesa_dottorato"))||(attributo2.contentEquals("spesa_specializzazione"))) {
				Method u2= lista.getDati().get(a).getDati_spesa().getClass().getMethod("get"+attributo2.substring(0, 1).toUpperCase()+attributo2.substring(1), null);
				v2 = u2.invoke(originale.getDati().get(a).getDati_spesa(), null);
			}
			else {
				Method u2 = lista.getDati().get(a).getClass().getMethod("get"+attributo2.substring(0, 1).toUpperCase()+attributo2.substring(1), null);
				v2 = u2.invoke(originale.getDati().get(a), null); 
			}
    		double V1 = ((Number)v1).doubleValue();	//Converto in double
    		double V2 = ((Number)v2).doubleValue();	//Converto in double

    		if((VALORE1==V1)||(VALORE2==V2))	filtrata.getDati().add(originale.getDati().get(a));  //Se uno dei due attributi è equivalente ai valori immessi, inserisce l'elemento in filtrata
    	}
		}catch(NoSuchMethodError a) {a.printStackTrace();
		}catch (SecurityException b) {b.printStackTrace();
		}catch(IllegalAccessException c) {c.printStackTrace();
		}catch(IllegalArgumentException d) {d.printStackTrace();
		}catch(InvocationTargetException e) {e.printStackTrace();
		}
		return filtrata;
	}
}
