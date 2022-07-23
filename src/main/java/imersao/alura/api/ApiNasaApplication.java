package imersao.alura.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiNasaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiNasaApplication.class, args);
		System.out.println("Servidor Online!");
	}

}
