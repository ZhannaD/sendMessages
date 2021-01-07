package com.zhanna.test.sendmessages.service;

import com.zhanna.test.sendmessages.entity.MessageType;

public interface MessageService {
	void sendMessage();
	MessageType getMessageType();
}
