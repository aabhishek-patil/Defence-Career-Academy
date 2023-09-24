package com.Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class help1 {
	
	static boolean  man(String username , String password ) {
		Connection connection = null;
		System.out.println("hiiihvhjvnbv") ; 
        try {
            // below two lines are used for connectivity.
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/demo",
                "root", "password");
 
            // mydb is databasex
            // mydbuser is name of database
            // mydbuser is password of database
 
            Statement statement;
            statement = connection.createStatement();
            ResultSet resultSet;
            resultSet = statement.executeQuery(
                "select * from logs");
            String  code;
            String title;
            while (resultSet.next()) {
                code = resultSet.getString("pass");
                title = resultSet.getString("name");
                if(code.equals(password) && username.equals(title)) { return true ;}   
            }
            connection.close();
            return false ; 
        }
        catch (Exception exception) {
            
        }
		return true;
	}

}