package progetto_OOP.classes;

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
	//getters and setters
	public int getSpesa_laurea() {
		return spesa_laurea;
	}

	public void setSpesa_laurea(int spesa_laurea) {
		this.spesa_laurea = spesa_laurea;
	}

	public int getSpesa_dottorato() {
		return spesa_dottorato;
	}

	public void setSpesa_dottorato(int spesa_dottorato) {
		this.spesa_dottorato = spesa_dottorato;
	}

	public int getSpesa_specializzazione() {
		return spesa_specializzazione;
	}

	public void setSpesa_specializzazione(int spesa_specializzazione) {
		this.spesa_specializzazione = spesa_specializzazione;
	}
}