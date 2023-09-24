package com.Demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class resisters  extends HttpServlet{

	/**
	 * 
	 */
	private boolean see  = true ; 
	
	private static final long serialVersionUID = 1L;
	public void doPost(HttpServletRequest rs , HttpServletResponse rp) throws ServletException, IOException{
		
		String username = rs.getParameter("username" ) ; 
		String password = rs.getParameter("password") ;
		String email = rs.getParameter("email") ;
		help2.man(username, password, email);
		
		rp.setContentType("text/html");  
		PrintWriter out = rp.getWriter();
		out.print("<br><br><br><br><br><center> Successful resister !!! </center>");
		RequestDispatcher rd=rs.getRequestDispatcher("register.html");  
	    rd.include(rs,rp); 
		
		
		
	}
	
	public void  service(HttpServletRequest rs , HttpServletResponse rp) throws IOException, ServletException{
		 if(see) {
		 see = false ; 
		 RequestDispatcher rd=rs.getRequestDispatcher("register.html");  
	     rd.include(rs,rp); }
		 else {
			 doPost(rs,rp) ; 
		 }
	}
	

}