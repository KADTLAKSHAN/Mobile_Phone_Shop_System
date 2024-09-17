package classes;

import database.MyConnection;
import javax.swing.JOptionPane;

/**
 *
 * @author tharindulakshan
 */
public class Cart {
    
    public double CalculateTotalPrice(double productPrice, int productQuantity){
        
        return (productPrice * productQuantity);
        
    }
    
    public boolean checkStockAvailability(String productID, int noOfItems){
        
        String sql = "SELECT * FROM tblProduct WHERE productID=?";
        
        try {
            
            MyConnection.getConnection();
            MyConnection.pst = MyConnection.con.prepareStatement(sql);
            MyConnection.pst.setString(1, productID);
            MyConnection.rs = MyConnection.pst.executeQuery();
            
            if(MyConnection.rs.isBeforeFirst()){
                MyConnection.rs.first();
                
                if(MyConnection.rs.getInt("quantity") >= noOfItems){
                    return true;
                }else{
                    JOptionPane.showMessageDialog(null, "Stock not available - "+ MyConnection.rs.getInt("quantity")+" left");
                    return false;
                }
                
            }
            
            
        } catch (Exception e) {
            System.out.println("checkStockAvailability Function Error: " + e);
        }
        
        return false;
        
    }
    
}
