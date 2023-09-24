package com.Demo;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class check extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void  service(HttpServletRequest rs , HttpServletResponse rp) throws IOException, ServletException{
		String username = rs.getParameter("username" ) ; 
		String password = rs.getParameter("password") ;
		boolean answer = help1.man(username, password) ; 
		if(answer) {
			
			 RequestDispatcher rd=rs.getRequestDispatcher("home.html");  
		     rd.include(rs,rp);  
		}
		else {
		    rp.setContentType("text/html");  
			PrintWriter out = rp.getWriter();  
			out.print("Sorry username or password error");  
			 RequestDispatcher rd=rs.getRequestDispatcher("login.html");  
		     rd.include(rs,rp);
		}
		
	}

}