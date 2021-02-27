package com.kvks;

import javax.jms.Queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.boot.CommandLineRunner;


public class MessageSender implements CommandLineRunner{

   @Autowired
   private JmsMessagingTemplate jmsMessagingTemplate;

   @Autowired
    private Queue queue;

   @Override
    public void run(String... arg0) throws Exception {
        this.jmsMessagingTemplate.convertAndSend(this.queue, "Hi from kvks");
        System.out.println("Message has been put to queue by sender");

    }
}
