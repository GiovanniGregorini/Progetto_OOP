package progetto_OOP.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import progetto_OOP.classes.BancaDati;
import progetto_OOP.classes.GetMetadata;
import progetto_OOP.classes.GetStats;
import progetto_OOP.classes.LettoreCSV;
import progetto_OOP.classes.Metadata;
import progetto_OOP.classes.StatsList;

@RestController
public class Progetto_OopSpringController {
	
	private BancaDati dati = new BancaDati(LettoreCSV.ottieni_elenco());
	
	private Metadata metadata = new Metadata(GetMetadata.getmetadata());
	
	private StatsList stats = new StatsList(GetStats.getstats(dati));
	
	@RequestMapping("/")
	public String stampa() {
		return "Progetto_OOP comandi: /dati /metadata /stats";
	}

	@RequestMapping("/dati")
	public BancaDati ottieniBancadati() {
		return dati;
	}
	@RequestMapping("/metadata")
	public Metadata ottieniMetadata() {
		return metadata;
	}
	@RequestMapping("/stats")
	public StatsList ottieniStats() {
		return stats;
	}
}