package com.example.customruntimeroutingdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.function.context.MessageRoutingCallback;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.Message;

@SpringBootApplication
public class CustomRuntimeRoutingDemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(CustomRuntimeRoutingDemoApplication.class, args);
	}

	@Bean
	public MessageRoutingCallback customRouter() {
		return new MessageRoutingCallback() {
			@Override
			public FunctionRoutingResult routingResult(Message<?> message) {
				return new FunctionRoutingResult((String)message.getHeaders().get("Func-Name"));
			}
		};
	}
}
