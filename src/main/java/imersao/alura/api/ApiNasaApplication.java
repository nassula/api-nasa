package imersao.alura.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import imersao.alura.api.resources.ClientHttp;
import imersao.alura.api.resources.NasaExtractor;

@SpringBootApplication
public class ApiNasaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiNasaApplication.class, args);
		System.out.println("Servidor Online!");
		
		String url = "https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY&start_date=2022-06-12&end_date=2022-06-14";
		
		NasaExtractor extractor = new NasaExtractor();
		
		/*
		ClientHttp http = new ClientHttp();
		String json = http.searchData(url);
        
        String result = extractor.extractInfo(json);
        */

	}

}
