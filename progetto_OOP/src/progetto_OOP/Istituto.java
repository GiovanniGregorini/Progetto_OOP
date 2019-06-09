package progetto_OOP;

public class Istituto extends Info {
	private String tipo_istituto;
	
	public Istituto(String codice, String nome, String tipo_istituto) {
		super(codice, nome);
		this.tipo_istituto = tipo_istituto;
	}
	public String ottieni_tipo_istituto() {
		return this.tipo_istituto;
	}
}