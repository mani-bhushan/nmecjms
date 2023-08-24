package com.apps.nmec.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class AutoConsumer {

	private static final Logger logger = LoggerFactory.getLogger(AutoConsumer.class);

	//@JmsListener(destination = "nmec-jms-queue")
	public void consumeMessage(String message) {
		logger.info("Message received from activemq queue---" + message);

	}
}