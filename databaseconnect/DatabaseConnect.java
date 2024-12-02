/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package databaseconnect;

/**
 *
 * @author reeca
 */
import java.sql.*;

public class DatabaseConnect {
    
   private static final String url= "jdbc:mysql://localhost:3306/mydb";
    private static final String username= "root";
    private static final String password= "DATABASE@99#99";

   
    public static void main(String[] args)
    {
       try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           
       }
       catch(ClassNotFoundException e){
           System.out.println(e.getMessage());
       }
       
       try{
           Connection connection = DriverManager.getConnection(url,username,password);
           
           Statement statement = connection.createStatement();
            String query = "select *from students";
            
            ResultSet result = statement.executeQuery(query);
            
            while(result.next())
            {
                int id = result.getInt("id");
                String name = result.getString("name");
                int age = result.getInt("age");
                double marks = result.getDouble("marks");
                
                System.out.println("id"+id);
                
                System.out.println("name"+name);
                
                System.out.println("age"+age);
                
                System.out.println("marks"+marks);
                
                
            }
           
           
           
       }
       catch(SQLException o)
       {
           System.out.println(o.getMessage());
       }
        
    }
    
}
