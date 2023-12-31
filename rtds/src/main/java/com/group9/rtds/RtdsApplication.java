package com.group9.rtds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableKafka
@EnableScheduling
//@EnableDiscoveryClient
public class RtdsApplication {

	public static void main(String[] args) {

		SpringApplication.run(RtdsApplication.class, args);
	}
}
