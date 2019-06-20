package progetto_OOP.classes;

import java.util.Vector;

/**
 * Classe avente come attributo un vettore di Dati, ideale per inglobare tutti gli oggetti costruiti attraverso il parsing del file csv
 */
public class BancaDati {
	
	private Vector<Dati> dati;
	
	/**
	 * Costruttore della classe BancaDati
	 * @param elenco vettore di elementi di tipo Dati
	 */
	public BancaDati(Vector<Dati> dati) {
		this.dati = dati;
	}
	
	//metodi statistiche
	/**
	 * Metodo ausiliario che calcola la media delle spese per lauree
	 * @return media delle spese per lauree
	 */
	public double avgspesa_laurea() {
		int sum = 0;
		int i = 0;
		for(Dati elem : dati) {
			sum += elem.getDati_spesa().getSpesa_laurea();
			i++;
		}
		return (double) sum/i;
	}
	/**
	 * Metodo ausiliario che calcola la media delle spese per dottorati
	 * @return media delle spese per dottorti
	 */
	public double avgspesa_dottorato() {
		int sum = 0;
		int i = 0;
		for(Dati elem : dati) {
			sum += elem.getDati_spesa().getSpesa_dottorato();
			i++;
		}
		return (double) sum/i;
	}
	/**
	 * Metodo ausiliario che calcola la media delle spese per le specializzazioni
	 * @return media delle spese per le specializzazioni
	 */
	public double avgspesa_specializzazione() {
		int sum = 0;
		int i = 0;
		for(Dati elem : dati) {
			sum += elem.getDati_spesa().getSpesa_specializzazione();
			i++;
		}
		return (double) sum/i;
	}
	/**
	 * Metodo ausiliario che calcola il minimo delle spese per le lauree
	 * @return monimo delle spese per le lauree
	 */
	public int minspesa_laurea() {
		int min = dati.firstElement().getDati_spesa().getSpesa_laurea();
		for(Dati elem : dati) {
			if(elem.getDati_spesa().getSpesa_laurea() < min)
				min = elem.getDati_spesa().getSpesa_laurea();
		}
		return min;
	}
	/**
	 * Metodo ausiliario che calcola il minimo delle spese per i dottorati
	 * @return minimo delle spese per i dottorati
	 */
	public int minspesa_dottorato() {
		int min = dati.firstElement().getDati_spesa().getSpesa_dottorato();
		for(Dati elem : dati) {
			if(elem.getDati_spesa().getSpesa_dottorato() < min)
				min = elem.getDati_spesa().getSpesa_dottorato();
		}
		return min;
	}
	/**
	 * Metodo ausiliario che calcola il mininmo delle spese per le specializzazioni
	 * @return minimo delle spese per le specializzazioni
	 */
	public int minspesa_specializzazione() {
		int min = dati.firstElement().getDati_spesa().getSpesa_specializzazione();
		for(Dati elem : dati) {
			if(elem.getDati_spesa().getSpesa_specializzazione() < min)
				min = elem.getDati_spesa().getSpesa_specializzazione();
		}
		return min;
	}
	/**
	 * Metodo ausiliario che calcola il massimo delle spese per lauree
	 * @return massimo delle spese per lauree
	 */
	public int maxspesa_laurea() {
		int max = 0;
		for(Dati elem : dati) {
			if(elem.getDati_spesa().getSpesa_laurea() > max)
				max = elem.getDati_spesa().getSpesa_laurea();
		}
		return max;
	}
	/**
	 * Metodo ausiliario che calcola il massimo delle spese per i dottorati
	 * @return massimo delle spese per i dottorati
	 */
	public int maxspesa_dottorato() {
		int max = 0;
		for(Dati elem : dati) {
			if(elem.getDati_spesa().getSpesa_dottorato() > max)
				max = elem.getDati_spesa().getSpesa_dottorato();
		}
		return max;
	}
	/**
	 * Metodo ausiliario che calcola il massimo delle spese per le specializzazioni
	 * @return massimo delle spese pel le specializzazioni
	 */
	public int maxspesa_specializzazione() {
		int max = 0;
		for(Dati elem : dati) {
			if(elem.getDati_spesa().getSpesa_specializzazione() > max)
				max = elem.getDati_spesa().getSpesa_specializzazione();
		}
		return max;
	}
	/**
	 * Metodo ausiliario che calcola la deviazione standard delle spesa per le lauree
	 * @return deviazione standard delle spese per le lauree
	 */
	public double stdspesa_laurea() {
		double avg = this.avgspesa_laurea();
		double scarto = 0;
		int i = 0;
		for(Dati elem : dati) {
			scarto += Math.pow(elem.getDati_spesa().getSpesa_laurea()-avg,2);
			i++;
		}
		return Math.sqrt(scarto/i);
	}
	/**
	 * Metodo ausiliario che calcola la deviazione standard delle spese per i dottorati
	 * @return deviazione standard delle spese per i dottorati
	 */
	public double stdspesa_dottorato() {
		double avg = this.avgspesa_dottorato();
		double scarto = 0;
		int i = 0;
		for(Dati elem : dati) {
			scarto += Math.pow(elem.getDati_spesa().getSpesa_dottorato()-avg,2);
			i++;
		}
		return Math.sqrt(scarto/i);
	}
	/**
	 * Metodo ausiliario che calcola la deviazione standard delle spese per le specializzazioni
	 * @return deviazione sstandard delle spese per le specializzazioni
	 */
	public double stdspesa_specializzazione() {
		double avg = this.avgspesa_specializzazione();
		double scarto = 0;
		int i = 0;
		for(Dati elem : dati) {
			scarto += Math.pow(elem.getDati_spesa().getSpesa_specializzazione()-avg,2);
			i++;
		}
		return Math.sqrt(scarto/i);
	}
	/**
	 * Metodo ausiliario che calcola la somma delle spese per le lauree
	 * @return somma delle spese per le lauree
	 */
	public int sumspesa_laurea() {
		int sum = 0;
		for(Dati elem : dati) {
			sum += elem.getDati_spesa().getSpesa_laurea();
		}
		return sum;
	}
	/**
	 * Metodo ausiliario che calcola la somma delle spese per i dottorati
	 * @return somma delle spese per i dottorti
	 */
	public int sumspesa_dottorato() {
		int sum = 0;
		for(Dati elem : dati) {
			sum += elem.getDati_spesa().getSpesa_dottorato();
		}
		return sum;
	}
	/**
	 * Mrtodo ausiliario che calcola la somma delle spese per le specializzazioni
	 * @return somma delle spese per le specializzazioni
	 */
	public int sumspesa_specializzazione() {
		int sum = 0;
		for(Dati elem : dati) {
			sum += elem.getDati_spesa().getSpesa_specializzazione();
		}
		return sum;
	}
	/**
	 * Metodo ausiliario che conta le spese effettuate
	 * @return spese effettuate
	 */
	public int count() {
		return dati.size();
	}
	//getters and setters
	public Vector<Dati> getDati() {
		return dati;
	}

	public void setDati(Vector<Dati> dati) {
		this.dati = dati;
	}
}