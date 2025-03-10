package com.example.simpleCrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Classe de inicializacao do spring boot
 */
@SpringBootApplication
public class SimpleCrudApplication {

	/**
	 * Metodo de inicializacao main
	 * @param args Parametros do sistema
	 */
	public static void main(String[] args) {
		SpringApplication.run(SimpleCrudApplication.class, args);
		System.out.println("\n\n");
		System.out.println("============================");
		System.out.println("Microservice Ready for requests");
		System.out.println("============================");
		System.out.println("\n\n");
	}

}
