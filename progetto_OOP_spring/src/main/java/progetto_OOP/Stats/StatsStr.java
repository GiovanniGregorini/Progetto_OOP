package progetto_OOP.Stats;
 
import java.util.Map; 
/**
 * Classe Statistica per elementi si tipo String, deriva dalla classe Stats
 */
public class StatsStr extends Stats {

	private Map<String, Integer> occorrenze;
	/**
	 * costruttore della classe StatsStr
	 * @param field campo sul quale andranno effettuate le operazioni statistiche
	 * @param occorrenze occorrenze di ogni elemento unico
	 */
	public StatsStr(String field, Map<String, Integer> occorrenze) {
		super(field);
		this.occorrenze = occorrenze;
	}
	//geters and setters
	public Map<String, Integer> getOccorrenze() {
		return occorrenze;
	}

	public void setOccorrenze(Map<String, Integer> occorrenze) {
		this.occorrenze = occorrenze;
	}
}
