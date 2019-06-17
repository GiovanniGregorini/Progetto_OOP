package progetto_OOP.classes;

import java.util.Vector;

public class Metadata {
	private Vector<Metadato> metadata;

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