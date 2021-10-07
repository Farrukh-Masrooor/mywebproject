package com.test.web;
/*
import javax.ws.rs.GET;  
import javax.ws.rs.Path;  
import javax.ws.rs.Produces;  
import javax.ws.rs.core.MediaType; 

@Path("/")
public class HelloServlet{
	
	@Get
	@Produces(MediaType.TEXT_HTML)
	public String helloFromJaxRs(){
	return "hello from jax -rs web services";
	}

}
*/

import javax.ws.rs.GET;  
import javax.ws.rs.Path;  
import javax.ws.rs.Produces;  
import javax.ws.rs.core.MediaType;  
@Path("/")  
public class HelloServlet{  
 
  // This method is called if XML is requested  
  @GET  
  public String sayXMLHello() {  
    return "<?xml version=\"1.0\"?>" + "<hello> Hello Jersey" + "</hello>";  
  }  
  
  
}   