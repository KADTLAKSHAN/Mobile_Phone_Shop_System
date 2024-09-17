package classes;

import database.MyConnection;
import javax.swing.JOptionPane;

/**
 *
 * @author tharindulakshan
 */
public class Admin extends User{
    
    public boolean addUser(){
        
        String sql = "INSERT INTO tblUser VALUES(?,?,?)";
        
        try {
            
            MyConnection.getConnection();
            MyConnection.pst = MyConnection.con.prepareStatement(sql);
            
            MyConnection.pst.setString(1, super.getUserName());
            MyConnection.pst.setString(2, super.getUserPassword());
            MyConnection.pst.setString(3, super.getUserType());
            
            if(MyConnection.pst.executeUpdate() == 1){
                MyConnection.con.close();
                return true;
            }
            
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "DB_ADD_USER_ERROR: " + e, "USER INSERT ERROR", JOptionPane.ERROR_MESSAGE);
            
        }
        
        return false;
        
    }
    
    
    public boolean deleteUser(){
        
        String sql = "DELETE FROM tblUser WHERE userName=?";
        
        try {
            
            MyConnection.getConnection();
            MyConnection.pst = MyConnection.con.prepareStatement(sql);
            
            MyConnection.pst.setString(1, super.getUserName());
            
            if(MyConnection.pst.executeUpdate() == 1){
                MyConnection.con.close();
                return true;
            }
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "DB_DELETE_USER_ERROR: " + e, "USER DELETE ERROR", JOptionPane.ERROR_MESSAGE);
            
        }
        
        return false;
        
    }
    
    public boolean updateUser(){
        
        String sql = "UPDATE tblUser SET userPassword=?, userType=? WHERE userName=?";
        
        try {
            
            MyConnection.getConnection();
            MyConnection.pst = MyConnection.con.prepareStatement(sql);
            
            MyConnection.pst.setString(1, super.getUserPassword());
            MyConnection.pst.setString(2, super.getUserType());
            MyConnection.pst.setString(3, super.getUserName());
            
            if(MyConnection.pst.executeUpdate() == 1){
                MyConnection.con.close();
                return true;
            }
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "DB_UPDATE_USER_ERROR: " + e, "USER UPDATE ERROR", JOptionPane.ERROR_MESSAGE);
            
        }
        
        return false;
        
    }
    
    public boolean searchUser(){
        
        String sql = "SELECT * FROM tblUser WHERE userName=?";
        
        try {
            
            MyConnection.getConnection();
            MyConnection.pst = MyConnection.con.prepareStatement(sql);
            MyConnection.pst.setString(1, super.getUserName());
            
            MyConnection.rs = MyConnection.pst.executeQuery();
            
            if(MyConnection.rs.isBeforeFirst()){
                MyConnection.rs.first();
                
                super.setUserName(MyConnection.rs.getString(1));
                super.setUserPassword(MyConnection.rs.getString(2));
                super.setUserType(MyConnection.rs.getString(3));
                
                
                
                return true;
            }
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "DB_SEARCH_USER_ERROR: " + e, "USER SEARCH ERROR", JOptionPane.ERROR_MESSAGE);
            
        }
        
        return false;
        
    }
    
    
    public void searchUserByType(){
        
        String sql = "SELECT * FROM tblUser WHERE userType=?";
        
        try {
            
            MyConnection.getConnection();
            MyConnection.pst = MyConnection.con.prepareStatement(sql);
            MyConnection.pst.setString(1, super.getUserType());
            
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "DB_SEARCH_USER_ERROR: " + e, "USER SEARCH ERROR", JOptionPane.ERROR_MESSAGE);
            
        }
        
    }
    
    public void viewAll(){
        String sql = "SELECT * FROM tblUser";
        
        try {
            
            MyConnection.getConnection();
            MyConnection.pst = MyConnection.con.prepareStatement(sql);
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "DB_USER_VIEW_ALL_ERROR: " + e, "USER VIEW ALL ERROR", JOptionPane.ERROR_MESSAGE);
            
        }
    }
    
}
