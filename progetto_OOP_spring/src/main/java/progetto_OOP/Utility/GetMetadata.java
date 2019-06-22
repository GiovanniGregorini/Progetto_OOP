package progetto_OOP.Utility;

import java.util.Vector;

import progetto_OOP.Metadata.Metadato;

/**
 * Classe con metodi utili alla creazione di vettori contenenti oggetti Metadato
 */
public class GetMetadata {
	/**
	 * Metodo ausiliario che crea un vettore di oggetti Metadato
	 * @return metadata vettore di oggetti Metadato
	 */
	public static Vector<Metadato> getmetadata() {
		Vector<Metadato> metadata = new Vector<Metadato>();
		metadata.add(new Metadato("anno_solare", "anno solare", "integer"));
		metadata.add(new Metadato("codice", "codice dell'oggetto interessato", "string"));
		metadata.add(new Metadato("nome", "nome/descrizione dell'oggetto interessato", "string"));
		metadata.add(new Metadato("tipo_istituto", "tipologia dell'istituto", "string"));
		metadata.add(new Metadato("spesa_laurea", "spesa effettuata per le lauree", "integer"));
		metadata.add(new Metadato("spesa_dottorato", "spesa effettuata per i dottorati", "integer"));
		metadata.add(new Metadato("spesa_specializzazione", "spesa effettuata per le specializzazioni", "integer"));
		return metadata;
	}
}