package com.Demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class iex  extends HttpServlet{

	/**
	 * 
	 */
	private boolean see  = true ; 
	
	private static final long serialVersionUID = 1L;
	public void service(HttpServletRequest rs , HttpServletResponse rp) throws ServletException, IOException{

		
		help4.man(rs);
		rp.setContentType("text/html");  
		PrintWriter out = rp.getWriter();
		out.print("<center> Question Uploaded  !!! </center>");
		RequestDispatcher rd=rs.getRequestDispatcher("iexam");  
	    rd.include(rs,rp);
	
	}	
		
		
		
		
	}
	
	
	
	

