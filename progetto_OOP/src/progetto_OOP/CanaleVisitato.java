package progetto_OOP;

public class CanaleVisitato {
	private int progressivo;
	private String canale_visitato;
	private int[] visite_mensili;
	
	//costruttore
	public CanaleVisitato(int progressivo, String canale_visitato, int[] visite_mensili) {
		this.progressivo = progressivo;
		this.canale_visitato = canale_visitato;
		this.visite_mensili = visite_mensili;
	}
	public int ottieni_progressivo() {
		return this.progressivo;
		}
	public String ottieni_canale_visitato() {
		return this.canale_visitato;
	}
	public int ottieni_visite_mensili(int mese) {
		return this.visite_mensili[mese-1];
	}
}	