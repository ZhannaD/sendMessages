package com.zhanna.test.sendmessages.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zhanna.test.sendmessages.entity.Message;
import com.zhanna.test.sendmessages.service.SendMessagesService;
@RestController
@RequestMapping("/api/message")
public class ClientMessage {

	@Autowired
	// @Qualifier("sms")
	// @Qualifier("jms")
	private SendMessagesService service;

	@PostMapping
	public ResponseEntity<Void> sendMessage(@RequestBody Message message) {
		System.out.println(message.toString());
		service.findByType(message.getType());
		// service.findByType(message.getType());
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
