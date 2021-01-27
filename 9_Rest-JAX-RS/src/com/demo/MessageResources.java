/*
 * 
 */
package com.demo;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

// TODO: Auto-generated Javadoc
/**
 * The Class MessageResources.
 */
@Path("/messages")
public class MessageResources {

/**
 * Gets the message.
 *
 * @return the message
 */
@GET
@Produces(MediaType.TEXT_PLAIN)
public String getMessage(){
	return "hello";
}
}