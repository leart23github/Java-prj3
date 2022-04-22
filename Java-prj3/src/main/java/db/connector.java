package db;
import java.sql.Connection;
import java.sql.DriverManager;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Fujitsu
 */
public class connector {
    public static Connection getConnection() throws Exception
         
    {
        Class.forName("com.mysql.jdbc.Driver");
        Connection cn=(Connection)
        DriverManager.getConnection("jdbc:mysql://localhost:4306/mediateka","root","");
     
     
       return cn;
    }
}
