package com.examen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatController {
	
	@GetMapping("/")
	public String showChatPage() {
		return "chat";
	}
}