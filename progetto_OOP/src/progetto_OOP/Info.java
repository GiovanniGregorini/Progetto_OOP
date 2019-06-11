package progetto_OOP;
/**
 * 
 * Classe madre che contiene informazioni generali come codice e nome/descrizione
 *
 */
public class Info {
	private String codice;
	private String nome;
	
	/**
	 * Costruttore della classe Info
	 * @param codice codice
	 * @param nome nome/descrizione
	 */
	public Info(String codice, String nome) {
		this.codice = codice;
		this.nome = nome;
	}
	public String ottieni_codice() {
		return this.codice;
	}
	public String ottieni_nome() {
		return this.nome;
	}
}