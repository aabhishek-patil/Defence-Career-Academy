package com.Demo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class help5 {
	static  List<String> man() {
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
            resultSet = statement.executeQuery(
                "select * from admission");
            String name;
            String  lname ;
            String mname   ;
            String faname   ;
            String addr  ;
            String gender  ;
            String Xmarks    ;
            String Xii_Marks  ;
            String course  ;
            String  dob ;
            String pincode;
            String email  ;            
            List<String> parent = new ArrayList<>();
            List<String> child = new ArrayList<>();

            
            while (resultSet.next()) {
            	
                name = resultSet.getString("name");
                lname = resultSet.getString("lname");
                mname = resultSet.getString("mname");
                faname = resultSet.getString("faname");
                addr = resultSet.getString("addr");
                gender = resultSet.getString("gender");
                Xmarks = resultSet.getString("Xmarks");
                Xii_Marks = resultSet.getString("Xii_Marks");
                course = resultSet.getString("course");
                dob = resultSet.getString("dob");
                pincode = resultSet.getString("pincode");
                email = resultSet.getString("email");
                
                child.add(name);
                child.add(lname);
                child.add(mname);
                child.add(faname);
                child.add(addr);
                child.add(gender);
                child.add(Xmarks);
                child.add(Xii_Marks);
                child.add(course);
                child.add(dob);
                child.add(pincode);
                child.add(email);
                for(String i :child) {
                	parent.add(i);
        		}
                
                child.clear();    
            }
            
            connection.close();
            return parent ;
           
            
        }
        catch (Exception exception) {
            
        }
		return null;
		
	}

}