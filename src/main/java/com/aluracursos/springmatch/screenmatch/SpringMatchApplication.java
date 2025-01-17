package com.aluracursos.springmatch.screenmatch;

import com.aluracursos.springmatch.screenmatch.model.DatosEpisodio;
import com.aluracursos.springmatch.screenmatch.model.DatosSerie;
import com.aluracursos.springmatch.screenmatch.model.DatosTemporada;
import com.aluracursos.springmatch.screenmatch.principal.Principal;
import com.aluracursos.springmatch.screenmatch.service.ConsumoAPI;
import com.aluracursos.springmatch.screenmatch.service.ConvierteDatos;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SpringMatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringMatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal=new Principal();
		principal.muestraElMenu();

		//EjemploStreams ejemploStreams=new EjemploStreams();
		//ejemploStreams.muestraEjemplo();
	}

}
