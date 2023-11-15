/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservation;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
/**
 *
 * @author Jm Lagarto
 */
public class Reservation {
  public static Connection myConn = null;
  public static PreparedStatement myPStmt = null;
  public static ResultSet myRs = null;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      connectDB();
        
       travel entry = new travel();
        entry.show();
    }
     public static void connectDB(){
        try {            
            Class.forName("com.mysql.jdbc.Driver"); 
            myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/travel", "root", "softoroom");

        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null,"Database Connection Error." + e.getMessage(),"Error", JOptionPane.ERROR_MESSAGE);            
        }
    }
        

  
            // Execute the query and get the results
          
            
            // Close the connection
        }    // TODO code application logic here
   
    

