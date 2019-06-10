package progetto_OOP;

/**
 * 
 * Classe Istituto derivata dalla classe Info contenente informazioni su un istituto
 *
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
	public String ottieni_tipo_istituto() {
		return this.tipo_istituto;
	}
}