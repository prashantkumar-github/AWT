package com.prashant;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Addservlet extends HttpServlet
{
	public void service(HttpServletRequest req, HttpServletResponse res)
	{
		int i= Integer.parseInt(((ServletRequest) res).getParameter("num1"));
		int j= Integer.parseInt(req.getParameter("num2"));
		
		int k= i + j;
		System.out.println("result is " +k);
		
		
	}

}
