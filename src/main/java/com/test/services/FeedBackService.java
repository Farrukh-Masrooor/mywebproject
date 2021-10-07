package com.test.services;

import java.util.ArrayList;
import java.util.List;

import com.test.beans.FeedBack;

public class FeedBackService {
    
    public List<FeedBack> getAllFeedBacks(){
        List<FeedBack> feedBacks= new ArrayList<>();
        feedBacks.add(new FeedBack("redmi", 3));
        feedBacks.add(new FeedBack("oppo", 3));
        feedBacks.add(new FeedBack("nokia", 4));
        return feedBacks;
    }
}
