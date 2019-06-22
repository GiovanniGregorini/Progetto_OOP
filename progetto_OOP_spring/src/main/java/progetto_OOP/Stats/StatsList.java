package progetto_OOP.Stats;

import java.util.Vector;

import progetto_OOP.Stats.Stats;

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