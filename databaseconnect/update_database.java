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
public class update_database {
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
            String query = String.format("UPDATE students SET marks = %f WHERE id = %d",97.3,2);
            
           int  rowsAff = statement.executeUpdate(query); //to retrive we use  executeQuery() and to insert we use executeUpdate()
            
           if(rowsAff>0)
           {
               System.out.println("data inserted");
           }else{
               System.out.println("data not inserted");
           }
           
           
           
       }
       catch(SQLException o)
       {
           System.out.println(o.getMessage());
       }
        
    }
    
}
