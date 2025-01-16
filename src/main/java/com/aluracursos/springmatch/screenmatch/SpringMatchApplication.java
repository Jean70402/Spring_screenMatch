package com.aluracursos.springmatch.screenmatch;

import com.aluracursos.springmatch.screenmatch.model.DatosSerie;
import com.aluracursos.springmatch.screenmatch.service.ConsumoAPI;
import com.aluracursos.springmatch.screenmatch.service.ConvierteDatos;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringMatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringMatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var consumoApi=new ConsumoAPI();
		var json=consumoApi.obtenerDatos("http://www.omdbapi.com/?t=Game+of+Thrones&apikey=46c724d8");
		//var json=consumoApi.obtenerDatos("https://coffee.alexflipnote.dev/random.json");
		System.out.println(json);
		ConvierteDatos conversor =new ConvierteDatos();
		var datos=conversor.obtenerDatos(json, DatosSerie.class);
		System.out.println(datos);
	}

}
