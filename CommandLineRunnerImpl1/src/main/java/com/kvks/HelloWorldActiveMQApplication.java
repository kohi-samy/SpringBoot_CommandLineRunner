package com.kvks;

import javax.jms.Queue;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.boot.CommandLineRunner;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootApplication
@EnableJms
public class HelloWorldActiveMQApplication implements CommandLineRunner{

	public static void main(String[] args) {

		SpringApplication.run(HelloWorldActiveMQApplication.class, args);
	}

	@Bean
	public Queue queue() {
		return new ActiveMQQueue("kvks.queue");
	}

	@Autowired
	MessageSender ms;

	@Override
	public void run(String... arg0) throws Exception {
		System.out.println("calling Method");
		ms.messageSend();
	}

}
