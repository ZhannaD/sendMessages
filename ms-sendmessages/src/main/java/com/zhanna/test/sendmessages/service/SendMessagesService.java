package com.zhanna.test.sendmessages.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhanna.test.sendmessages.entity.MessageType;

@Service
public class SendMessagesService {

	@Autowired
	private MessageFactory messageFactory;

	public void findByType(MessageType type) {

		MessageService message = messageFactory.find(type);

		message.sendMessage();;
	}
}