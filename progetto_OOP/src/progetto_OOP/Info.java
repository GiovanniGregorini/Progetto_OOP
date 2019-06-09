package progetto_OOP;

public class Info {
	private String codice;
	private String nome;
	
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