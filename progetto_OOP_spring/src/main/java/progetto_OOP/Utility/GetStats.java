package progetto_OOP.Utility;

import java.util.Vector;

import progetto_OOP.Stats.Stats;
import progetto_OOP.Stats.StatsNum;
import progetto_OOP.Stats.StatsStr;
import progetto_OOP.StrutturaDati.BancaDati;
/**
 * Classe contenente metodi utili alla creazione di vettori con oggetti di tipo Stats
 */
public class GetStats {
	/**
	 * Metodo ausiliario che crea e restituisce un vettore di oggetti di tipo Stats
	 * @param dati oggetto BancaDati sui quali elementi saranno effettuate le operazioni statistiche
	 * @return vettore di elementi di tipo Stats
	 */
	public static Vector<Stats> getstats(BancaDati dati) {
		Vector<Stats> stats = new Vector<Stats>();
		stats.add(new StatsStr("Codice Regione", ContaOccorrenze.contaOccorrenzeCodiceRegione(dati)));
		stats.add(new StatsStr("Nome Regione", ContaOccorrenze.contaOccorrenzeNomeRegione(dati)));
		stats.add(new StatsStr("Codice Ente", ContaOccorrenze.contaOccorrenzeCodiceEnte(dati)));
		stats.add(new StatsStr("Nome Ente", ContaOccorrenze.contaOccorrenzeNomeEnte(dati)));
		stats.add(new StatsStr("Codice Istituto", ContaOccorrenze.contaOccorrenzeCodiceIstituto(dati)));
		stats.add(new StatsStr("Nome Istituto", ContaOccorrenze.contaOccorrenzeNomeIstituto(dati)));
		stats.add(new StatsStr("Tipo Istituto", ContaOccorrenze.contaOccorrenzeTipoIstituto(dati)));
		stats.add(new StatsStr("Codice Spesa", ContaOccorrenze.contaOccorrenzeCodiceSpesa(dati)));
		stats.add(new StatsStr("Nome Spesa", ContaOccorrenze.contaOccorrenzeNomeSpesa(dati)));
		stats.add(new StatsNum("spesa_laurea",dati.avgspesa_laurea(), dati.minspesa_laurea(), dati.maxspesa_laurea(), dati.stdspesa_laurea(),dati.sumspesa_laurea(), dati.countspesa_laurea()));
		stats.add(new StatsNum("spesa_dottorato",dati.avgspesa_dottorato(), dati.minspesa_dottorato(), dati.maxspesa_dottorato(), dati.stdspesa_laurea(),dati.sumspesa_dottorato(), dati.countspesa_dottorato()));
		stats.add(new StatsNum("spesa_specializzazione",dati.avgspesa_specializzazione(), dati.minspesa_specializzazione(), dati.maxspesa_specializzazione(), dati.stdspesa_specializzazione(),dati.sumspesa_specializzazione(), dati.countspesa_specializzazione()));
	return stats;
	}
}