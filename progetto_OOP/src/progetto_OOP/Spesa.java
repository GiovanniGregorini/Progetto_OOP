package progetto_OOP;

public class Spesa extends Info {
	private int spesa_laurea;
	private int spesa_dottorato;
	private int spesa_specializzazione;
	
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