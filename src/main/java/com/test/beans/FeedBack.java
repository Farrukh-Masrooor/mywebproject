package com.test.beans;

public class FeedBack{
    private String productName;
    private int rating;

    FeedBack(){}

    public FeedBack(String name, int i) {
        productName=name;
        rating=i;
    }

    public void setProductName(String name){this.productName=name;}
    public void setRating(int rating){this.rating=rating;}

}