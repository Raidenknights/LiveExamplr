package com.example.manas.LiveEmaple.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerListner {
	
	@Autowired
	KafkaConsumerElasticSearch kafkaConsumerElasticSearch;

	@KafkaListener(topics = "first_topic", groupId = "my-first-app")
	public void consume(String message)  {
		try {
			System.out.println(message);
			kafkaConsumerElasticSearch.connectToElasticSearch(message);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
