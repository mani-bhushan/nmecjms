package com.apps.nmec.producer;

import javax.jms.Queue;

import com.apps.nmec.requests.StudentRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/produce")
public class Producer {

	@Autowired
	private JmsTemplate jmsTemplate;

	@Autowired
	private Queue queue;

	@PostMapping("/message")
	public StudentRequest sendMessage(@RequestBody StudentRequest student) {

		try {
			ObjectMapper mapper = new ObjectMapper();
			String studentAsJson = mapper.writeValueAsString(student);

			jmsTemplate.convertAndSend(queue, studentAsJson);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return student;
	}
}