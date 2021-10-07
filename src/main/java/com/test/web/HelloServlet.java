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

  @Get("/feedback")
  public Response getfeedBack(){
    List<FeedBack> feedbacks= new ArrayList<FeedBack>();
    feedbacks.add(new FeedBack("redmi8",7));
    feedbacks.add(new FeedBack("iphonex",8));
    feedbacks.add(new FeedBack("galaxym2",7));

    return Response.status(Response.Status.OK)
  }
 
  
}   