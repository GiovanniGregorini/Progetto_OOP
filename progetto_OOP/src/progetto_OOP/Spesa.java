package progetto_OOP;

/**
 * Classe Spesa derivata dalla classe Info che contiene informazioni sulle spese effettuate dai vari enti regionali in un anno
 */
public class Spesa extends Info {
	private int spesa_laurea;
	private int spesa_dottorato;
	private int spesa_specializzazione;
	
	/**
	 * Costruttore della classe Spesa
	 * @param codice Codice Spesa
	 * @param nome Descrizione della  Spesa
	 * @param spesa_laurea Spesa per laurea
	 * @param spesa_dottorato Spesa per dottorato 
	 * @param spesa_specializzazione Spesa per specializzzzione
	 */
	public Spesa(String codice, String nome, int spesa_laurea, int spesa_dottorato, int spesa_specializzazione) {
		super(codice, nome);
		this.spesa_laurea = spesa_laurea;
		this.spesa_dottorato = spesa_dottorato;
		this.spesa_specializzazione = spesa_specializzazione;
	}
	public int ottieni_spesa_laurea() {
		return this.spesa_laurea;
	}
	public int ottieni_spesa_dottorato() {
		return this.spesa_dottorato;
	}
	public int ottieni_spesa_specializzazione() {
		return this.spesa_specializzazione;
	}
}