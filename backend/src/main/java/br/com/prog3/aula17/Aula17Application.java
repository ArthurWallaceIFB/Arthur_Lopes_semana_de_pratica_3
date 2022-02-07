package br.com.prog3.aula17;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan("br.com.prog3.aula17.domain")
@SpringBootApplication
public class Aula17Application {
	public static void main(String[] args) {
		SpringApplication.run(Aula17Application.class, args);
	}
}
