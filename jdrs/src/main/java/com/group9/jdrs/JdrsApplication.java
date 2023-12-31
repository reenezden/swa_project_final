package com.group9.jdrs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class JdrsApplication {

	public static void main(String[] args) {

		SpringApplication.run(JdrsApplication.class, args);
	}
}
