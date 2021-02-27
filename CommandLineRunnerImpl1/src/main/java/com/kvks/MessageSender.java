package com.kvks;

import javax.jms.Queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

@Component
public class MessageSender {

   @Autowired
   private JmsMessagingTemplate jmsMessagingTemplate;

   @Autowired
    private Queue queue;

   public void messageSend() throws Exception {
       this.jmsMessagingTemplate.convertAndSend(this.queue, "Hi from kvks");
       System.out.println("Message has been put to queue by sender");
   }
}
