/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg02;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Sangeevan
 */
public class Connection {
    
    java.sql.Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;
    
    void connecting()
    {
        try{
            
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentmanagementsystem","root","");//open a connection
            stmt = conn.createStatement();
            
           }catch(Exception e){
            e.printStackTrace();             
           }
    }
    
}
