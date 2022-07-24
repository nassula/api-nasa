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
		
		
		
		//Aqui fiz uma adaptação do programa gerador de figurinhas para on invés de gerar figurarinhas, popular a base de dados da minha API que esta online com informações da api da nasa
		//Código comentado pois é usado apenas uma vez
		//caso vc esteja usando esse código, não rode o o código abaixo antes de trocar a url da api na classe ClientHttp.java
		/*
		String url = "https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY&start_date=2022-06-01&end_date=2022-07-24";
		
		NasaExtractor extractor = new NasaExtractor();
		
		
		ClientHttp http = new ClientHttp();
		String json = http.searchData(url);
        
        String result = extractor.extractInfo(json);
        */

	}

}
