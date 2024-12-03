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
public class insert_database {
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
            String query = String.format("INSERT INTO students(name,age,marks)VALUES('%s',%o,%f)","devin",19,70.5);
            
           int  rowsAff = statement.executeUpdate(query); //to retrive we use  executeQuery() and to insert we use executeUpdate()
            
           if(rowsAff>0)
           {
               System.out.println("rows affected succesfully");
           }else{
               System.out.println("not affected");
           }
           
           
           
       }
       catch(SQLException o)
       {
           System.out.println(o.getMessage());
       }
        
    }
    
    
}
