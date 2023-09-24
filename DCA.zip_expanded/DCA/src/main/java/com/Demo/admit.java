package com.Demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class admit  extends HttpServlet{

	/**
	 * 
	 */
	private boolean see  = true ; 
	
	private static final long serialVersionUID = 1L;
	public void service(HttpServletRequest rs , HttpServletResponse rp) throws ServletException, IOException{

		
		help3.man(rs);
		rp.setContentType("text/html");  
		PrintWriter out = rp.getWriter();
		out.print("<center> Successful filled form  !!! </center>");
		RequestDispatcher rd=rs.getRequestDispatcher("admission");  
	    rd.include(rs,rp);
	
	}	
		
		
		
		
	}
	
	
	
	

