package progetto_OOP.classes;

import java.util.Vector;
import progetto_OOP.classes.Stats;

public class StatsList {
	private Vector<Stats> stats;

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