package com.example.somnatela;

import com.example.somnatela.principal.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SomnatelaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SomnatelaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Principal principal = new Principal();
		principal.exibeMenu();



	}
}
