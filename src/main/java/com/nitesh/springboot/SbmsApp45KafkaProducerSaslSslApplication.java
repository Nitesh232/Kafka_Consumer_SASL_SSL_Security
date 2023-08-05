package com.nitesh.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class SbmsApp45KafkaProducerSaslSslApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbmsApp45KafkaProducerSaslSslApplication.class, args);
	}

}
