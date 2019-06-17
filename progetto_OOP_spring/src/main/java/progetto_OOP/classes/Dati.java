package progetto_OOP.classes;
/**
 * Classe Dati contenente tutte le informazioni relative agli organismi di gestione per il diritto allo studio universitario nelle varie regioni d'Italia
 */
public class Dati {
	private int anno_solare;
	private Regione dati_regione;
	private Ente dati_ente;
	private Istituto dati_istituto;
	private Spesa dati_spesa;
	
	/**
	 * Costruttore della classe Dati
	 * @param anno_solare anno solare
	 * @param codice_regione codice della regione
	 * @param nome_regione nome della regione
	 * @param codice_ente codice dell'ente
	 * @param nome_ente nome dell'ente
	 * @param codice_istituto codice dell'istituto
	 * @param nome_istituto nome dell'istituto
	 * @param tipo_istituto tipologia dell'istituto
	 * @param codice_spesa codice spesa
	 * @param descrizione_spesa descrizione della spesa
	 * @param spesa_laurea spesa per laura
	 * @param spesa_dottorato spesa per dottorato
	 * @param spesa_specializzazione spesa per specializzazione
	 */
	public Dati(int anno_solare, String codice_regione, String nome_regione, String codice_ente, String nome_ente, String codice_istituto, String nome_istituto, String tipo_istituto, String codice_spesa, String descrizione_spesa, int spesa_laurea, int spesa_dottorato, int spesa_specializzazione) {
		this.anno_solare = anno_solare;
		this.dati_regione = new Regione(codice_regione, nome_regione);
		this.dati_ente = new Ente(codice_ente, nome_ente);
		this.dati_istituto = new Istituto(codice_istituto, nome_istituto, tipo_istituto);
		this.dati_spesa = new Spesa(codice_spesa, descrizione_spesa, spesa_laurea, spesa_dottorato, spesa_specializzazione);
	}
	//getters and setters
	public int getAnno_solare() {
		return anno_solare;
	}

	public void setAnno_solare(int anno_solare) {
		this.anno_solare = anno_solare;
	}

	public Regione getDati_regione() {
		return dati_regione;
	}

	public void setDati_regione(Regione dati_regione) {
		this.dati_regione = dati_regione;
	}

	public Ente getDati_ente() {
		return dati_ente;
	}

	public void setDati_ente(Ente dati_ente) {
		this.dati_ente = dati_ente;
	}

	public Istituto getDati_istituto() {
		return dati_istituto;
	}

	public void setDati_istituto(Istituto dati_istituto) {
		this.dati_istituto = dati_istituto;
	}

	public Spesa getDati_spesa() {
		return dati_spesa;
	}

	public void setDati_spesa(Spesa dati_spesa) {
		this.dati_spesa = dati_spesa;
	}
}