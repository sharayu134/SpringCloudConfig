package com.finzly.configclient.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@RequestMapping("/read")
public class MessageReadController {
	
	@Value("${message: Default Message}") 
	public String message;
	
	@GetMapping("/message")
    public String message() {
        return message;
    }

}
