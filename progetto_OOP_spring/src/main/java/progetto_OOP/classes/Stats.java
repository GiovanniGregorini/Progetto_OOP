package progetto_OOP.classes;

/**
 * Classe Statistica generale, contiene solo una stringa che indica il campo sul quale verranno effettuate le statistiche
 */
public class Stats {
	private String field;
	/**
	 * Costruttore della classe Stats
	 * @param field campo sul quale verranno effettuate le operazioni statistiche
	 */
	public Stats(String field) {
		this.field = field;
	}
	//getters and setters
	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}
}