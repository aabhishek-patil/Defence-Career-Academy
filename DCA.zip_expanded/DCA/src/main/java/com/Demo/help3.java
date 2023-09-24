package com.Demo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.http.HttpServletRequest;

public class help3 {
	static void  man(HttpServletRequest rs) {
		Connection connection = null;

        try {
            // below two lines are used for connectivity.
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/demo",
                "root", "password");
            String name  = rs.getParameter("fname") ;
            String  lname = rs.getParameter("lname") ;
            String mname  = rs.getParameter("mname") ;
            String faname   = rs.getParameter("faname") ;
            String add  = rs.getParameter("add") ;
            String gender  = rs.getParameter("i") ;
            String Xmarks   = rs.getParameter("mark1") ;
            String Xii_Marks  = rs.getParameter("markss") ;
            String course  = rs.getParameter("drop") ;
            String  dob = rs.getParameter("dob") ;
            String pincode  = rs.getParameter("pincode") ;
            String email  = rs.getParameter("email") ;
            
            Statement statement;
            statement = connection.createStatement();
            ResultSet resultSet;
            String sql = " insert into admission(id ,fname,lname,mname,faname,addr,gender,Xmarks,Xii_Marks,course,dob,pincode,email)"
            	    + " values (null,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement preparedStmt = connection.prepareStatement(sql);
            preparedStmt.setString (1, name);
            preparedStmt.setString (2, lname);
            preparedStmt.setString  (3, mname);
            preparedStmt.setString (4, faname);
            preparedStmt.setString (5, add);
            preparedStmt.setString  (6, gender);
            preparedStmt.setString  (7, Xmarks);
            preparedStmt.setString (8, Xii_Marks);
            preparedStmt.setString (9, course);
            preparedStmt.setString (10, dob);
            preparedStmt.setString  (11, pincode);
            preparedStmt.setString (12, email);
            System.out.println(name) ;
            System.out.println(lname) ;
            System.out.println(mname) ;
            System.out.println(faname) ;
            System.out.println(add) ;
            System.out.println(gender) ;
            System.out.println(Xmarks) ;
            System.out.println(Xii_Marks) ;
            System.out.println(course) ;
            System.out.println(dob) ;
            System.out.println(pincode) ;
            System.out.println(email) ;
            preparedStmt.execute();
            connection.commit();
            connection.close();
            
            
        }
        catch (Exception exception) {
            
        }
		
	}

}