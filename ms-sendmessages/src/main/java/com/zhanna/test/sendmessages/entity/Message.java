package com.zhanna.test.sendmessages.entity;

import java.io.Serializable;

import lombok.Data;

@Data
public class Message implements Serializable {
	private MessageType type;
	private String message;
}
