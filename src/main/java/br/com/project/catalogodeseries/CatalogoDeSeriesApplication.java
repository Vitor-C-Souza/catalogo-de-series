package br.com.project.catalogodeseries;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.project.catalogodeseries.main.Principal;

@SpringBootApplication
public class CatalogoDeSeriesApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CatalogoDeSeriesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var principal = new Principal();
		principal.exibeMenu();
	}





	

}
