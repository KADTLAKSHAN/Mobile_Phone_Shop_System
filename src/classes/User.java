package classes;

import database.MyConnection;
import javax.swing.JOptionPane;

/**
 *
 * @author tharindulakshan
 */
public class User {
    
    private int userID;
    private String userName;
    private String userPassword;
    private String userType;

    public User() {
        
        
    }

    public User(int userID, String userName, String userPassword, String userType) {
        this.userID = userID;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userType = userType;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
    
    public boolean userLogin(){
        
        String sql = "SELECT * FROM tblUser WHERE BINARY userName=? AND userPassword=? AND userType=?";
        
        try {
            
            MyConnection.getConnection();
            MyConnection.pst = MyConnection.con.prepareStatement(sql);
            
            MyConnection.pst.setString(1, userName);
            MyConnection.pst.setString(2, userPassword);
            MyConnection.pst.setString(3, userType);
            
            MyConnection.rs = MyConnection.pst.executeQuery();
            
            if(MyConnection.rs.isBeforeFirst()){
                
                MyConnection.rs.first();
                MyConnection.con.close();
                
                return true;
                
            }
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "DB_Login_ERROR: " + e, "Login Error", JOptionPane.ERROR_MESSAGE);
            
        }
        
        
        return false;
        
    }
    
}
