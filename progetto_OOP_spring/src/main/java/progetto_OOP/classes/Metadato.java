package progetto_OOP.classes;

/**
 * Classe Metadato, rappresenta un attributo di una classe e contiene le sue informazioni
 */
public class Metadato {
	private String alias;
	private String sourceField;
	private String type;
	/**
	 * Costruttore della classe Metadato
	 * @param alias attributo
	 * @param sourceField descrizione atributo
	 * @param type tipo dell'attributo
	 */
	public Metadato(String alias, String sourceField, String type) {
		this.alias = alias;
		this.sourceField = sourceField;
		this.type = type;
	}

	//getters and setters
	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getSourceField() {
		return sourceField;
	}

	public void setSourceField(String sourceField) {
		this.sourceField = sourceField;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}