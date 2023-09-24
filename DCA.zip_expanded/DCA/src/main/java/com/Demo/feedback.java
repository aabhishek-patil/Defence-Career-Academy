package com.Demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class feedback  extends HttpServlet{

	/**
	 * 
	 */
	private boolean see  = true ; 
	
	private static final long serialVersionUID = 1L;
	public void service(HttpServletRequest rs , HttpServletResponse rp) throws ServletException, IOException{
		RequestDispatcher rd=rs.getRequestDispatcher("feedback.html");  
	     rd.include(rs,rp); }	
		
		
		
		
	}
	
	
	
	

