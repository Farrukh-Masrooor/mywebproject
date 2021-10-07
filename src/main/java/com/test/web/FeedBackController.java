package com.test.web;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.test.beans.FeedBack;
import com.test.services.FeedBackService;

@Path("/feedbacks")
public class FeedBackController {
    FeedBackService feedBackService= new FeedBackService();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<FeedBack> getfeedBack(){
     
      return feedBackService.getAllFeedBacks();
    }
}
