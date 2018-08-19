package com.demo;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.MessageProducer;
import javax.jms.ObjectMessage;
import javax.jms.Session;

import com.demo.model.Foo;

@Singleton
@Startup
public class ProducerBean {
	//can use di
	@Resource(name="myTopicCF")
	private ConnectionFactory connectionFactory;
	
	@Resource(name="myTopic")
	private Destination destination;
	
    public ProducerBean() {}
    
    @PostConstruct
    public void Producter()
    {
		try
		{
			Connection connection=connectionFactory.createConnection();
			Session session=connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
			MessageProducer producer=session.createProducer(destination);
			
			Foo foo=new Foo("Information.....");
			
			ObjectMessage message = session.createObjectMessage();
			message.setObject(foo);
			producer.send(message);
			
			System.out.println("Message send.");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
    
    }
}
