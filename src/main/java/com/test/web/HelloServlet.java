package com.test.web;

import javax.ws.rs.GET;  
import javax.ws.rs.Path;  


@Path("/")  
public class HelloServlet{  
 
  // This method is called if XML is requested  
  @GET  
  public String sayXMLHello() {  
    return "<?xml version=\"1.0\"?>" + "<hello> Hello Jersey" + "</hello>";  

  }  

 
 
  
}   