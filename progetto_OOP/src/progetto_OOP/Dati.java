package progetto_OOP;
/**
 * 
 * Classe Dati contenente tutte le informazioni relative agli organismi di gestione per il diritto allo studio universitario nelle varie regioni d'Italia
 *
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
	//getter anno solare
	public int ottieni_anno_solare() {
		return this.anno_solare;
	}
	//getter regione
	public String ottieni_codice_regione() {
		return this.dati_regione.ottieni_codice();
	}
	public String ottieni_nome_regione() {
		return this.dati_regione.ottieni_nome();
	}
	// getter ente
	public String ottieni_codice_ente() {
		return this.dati_ente.ottieni_codice();
	}
	public String ottieni_nome_ente() {
		return this.dati_ente.ottieni_nome();
	}
	// getter istituto
	public String ottieni_codice_istituto() {
		return this.dati_istituto.ottieni_codice();
	}
	public String ottieni_nome_istituto() {
		return this.dati_istituto.ottieni_nome();
	}
	public String ottieni_tipo_istituto() {
		return this.dati_istituto.ottieni_tipo_istituto();
	}
	//getter spesa
	public String ottieni_codice_spesa() {
		return this.dati_spesa.ottieni_codice();
	}
	public String ottieni_descrizione_spesa() {
		return this.dati_spesa.ottieni_nome();
	}
	public int ottieni_spesa_laurea() {
		return this.dati_spesa.ottieni_spesa_laurea();
	}
	public int ottieni_spesa_dottorato() {
		return this.dati_spesa.ottieni_spesa_dottorato();
	}
	public int ottieni_spesa_specializzazione() {
		return this.dati_spesa.ottieni_spesa_specializzazione();
	}
	public String stampa(){
		return ""+this.ottieni_anno_solare() + " "+ this.ottieni_codice_regione() + " " + this.ottieni_nome_regione() + " " + this.ottieni_codice_ente() + " " + this.ottieni_nome_ente() + " " + this.ottieni_codice_istituto() + " " + this.ottieni_nome_istituto() + " " + this.ottieni_tipo_istituto() + " " + this.ottieni_codice_spesa() + " " + this.ottieni_descrizione_spesa() + " " + this.ottieni_spesa_laurea() + " " + this.ottieni_spesa_dottorato() + " " + this.ottieni_spesa_specializzazione();   
	}
}