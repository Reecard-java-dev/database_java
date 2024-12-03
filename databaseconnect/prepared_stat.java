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
public class prepared_stat {
    
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
           
           String query = "INSERT INTO students(name,age,marks)VALUES(?,?,?)";
           
           PreparedStatement preparedstatement = connection.prepareStatement(query);//query is compiled in sql 
           preparedstatement.setString(1, "ciff");
           preparedstatement.setInt(2, 20);
           preparedstatement.setDouble(3, 55.9);
           
           int rowsAff = preparedstatement.executeUpdate();//query executed
           
           if(rowsAff>0)
           {
               System.out.println("row affected sucessfully");
           }else{
               System.out.println(" row isnt affected");
           }
           
           
           
       }
       catch(SQLException o)
       {
           System.out.println(o.getMessage());
       }
       
       }
        
    
 }
