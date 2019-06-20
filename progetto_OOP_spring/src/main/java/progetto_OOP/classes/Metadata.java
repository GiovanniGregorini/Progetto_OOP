package progetto_OOP.classes;

import java.util.Vector;

/**
 * Classe Metadata contenente un vettore di oggetti Metadato
 */
public class Metadata {
	private Vector<Metadato> metadata;
	/**
	 * Costruttore della classe Metadata
	 * @param metadata vettore di oggetti Metadato
	 */
	public Metadata(Vector<Metadato> metadata) {
		this.metadata = metadata;
	}

	//getters and setters
	public Vector<Metadato> getMetadata() {
		return metadata;
	}

	public void setMetadata(Vector<Metadato> metadata) {
		this.metadata = metadata;
	}
}