package progetto_OOP.classes;

import java.util.Vector;

public class GetMetadata {
	
	public static Vector<Metadato> getmetadata() {
		Vector<Metadato> metadata = new Vector<Metadato>();
		metadata.add(new Metadato("anno_solare", "anno solare", "integer"));
		metadata.add(new Metadato("codice", "codice dell'oggetto interessato", "string"));
		metadata.add(new Metadato("nome", "nome dell'oggetto interessato", "string"));
		metadata.add(new Metadato("tipo_istituto", "tipologia dell'istituto", "string"));
		metadata.add(new Metadato("spesa_laurea", "spesa effettuata per lauree", "integer"));
		metadata.add(new Metadato("spesa_dottorato", "spesa effettuata per dottorati", "integer"));
		metadata.add(new Metadato("spesa_specializzazione", "spesa effettuata per specializzazioni", "integer"));
		return metadata;
	}
}