package com.zhanna.test.sendmessages.service;

import org.springframework.stereotype.Component;

import com.zhanna.test.sendmessages.entity.MessageType;

@Component
public class SMSService implements MessageService {

	@Override
	public void sendMessage() {
		System.out.println("Sending SMS message ....");
	}
	@Override
	public MessageType getMessageType() {
		return MessageType.SMS;

	}
}
