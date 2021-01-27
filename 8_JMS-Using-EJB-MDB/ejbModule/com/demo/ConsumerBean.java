package com.demo;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;
import javax.jms.TextMessage;

import com.demo.model.Foo;

@MessageDriven(mappedName="myTopic", activationConfig ={ 
	    @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Topic"),
	    @ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Auto-acknowledge")
		})
public class ConsumerBean implements MessageListener {

   
    public ConsumerBean() { }
	
	
    public void onMessage(Message message) {
       if(message instanceof ObjectMessage){
    	   ObjectMessage tMessage=(ObjectMessage) message;
    	   try {
			System.out.println("got:"+((Foo)tMessage.getObject()).getData());
		} catch (JMSException e) {
			e.printStackTrace();
		}
       }
    }

}