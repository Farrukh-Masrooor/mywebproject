package com.test.web;

import javax.ws.rs.GET;  
import javax.ws.rs.Path;  

import javax.ws.rs.core.Response;  
import com.test.beans.*;
@Path("/")  
public class HelloServlet{  
 
  // This method is called if XML is requested  
  @GET  
  public String sayXMLHello() {  
    return "<?xml version=\"1.0\"?>" + "<hello> Hello Jersey" + "</hello>";  

  }  

  @GET
  @Path("/feedback")
  public Response getfeedBack(){
   
    return Response.status(Response.Status.OK).build();
  }
 
  
}   