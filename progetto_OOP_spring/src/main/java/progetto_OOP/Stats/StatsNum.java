package progetto_OOP.Stats;

/**
 * Classe Statistica numerica che deriva dalla classe Stats
 */
public class StatsNum extends Stats {

	private double avg;
	private int min;
	private int max;
	private double std;
	private int sum;
	private int count;
	/**
	 * Costruttore della classe StatsNum
	 * @param field campo sul quale verranno effettuate le operazioni statistiche
	 * @param avg media
	 * @param min valore minimo
	 * @param max valore massimo
	 * @param std deviazione standard
	 * @param sum somma
	 * @param count conteggio degli elementi
	 */
	public StatsNum(String field, double avg, int min, int max, double std, int sum, int count) {
		
		super(field);
		this.avg = avg;
		this.min = min;
		this.max = max;
		this.std = std;
		this.sum = sum;
		this.count = count;
	}
	
	//getters and setters
	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public double getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public double getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public double getStd() {
		return std;
	}

	public void setStd(double std) {
		this.std = std;
	}

	public double getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
}
