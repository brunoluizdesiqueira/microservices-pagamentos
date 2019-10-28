package com.br.pagamentos.buyfeedback;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;

@SpringBootApplication
@EnableRedisRepositories
public class BuyfeedbackApplication {

	public static void main(String[] args) {
		SpringApplication.run(BuyfeedbackApplication.class, args);
	}

}
