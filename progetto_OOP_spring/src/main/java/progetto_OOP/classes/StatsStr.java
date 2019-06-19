package progetto_OOP.classes;
 
import java.util.Map; 

public class StatsStr extends Stats {

	private Map<String, Integer> occorrenze;

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
