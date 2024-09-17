package classes;

import database.MyConnection;
import javax.swing.JOptionPane;

/**
 *
 * @author tharindulakshan
 */
public class Category {
    
    private String categoryID;
    private String categoryName;

    public String getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(String categoryID) {
        this.categoryID = categoryID;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
    
    public boolean addCategory(){
        
        String sql = "INSERT INTO tblCategory VALUES(?,?)";
        
        try {
            
            MyConnection.getConnection();
            MyConnection.pst = MyConnection.con.prepareStatement(sql);
            
            MyConnection.pst.setString(1, categoryID);
            MyConnection.pst.setString(2, categoryName);
            
            if(MyConnection.pst.executeUpdate() == 1){
                MyConnection.con.close();
                return true;
            }
            
            
        } catch (Exception e) {
            
            System.out.println("DB_ADD_CATEGORY_ERROR: " + e);
        }
        
        return false;
        
    }
    
    
    public boolean deleteCategory(){
        
        String sql = "DELETE FROM tblCategory WHERE categoryID=?";
        
        try {
            
            MyConnection.getConnection();
            MyConnection.pst = MyConnection.con.prepareStatement(sql);
            
            MyConnection.pst.setString(1, categoryID);
            
            if(MyConnection.pst.executeUpdate() == 1){
                MyConnection.con.close();
                return true;
            }
            
        } catch (Exception e) {
            
            System.out.println("DB_DELETE_CATEGORY_ERROR: " + e);
            
        }
        
        return false;
        
    }
    
    public boolean updateCategory(){
        
        String sql = "UPDATE tblCategory SET categoryName=? WHERE categoryID=?";
        
        try {
            
            MyConnection.getConnection();
            MyConnection.pst = MyConnection.con.prepareStatement(sql);
            
            MyConnection.pst.setString(1, categoryName);
            MyConnection.pst.setString(2, categoryID);
            
            if(MyConnection.pst.executeUpdate() == 1){
                MyConnection.con.close();
                return true;
            }
            
        } catch (Exception e) {
            
            System.out.println("DB_UPDATE_CATEGORY_ERROR: " + e);
            
        }
        
        return false;
        
    }
    
    public boolean searchCategory(){
        
        String sql = "SELECT * FROM tblCategory WHERE categoryID=? OR categoryName=?";
        
        try {
            
            MyConnection.getConnection();
            MyConnection.pst = MyConnection.con.prepareStatement(sql);
            MyConnection.pst.setString(1, categoryID);
            MyConnection.pst.setString(2, categoryName);
            
            MyConnection.rs = MyConnection.pst.executeQuery();
            
            if(MyConnection.rs.isBeforeFirst()){
                MyConnection.rs.first();
                
                categoryID = (MyConnection.rs.getString(1));
                categoryName = (MyConnection.rs.getString(2));
                
                
                return true;
            }
            
        } catch (Exception e) {
            
            System.out.println("DB_SEARCH_CATEGORY_ERROR: " + e);
            
        }
        
        return false;
        
    }
    
    
    public void viewAll(){
        String sql = "SELECT * FROM tblCategory";
        
        try {
            
            MyConnection.getConnection();
            MyConnection.pst = MyConnection.con.prepareStatement(sql);
            
        } catch (Exception e) {
            
            System.out.println("DB_VIEW_ALL_CATEGORY_ERROR: " + e);
            
        }
    }
    
    
    
    
}
