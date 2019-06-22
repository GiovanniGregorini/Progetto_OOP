package progetto_OOP.StrutturaDati;
/** 
 * Classe madre che contiene informazioni generali come codice e nome/descrizione
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
	//getters and setters
	public String getCodice() {
		return codice;
	}
	public void setCodice(String codice) {
		this.codice = codice;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}