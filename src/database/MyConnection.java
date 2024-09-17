package database;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author tharindulakshan
 */
public class MyConnection {
    
    public static Connection con = null;
    public static Statement st;
    public static PreparedStatement pst;
    public static ResultSet rs;
    public static ResultSet rs2;
    
    public static Connection getConnection(){
        
        try {
            
            con = DriverManager.getConnection("jdbc:mysql://localhost/db_mobile_phoneshop_eb","root","");
            st = con.createStatement();
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Database Connection error: " + e);
            
        }
        
        return con;
        
    }
    
    public static void clear(){
        con = null;
        st = null;
        pst = null;
    }
    
    
    
}
