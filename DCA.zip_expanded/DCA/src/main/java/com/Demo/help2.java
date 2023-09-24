package com.Demo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class help2 {
	static void  man(String username , String password , String email) {
		Connection connection = null;

        try {
            // below two lines are used for connectivity.
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/demo",
                "root", "root");
 
            // mydb is database
            // mydbuser is name of database
            // mydbuser is password of database
 
            Statement statement;
            statement = connection.createStatement();
            ResultSet resultSet;
            String sql = " insert into demo_res(id,name,password,email)"
            	    + " values (null,?, ?, ?)";
            PreparedStatement preparedStmt = connection.prepareStatement(sql);
            preparedStmt.setString (1, username);
            preparedStmt.setString (2, password);
            preparedStmt.setString  (3, email);
            System.out.println(username) ;
            System.out.println(password) ;
            System.out.println(email) ;
            
            preparedStmt.execute();
            connection.commit();
            connection.close();
            
        }
        catch (Exception exception) {
            
        }
		
	}

}