package com.test.web;

import javax.ws.rs.GET;  
import javax.ws.rs.Path;  
import javax.ws.rs.Produces;  
import javax.ws.rs.core.MediaType; 

@Path("/")
public class HelloServlet extends HttpServlet {
	
	@Get
	public String helloFromJaxRs(){
	return "hello from jax -rs web services";
	}

}
