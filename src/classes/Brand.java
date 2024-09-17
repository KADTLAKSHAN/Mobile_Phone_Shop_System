package classes;

import database.MyConnection;

/**
 *
 * @author tharindulakshan
 */
public class Brand {
    
    private String brandID;
    private String brandName;

    public String getBrandID() {
        return brandID;
    }

    public void setBrandID(String brandID) {
        this.brandID = brandID;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
    
    public boolean addBrand(){
        
        String sql = "INSERT INTO tblBrand VALUES(?,?)";
        
        try {
            
            MyConnection.getConnection();
            MyConnection.pst = MyConnection.con.prepareStatement(sql);
            
            MyConnection.pst.setString(1, brandID);
            MyConnection.pst.setString(2, brandName);
            
            if(MyConnection.pst.executeUpdate() == 1){
                MyConnection.con.close();
                return true;
            }
            
            
        } catch (Exception e) {
            
            System.out.println("DB_ADD_BRAND_ERROR: " + e);
        }
        
        return false;
        
    }
    
    
    public boolean deleteBrand(){
        
        String sql = "DELETE FROM tblBrand WHERE brandID=?";
        
        try {
            
            MyConnection.getConnection();
            MyConnection.pst = MyConnection.con.prepareStatement(sql);
            
            MyConnection.pst.setString(1, brandID);
            
            if(MyConnection.pst.executeUpdate() == 1){
                MyConnection.con.close();
                return true;
            }
            
        } catch (Exception e) {
            
            System.out.println("DB_DELETE_BRAND_ERROR: " + e);
            
        }
        
        return false;
        
    }
    
    public boolean updateBrand(){
        
        String sql = "UPDATE tblBrand SET brandName=? WHERE brandID=?";
        
        try {
            
            MyConnection.getConnection();
            MyConnection.pst = MyConnection.con.prepareStatement(sql);
            
            MyConnection.pst.setString(1, brandName);
            MyConnection.pst.setString(2, brandID);
            
            if(MyConnection.pst.executeUpdate() == 1){
                MyConnection.con.close();
                return true;
            }
            
        } catch (Exception e) {
            
            System.out.println("DB_UPDATE_BRAND_ERROR: " + e);
            
        }
        
        return false;
        
    }
    
    public boolean searchBrand(){
        
        String sql = "SELECT * FROM tblBrand WHERE brandID=? OR brandName=?";
        
        try {
            
            MyConnection.getConnection();
            MyConnection.pst = MyConnection.con.prepareStatement(sql);
            MyConnection.pst.setString(1, brandID);
            MyConnection.pst.setString(2, brandName);
            
            MyConnection.rs = MyConnection.pst.executeQuery();
            
            if(MyConnection.rs.isBeforeFirst()){
                MyConnection.rs.first();
                
                brandID = (MyConnection.rs.getString(1));
                brandName = (MyConnection.rs.getString(2));
                
                
                return true;
            }
            
        } catch (Exception e) {
            
            System.out.println("DB_SEARCH_BRAND_ERROR: " + e);
            
        }
        
        return false;
        
    }
    
    
    public void viewAll(){
        String sql = "SELECT * FROM tblBrand";
        
        try {
            
            MyConnection.getConnection();
            MyConnection.pst = MyConnection.con.prepareStatement(sql);
            
        } catch (Exception e) {
            
            System.out.println("DB_VIEW_ALL_BRAND_ERROR: " + e);
            
        }
    }
    
}
