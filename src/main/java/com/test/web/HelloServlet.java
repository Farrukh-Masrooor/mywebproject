package com.test.web;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

@Path("/")
public class HelloServlet extends HttpServlet {
	
	@Get
	public String helloFromJaxRs(){
	return "hello from jax -rs web services";
	}

}
