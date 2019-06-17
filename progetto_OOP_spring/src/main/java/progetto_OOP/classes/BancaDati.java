package progetto_OOP.classes;

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
	//getters and setters
	public Vector<Dati> getElenco() {
		return elenco;
	}

	public void setElenco(Vector<Dati> elenco) {
		this.elenco = elenco;
	}
	
}