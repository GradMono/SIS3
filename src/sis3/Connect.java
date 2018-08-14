/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sis3;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


/**
 *
 * @author Jerone
 */
public class Connect {
    Connection conn=null;
    
    
    public static Connection ConnectDb(){
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://162.217.144.39:3306/remdb","ivan4103","41032018");
             JOptionPane.showMessageDialog(null,"Connection Established");
            return conn;
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
            return null;
            
            
        }
        }
    
}
