package com.zhanna.test.sendmessages.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.zhanna.test.sendmessages.entity.MessageType;

@Component
public class MessageFactory {

	private Map<MessageType, MessageService> services;

	@Autowired
	public MessageFactory(Set<MessageService> sendService) {
		createStrategy(sendService);
	}

	public MessageService find(MessageType messageType) {
		return services.get(messageType);
	}
	private void createStrategy(Set<MessageService> sendService) {
		services = new HashMap<MessageType, MessageService>();
		sendService.forEach(
				service -> services.put(service.getMessageType(), service));
	}
}
