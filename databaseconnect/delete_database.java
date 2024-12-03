/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package databaseconnect;

/**
 *
 * @author reeca
 */
import java.sql.*;
public class delete_database {
    
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
            //String query = "select *from students";
            String query = String.format("DELETE FROM students WHERE id = %d",4);
            
           int  rowsAff = statement.executeUpdate(query); //to retrive we use  executeQuery() and to insert we use executeUpdate()
            
           if(rowsAff>0)
           {
               System.out.println("row deleted sucessfully");
           }else{
               System.out.println(" row isnt deleted");
           }
           
           
           
       }
       catch(SQLException o)
       {
           System.out.println(o.getMessage());
       }
        
    }
    
}
