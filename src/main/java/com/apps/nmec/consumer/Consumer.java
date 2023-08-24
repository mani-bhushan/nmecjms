package com.apps.nmec.consumer;

import javax.jms.Queue;

import com.apps.nmec.responses.StudentResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/consume")
public class Consumer {

	@Autowired
	private JmsTemplate jmsTemplate;

	@Autowired
	private Queue queue;

	@GetMapping("/message")
	public StudentResponse consumeMessage() {

		StudentResponse student = null;
		try {
			ObjectMapper mapper = new ObjectMapper();
			String jsonMessage = (String) jmsTemplate.receiveAndConvert(queue);
			student = mapper.readValue(jsonMessage, StudentResponse.class);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return student;
	}
}