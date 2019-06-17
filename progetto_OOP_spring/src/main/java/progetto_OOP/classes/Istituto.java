package progetto_OOP.classes;

/**
 * Classe Istituto derivata dalla classe Info contenente informazioni su un istituto
 */

public class Istituto extends Info {
	private String tipo_istituto;
	
/**
 * Costruttore della classe Istituto
 * @param codice codice dell' istituto
 * @param nome nome dell' istituto
 * @param tipo_istituto tipologia dell' istituto
 */
	public Istituto(String codice, String nome, String tipo_istituto) {
		super(codice, nome);
		this.tipo_istituto = tipo_istituto;
	}
	//getters and setters
	public String getTipo_istituto() {
		return tipo_istituto;
	}
	public void setTipo_istituto(String tipo_istituto) {
		this.tipo_istituto = tipo_istituto;
	}
}