package progetto_OOP;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import progetto_OOP.Utility.JsonGetDecode;
/**
 * Application-Main del progetto, effettua il download del csv e grazie a Spring crea il network server
 */
@SpringBootApplication
public class ProgettoOopSpringApplication {

	/**
	 * Metodo main all'interno del quale vi è la chiamata al main di JsonGetDecode, grazie al quale viene effettuato il download del csv
	 * @param args argomento del main
	 */
	public static void main(String[] args) {
		//se non sono già stati scaricati i CSV viene effettuato il download
		JsonGetDecode.main(args);
		SpringApplication.run(ProgettoOopSpringApplication.class, args);
	}
}