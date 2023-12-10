package com.dailycodebuffer.cabbookuser.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	KafkaTemplate<String, Object> kafkaTemplate;
	
	@KafkaListener(topics = "cab-location", groupId = "user-group")
	public void updateLocation(String location) {
		System.out.println("Location coordinates are ::"+location);
	}
	
}
