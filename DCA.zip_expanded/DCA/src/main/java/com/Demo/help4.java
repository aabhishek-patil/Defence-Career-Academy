package com.Demo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.http.HttpServletRequest;

public class help4 {
	static void  man(HttpServletRequest rs) {
		Connection connection = null;

        try {
            // below two lines are used for connectivity.
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/demo",
                "root", "password");
            String course  = rs.getParameter("course") ;
            String question = rs.getParameter("que") ;
            Integer mark  = Integer.parseInt(rs.getParameter("mark")) ;
            String option1   = rs.getParameter("op1") ;
            String option2  = rs.getParameter("op2") ;
            String option3  = rs.getParameter("op3") ;
            String option4   = rs.getParameter("op4") ;
            String cans  = rs.getParameter("ans") ;
            
            Statement statement;
            statement = connection.createStatement();
            ResultSet resultSet;
            String sql = " insert into iquestion(course,question_id,question,mark,option1,option2,option3,option4,cans)"
            	    + " values (?,null,?,?,?,?,?,?,?)";
            PreparedStatement preparedStmt = connection.prepareStatement(sql);
            preparedStmt.setString (1, course);
            preparedStmt.setString (2, question);
            preparedStmt.setInt  (3, mark);
            preparedStmt.setString (4, option1);
            preparedStmt.setString (5, option2);
            preparedStmt.setString  (6, option3);
            preparedStmt.setString  (7, option4);
            preparedStmt.setString (8, cans);
           
            System.out.println(course) ;
            System.out.println(question) ;
            System.out.println(mark) ;
            System.out.println(option1) ;
            System.out.println(option2) ;
            System.out.println(option3) ;
            System.out.println(option4) ;
            System.out.println(cans) ;
            preparedStmt.execute();
            connection.commit();
            connection.close();
            
            
        }
        catch (Exception exception) {
            
        }
		
	}

}