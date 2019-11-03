package com.br.pagamentos.buyprocess;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@SpringBootApplication
@EnableCircuitBreaker
public class ByprocessApplication {

	public static void main(String[] args) {
		SpringApplication.run(ByprocessApplication.class, args);
	}

}
