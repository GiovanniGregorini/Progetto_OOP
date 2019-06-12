package progetto_OOP;

import java.util.Vector;

public class BancaDati {
	
	private Vector<Dati> elenco;
	
	public BancaDati(Vector<Dati> elenco)
	{
		this.elenco = elenco;
	}
	
	public void stampa()
	{
		for(Dati i: elenco)
			System.out.println(i.stampa());
	}
	
}
