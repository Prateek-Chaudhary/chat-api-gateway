package com.prateek.gateway.chat_gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ChatGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChatGatewayApplication.class, args);
	}

}
