package com.ra.recep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@ComponentScan(basePackages = "com.ra.recep")
@EnableJpaRepositories("com.ra.recep.persistence.repository")
public class RecepApplication {
	public static void main(String[] args) {
		SpringApplication.run(RecepApplication.class, args);
	}

}
