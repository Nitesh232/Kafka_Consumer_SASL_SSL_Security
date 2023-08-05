package com.nitesh.springboot.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.nitesh.springboot.model.SampleMessage;

@Service
public class KafkaService {

	
	
	@KafkaListener(topics = "${app.kafka.consumer.topic}", groupId = "${spring.kafka.consumer.group-id}")
	public SampleMessage listner(SampleMessage message) {
		System.out.println("Message recieved :: "+message+ " :: successfully listening");
		return message;
	}
}
