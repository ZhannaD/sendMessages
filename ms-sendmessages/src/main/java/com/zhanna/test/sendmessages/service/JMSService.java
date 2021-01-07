package com.zhanna.test.sendmessages.service;

import org.springframework.stereotype.Component;

import com.zhanna.test.sendmessages.entity.MessageType;

@Component
public class JMSService implements MessageService {

	@Override
	public void sendMessage() {
		System.out.println("Sending JMS message ....");

	}

	@Override
	public MessageType getMessageType() {
		return MessageType.JMS;

	}
}
