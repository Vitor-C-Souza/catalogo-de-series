package br.com.project.catalogodeseries;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.project.catalogodeseries.model.DadosSerie;
import br.com.project.catalogodeseries.service.ConsumoApi;
import br.com.project.catalogodeseries.service.ConverterDados;

@SpringBootApplication
public class CatalogoDeSeriesApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CatalogoDeSeriesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		ConsumoApi consumoApi = new ConsumoApi();
		var json = consumoApi.obterDados("https://www.omdbapi.com/?t=gilmore+girls&apikey=6585022c");
//		System.out.println(json);
//		json = consumoApi.obterDados("https://coffee.alexflipnote.dev/random.json");
		System.out.println(json);
		ConverterDados conversor = new ConverterDados();
		DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
		System.out.println(dados);
	}





	

}
