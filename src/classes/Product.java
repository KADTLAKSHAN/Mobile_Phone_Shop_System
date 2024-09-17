package classes;

import database.MyConnection;
import javax.swing.JOptionPane;

/**
 *
 * @author tharindulakshan
 */
public class Product {
    
    private String productID;
    private String productName;
    private double productPrice;
    private int quantity;
    private String model;
    private String categoryFK;
    private String brandFK;

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCategoryFK() {
        return categoryFK;
    }

    public void setCategoryFK(String categoryFK) {
        this.categoryFK = categoryFK;
    }

    public String getBrandFK() {
        return brandFK;
    }

    public void setBrandFK(String brandFK) {
        this.brandFK = brandFK;
    }
    
    
    public boolean addProduct(){
        
        String sql = "INSERT INTO tblProduct VALUES(?,?,?,?,?,?,?)";
        
        try {
            
            MyConnection.getConnection();
            MyConnection.pst = MyConnection.con.prepareStatement(sql);
            
            MyConnection.pst.setString(1, productID);
            MyConnection.pst.setString(2, productName);
            MyConnection.pst.setDouble(3, productPrice);
            MyConnection.pst.setInt(4, quantity);
            MyConnection.pst.setString(5, model);
            MyConnection.pst.setString(6, categoryFK);
            MyConnection.pst.setString(7, brandFK);
            
            
            if(MyConnection.pst.executeUpdate() == 1){
                MyConnection.con.close();
                return true;
            }
            
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "DB_ADD_PRODUCT_ERROR: " + e, "PRODUCT INSERT ERROR", JOptionPane.ERROR_MESSAGE);
            
        }
        
        return false;
        
    }
    
    
    public boolean deleteProduct(){
        
        String sql = "DELETE FROM tblProduct WHERE productID=?";
        
        try {
            
            MyConnection.getConnection();
            MyConnection.pst = MyConnection.con.prepareStatement(sql);
            
            MyConnection.pst.setString(1, productID);
            
            if(MyConnection.pst.executeUpdate() == 1){
                MyConnection.con.close();
                return true;
            }
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "DB_DELETE_PRODUCT_ERROR: " + e, "PRODUCT DELETE ERROR", JOptionPane.ERROR_MESSAGE);
            
        }
        
        return false;
        
    }
    
    public boolean updateProduct(){
        
        String sql = "UPDATE tblProduct SET productName=?, productPrice=?, quantity=?, model=?, categoryFK=?, brandFK=? WHERE productID=?";
        
        try {
            
            MyConnection.getConnection();
            MyConnection.pst = MyConnection.con.prepareStatement(sql);
            
            MyConnection.pst.setString(1, productName);
            MyConnection.pst.setDouble(2, productPrice);
            MyConnection.pst.setInt(3, quantity);
            MyConnection.pst.setString(4, model);
            MyConnection.pst.setString(5, categoryFK);
            MyConnection.pst.setString(6, brandFK);
            MyConnection.pst.setString(7, productID);
            
            if(MyConnection.pst.executeUpdate() == 1){
                MyConnection.con.close();
                return true;
            }
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "DB_UPDATE_PRODUCT_ERROR: " + e, "PRODUCT UPDATE ERROR", JOptionPane.ERROR_MESSAGE);
            
        }
        
        return false;
        
    }
    
    public boolean searchProduct(){
        
        String sql = "SELECT * FROM tblProduct WHERE productID=? OR productName=?";
        
        try {
            
            MyConnection.getConnection();
            MyConnection.pst = MyConnection.con.prepareStatement(sql);
            MyConnection.pst.setString(1, productID);
            MyConnection.pst.setString(2, productName);
            
            MyConnection.rs = MyConnection.pst.executeQuery();
            
            if(MyConnection.rs.isBeforeFirst()){
                MyConnection.rs.first();
                
                productID = (MyConnection.rs.getString(1));
                productName = (MyConnection.rs.getString(2));
                productPrice = (MyConnection.rs.getDouble(3));
                quantity = (MyConnection.rs.getInt(4));
                model =(MyConnection.rs.getString(5));
                categoryFK =(MyConnection.rs.getString(6));
                brandFK = (MyConnection.rs.getString(7));
                
                
                
                
                return true;
            }
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "DB_SEARCH_PRODUCT_ERROR: " + e, "PRODUCT SEARCH ERROR", JOptionPane.ERROR_MESSAGE);
            
        }
        
        return false;
        
    }
    
    public String categorySearchByName(String catName){
        
        String sql = "SELECT categoryID FROM tblCategory WHERE categoryName=?";
        
        try {
            
            MyConnection.getConnection();
            MyConnection.pst = MyConnection.con.prepareStatement(sql);
            MyConnection.pst.setString(1, catName);
            
            MyConnection.rs = MyConnection.pst.executeQuery();
            
            if(MyConnection.rs.isBeforeFirst()){
                MyConnection.rs.first();
                
                categoryFK = MyConnection.rs.getString(1);
                MyConnection.con.close();
                return categoryFK;
                
            }
            
            
            
        } catch (Exception e) {
            
            System.out.println("CATEGORY SEARCH BY CATEGORY NAME FUNCTION ERROR IN PRODCUT CLASS" + e.getMessage());
            
        }
        
        return null;
        
    }
    
    public String categorySearchByID(String cateID){
        
        String sql = "SELECT categoryName FROM tblCategory WHERE categoryID=?";
        String categoryName;
        
        try {
            
            MyConnection.getConnection();
            MyConnection.pst = MyConnection.con.prepareStatement(sql);
            MyConnection.pst.setString(1, cateID);
            
            MyConnection.rs2 = MyConnection.pst.executeQuery();
            
            if(MyConnection.rs2.isBeforeFirst()){
                MyConnection.rs2.first();
                
                categoryName = MyConnection.rs2.getString(1);
                MyConnection.con.close();
                return categoryName;
                
            }
            
            
            
        } catch (Exception e) {
            
            System.out.println("CATEGORY SEARCH BY categoryID FUNCTION ERROR IN PRODUCT CLASS" + e.getMessage());
            
        }
        
        return null;
        
    }
    
    public String brandSearchByName(String brandName){
        
        String sql = "SELECT brandID FROM tblBrand WHERE brandName=?";
        
        try {
            
            MyConnection.getConnection();
            MyConnection.pst = MyConnection.con.prepareStatement(sql);
            MyConnection.pst.setString(1, brandName);
            
            MyConnection.rs = MyConnection.pst.executeQuery();
            
            if(MyConnection.rs.isBeforeFirst()){
                MyConnection.rs.first();
                
                brandFK = MyConnection.rs.getString(1);
                MyConnection.con.close();
                return brandFK;
                
            }
            
            
            
        } catch (Exception e) {
            
            System.out.println("BRAND SEARCH BY BRAND NAME FUNCTION ERROR IN PRODUCT CLASS" + e.getMessage());
            
        }
        
        return null;
        
    }
    
    public String brandSearchByID(String brandID){
        
        String sql = "SELECT brandName FROM tblBrand WHERE brandID=?";
        String brandName;
        
        try {
            
            MyConnection.getConnection();
            MyConnection.pst = MyConnection.con.prepareStatement(sql);
            MyConnection.pst.setString(1, brandID);
            
            MyConnection.rs2 = MyConnection.pst.executeQuery();
            
            if(MyConnection.rs2.isBeforeFirst()){
                MyConnection.rs2.first();
                
                brandName = MyConnection.rs2.getString(1);
                MyConnection.con.close();
                return brandName;
                
            }
            
            
            
        } catch (Exception e) {
            
            System.out.println("BRAND SEARCH BY brandID FUNCTION ERROR IN DESIGNATION CLASS" + e.getMessage());
            
        }
        
        return null;
        
    }
    
    
    
    public void viewAll(){
        String sql = "SELECT * FROM tblProduct prod INNER JOIN tblCategory cate on prod.categoryFK = cate.categoryID INNER JOIN tblBrand b on b.brandID = prod.brandFK";
        
        try {
            
            MyConnection.getConnection();
            MyConnection.pst = MyConnection.con.prepareStatement(sql);
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "DB_PRODUCT_VIEW_ALL_ERROR: " + e, "PRODUCT VIEW ALL ERROR", JOptionPane.ERROR_MESSAGE);
            
        }
    }
    
    
    public boolean updateProductQuantityOnly(int quantity,String id){
        
        String sql = "UPDATE tblProduct SET quantity=quantity+? WHERE productID=?";
        
        try {
            
            MyConnection.getConnection();
            MyConnection.pst = MyConnection.con.prepareStatement(sql);
            
            MyConnection.pst.setInt(1, quantity);
            MyConnection.pst.setString(2, id);
            
            if(MyConnection.pst.executeUpdate() == 1){
                MyConnection.con.close();
                return true;
            }
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "DB_UPDATE_PRODUCT_ERROR: " + e, "PRODUCT UPDATE ERROR", JOptionPane.ERROR_MESSAGE);
            
        }
        
        return false;
        
    }
    
    
}
