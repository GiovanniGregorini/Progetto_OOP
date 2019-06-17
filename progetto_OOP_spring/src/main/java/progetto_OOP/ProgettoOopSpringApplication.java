package progetto_OOP;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import progetto_OOP.classes.JsonGetDecode;

@SpringBootApplication
public class ProgettoOopSpringApplication {

	public static void main(String[] args) {
		//se non sono già stati scaricati i CSV viene effettuato il download
		JsonGetDecode.main(args);
		
		SpringApplication.run(ProgettoOopSpringApplication.class, args);
	}
}