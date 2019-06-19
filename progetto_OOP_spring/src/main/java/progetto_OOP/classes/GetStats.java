package progetto_OOP.classes;

import java.util.Vector;

public class GetStats {
	public static Vector<Stats> getstats(BancaDati dati) {
		Vector<Stats> stats = new Vector<Stats>();
		stats.add(new StatsNum("spesa_laurea",dati.avgspesa_laurea(), dati.minspesa_laurea(), dati.maxspesa_laurea(), dati.stdspesa_laurea(),dati.sumspesa_laurea(), dati.count()));
		stats.add(new StatsNum("spesa_dottorato",dati.avgspesa_dottorato(), dati.minspesa_dottorato(), dati.maxspesa_dottorato(), dati.stdspesa_laurea(),dati.sumspesa_dottorato(), dati.count()));
		stats.add(new StatsNum("spesa_specializzazione",dati.avgspesa_specializzazione(), dati.minspesa_specializzazione(), dati.maxspesa_specializzazione(), dati.stdspesa_specializzazione(),dati.sumspesa_specializzazione(), dati.count()));
		stats.add(new StatsStr("Regione", ContaOccorrenze.contaOccorrenze(dati)));
	return stats;
	}
}