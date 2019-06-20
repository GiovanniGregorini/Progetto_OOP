package progetto_OOP.classes;

import java.util.Vector;
import progetto_OOP.classes.Stats;

/**
 * Classe StatsList contenente un vettore di oggetti Stats
 */
public class StatsList {
	private Vector<Stats> stats;
	/**
	 * Costruttore della classe StatsList
	 * @param stats vettore di oggetti Stats
	 */
	public StatsList(Vector<Stats> stats) {
		this.stats = stats;
	}
	//getters and setters
	public Vector<Stats> getStats() {
		return stats;
	}
	public void setStats(Vector<Stats> stats) {
		this.stats = stats;
	}
}