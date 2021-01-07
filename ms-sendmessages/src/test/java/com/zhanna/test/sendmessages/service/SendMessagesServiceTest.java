package com.zhanna.test.sendmessages.service;

import org.junit.jupiter.api.TestInstance;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@AutoConfigureMockMvc
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class SendMessagesServiceTest {
	// @Autowired
	// private MockMvc mvc;
	//
	// @Test
	// public void sendMessage() throws Exception {
	//
	// Message message = new Message();
	// message.setMessage("some message SMS...");
	// message.setType(MessageType.SMS);
	//
	// String json = "{\"type\":\"JMS\",\"message\":\"message JMS...\"}";
	//
	// this.mvc.perform(post("/api/message")
	// .contentType(MediaType.APPLICATION_JSON).content(json))
	// .andExpect(status().isOk());
	//
	// }
}
