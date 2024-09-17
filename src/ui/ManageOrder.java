package ui;

import classes.Cart;
import classes.Order;
import classes.Product;
import database.MyConnection;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author tharindulakshan
 */
public class ManageOrder extends javax.swing.JFrame {

    private String orderID = "";
    private double finalTotalPrice = 0;

    /**
     * Creates new form ManageOrder
     */
    public ManageOrder() {
        initComponents();
        setLocationRelativeTo(null);
        disbleFields();
        viewAllProducts();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblManageOrderTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCart = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProduct = new javax.swing.JTable();
        lblCart = new javax.swing.JLabel();
        lblProductList = new javax.swing.JLabel();
        lblProductName = new javax.swing.JLabel();
        txtProductName = new javax.swing.JTextField();
        lblProductPrice = new javax.swing.JLabel();
        txtProductPrice = new javax.swing.JTextField();
        lblOrderQuantity = new javax.swing.JLabel();
        txtOrderQuantity = new javax.swing.JTextField();
        btnAddtoCart = new javax.swing.JButton();
        lblTotalAmountTitle = new javax.swing.JLabel();
        lblTotalAmount = new javax.swing.JLabel();
        lblCustomerName = new javax.swing.JLabel();
        txtCustomerName = new javax.swing.JTextField();
        lblCustomerMobileNumber = new javax.swing.JLabel();
        txtCustomerMobileNumber = new javax.swing.JTextField();
        btnReset = new javax.swing.JButton();
        btnCreateOrder = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        lblProductID = new javax.swing.JLabel();
        txtProductID = new javax.swing.JTextField();
        btnFind = new javax.swing.JButton();
        lblOrderBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblManageOrderTitle.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        lblManageOrderTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblManageOrderTitle.setText("Manage Order");
        getContentPane().add(lblManageOrderTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(557, 6, -1, -1));

        tblCart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Product Name", "Price", "Quantity", "Subtotal"
            }
        ));
        tblCart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCartMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCart);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 491, 522, 195));

        tblProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Price", "Quantity", "Model", "Category ID", "Category Name", "Brand ID", "Brand Name"
            }
        ));
        tblProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblProduct);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 69, 1293, 218));

        lblCart.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblCart.setForeground(new java.awt.Color(255, 255, 255));
        lblCart.setText("Cart - ! Click on the item to remove it from the cart");
        getContentPane().add(lblCart, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 467, -1, -1));

        lblProductList.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblProductList.setForeground(new java.awt.Color(255, 255, 255));
        lblProductList.setText("Product List");
        getContentPane().add(lblProductList, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        lblProductName.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblProductName.setForeground(new java.awt.Color(255, 255, 255));
        lblProductName.setText("Product Name");
        getContentPane().add(lblProductName, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 341, -1, -1));

        txtProductName.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        getContentPane().add(txtProductName, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 365, 257, -1));

        lblProductPrice.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblProductPrice.setForeground(new java.awt.Color(255, 255, 255));
        lblProductPrice.setText("Product Price");
        getContentPane().add(lblProductPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 287, -1, -1));

        txtProductPrice.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        getContentPane().add(txtProductPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 311, 154, -1));

        lblOrderQuantity.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblOrderQuantity.setForeground(new java.awt.Color(255, 255, 255));
        lblOrderQuantity.setText("Order Quantity");
        getContentPane().add(lblOrderQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 341, -1, -1));

        txtOrderQuantity.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        getContentPane().add(txtOrderQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 365, 257, -1));

        btnAddtoCart.setBackground(new java.awt.Color(0, 204, 204));
        btnAddtoCart.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnAddtoCart.setText("Add To Cart");
        btnAddtoCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddtoCartActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddtoCart, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 401, 257, -1));

        lblTotalAmountTitle.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblTotalAmountTitle.setText("Total Amount LKR:");
        getContentPane().add(lblTotalAmountTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(976, 311, -1, -1));

        lblTotalAmount.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblTotalAmount.setText("0000");
        getContentPane().add(lblTotalAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(1198, 311, -1, -1));

        lblCustomerName.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblCustomerName.setForeground(new java.awt.Color(255, 255, 255));
        lblCustomerName.setText("Customer Name");
        getContentPane().add(lblCustomerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 360, -1, -1));

        txtCustomerName.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        getContentPane().add(txtCustomerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 380, 400, -1));

        lblCustomerMobileNumber.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblCustomerMobileNumber.setForeground(new java.awt.Color(255, 255, 255));
        lblCustomerMobileNumber.setText("Customer Mobile Number");
        getContentPane().add(lblCustomerMobileNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 420, -1, -1));

        txtCustomerMobileNumber.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        getContentPane().add(txtCustomerMobileNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 440, 400, -1));

        btnReset.setBackground(new java.awt.Color(255, 153, 153));
        btnReset.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnReset.setText("RESET ORDER DETAILS");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        getContentPane().add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(924, 581, 410, 44));

        btnCreateOrder.setBackground(new java.awt.Color(102, 204, 0));
        btnCreateOrder.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnCreateOrder.setText("CREATE ORDER");
        btnCreateOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateOrderActionPerformed(evt);
            }
        });
        getContentPane().add(btnCreateOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(924, 518, 410, 44));

        btnClose.setBackground(new java.awt.Color(255, 51, 51));
        btnClose.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        getContentPane().add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(1265, 653, 120, 33));

        lblProductID.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblProductID.setForeground(new java.awt.Color(255, 255, 255));
        lblProductID.setText("Product ID");
        getContentPane().add(lblProductID, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 287, -1, -1));

        txtProductID.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        getContentPane().add(txtProductID, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 311, 257, -1));

        btnFind.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        btnFind.setText("FIND ITEM");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });
        getContentPane().add(btnFind, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 403, -1, -1));

        lblOrderBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ManagerOrder Background.jpg"))); // NOI18N
        getContentPane().add(lblOrderBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void tblProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductMouseClicked
        int index = tblProduct.getSelectedRow();
        TableModel model = tblProduct.getModel();

        String productID = model.getValueAt(index, 0).toString();
        txtProductID.setText(productID);

        String productName = model.getValueAt(index, 1).toString();
        txtProductName.setText(productName);

        String price = (model.getValueAt(index, 2).toString());
        txtProductPrice.setText(price);

        txtOrderQuantity.setEnabled(true);

    }//GEN-LAST:event_tblProductMouseClicked

    private void btnAddtoCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddtoCartActionPerformed

        if (checkEmptyFields()) {

            int noOfItems = Integer.parseInt(txtOrderQuantity.getText());

            if (noOfItems != 0) {

                String productID = txtProductID.getText();
                String productName = txtProductName.getText();
                double productPrice = Double.parseDouble(txtProductPrice.getText());

                boolean checkAvailability = true;

                Cart cart = new Cart();

                if (cart.checkStockAvailability(productID, noOfItems)) {

                    DefaultTableModel model = (DefaultTableModel) tblCart.getModel();

                    int rowCount = tblCart.getRowCount();

                    if (rowCount != 0) {

                        for (int i = 0; i < rowCount; i++) {

                            if (model.getValueAt(i, 0).equals(productID)) {
                                checkAvailability = false;
                                JOptionPane.showMessageDialog(null, "Product Already in cart!");

                            }

                        }
                    }

                    if (checkAvailability) {
                        double total = cart.CalculateTotalPrice(productPrice, noOfItems);

                        model.addRow(new String[]{productID, productName, "" + productPrice, "" + noOfItems, "" + total});
                        finalTotalPrice = finalTotalPrice + total;

                        lblTotalAmount.setText("" + finalTotalPrice);
                        JOptionPane.showMessageDialog(null, "Item Added to cart");
                    }

                    clear();

                }

            } else {

                JOptionPane.showMessageDialog(null, "ENTER PRODUCT DETAILS - (QUANTITY)*", "ERROR", JOptionPane.ERROR_MESSAGE);

            }

        }


    }//GEN-LAST:event_btnAddtoCartActionPerformed

    private void tblCartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCartMouseClicked

        int index = tblCart.getSelectedRow();
        int a = JOptionPane.showConfirmDialog(null, "Do you want to remove this item?", "REMOVE", JOptionPane.YES_NO_OPTION);

        if (a == 0) {
            TableModel model = tblCart.getModel();

            double subTotal = Double.parseDouble(model.getValueAt(index, 4).toString());
            finalTotalPrice = finalTotalPrice - subTotal;

            lblTotalAmount.setText(priceFormat(finalTotalPrice));

            ((DefaultTableModel) tblCart.getModel()).removeRow(index);

        }

    }//GEN-LAST:event_tblCartMouseClicked

    private void btnCreateOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateOrderActionPerformed

        if (finalTotalPrice != 0 && !txtCustomerName.getText().equals("") && !txtCustomerMobileNumber.getText().equals("")) {

            Order order = new Order();

            String orderID = order.generateOrderID("Bill-");

            DefaultTableModel model = (DefaultTableModel) tblCart.getModel();

            if (tblCart.getRowCount() != 0) {

                for (int i = 0; i < tblCart.getRowCount(); i++) {

                    int productQuantity = Integer.parseInt(model.getValueAt(i, 3).toString());
                    String productID = model.getValueAt(i, 0).toString();

                    order.updateQuantity(productQuantity, productID);

                }

            }

            //Create Order
            order.setOrderID(orderID);
            order.setCustomerName(txtCustomerName.getText());
            order.setCustomerMobileNumber(txtCustomerMobileNumber.getText());
            order.setTotalPaidAmount(finalTotalPrice);
            order.createOrder();

            //Create bill
            int rowCount = tblCart.getRowCount();

            String[][] tableData = new String[rowCount][4];

            for (int row = 0; row < rowCount; row++) {
                for (int col = 1; col < 5; col++) {
                    
                    if(col == 2 || col == 4){
                        tableData[row][col-1] = priceFormat(Double.parseDouble(tblCart.getValueAt(row, col).toString()));
                    }else{
                        tableData[row][col-1] = (String) tblCart.getValueAt(row, col);
                    }
                    
                }
            }

            order.createBillPDF(tableData);
            this.setVisible(false);
            new ManageOrder().setVisible(true);

        } else {
            JOptionPane.showMessageDialog(null, "Please add some product to cart or check customer details");
        }

    }//GEN-LAST:event_btnCreateOrderActionPerformed

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        Product product = new Product();

        String prod = JOptionPane.showInputDialog(null, "Enter Product ID or Product Name");

        product.setProductID(prod);
        product.setProductName(prod);

        if (product.searchProduct()) {

            txtProductID.setText(product.getProductID());
            txtProductName.setText(product.getProductName());
            txtProductPrice.setText("" + product.getProductPrice());

        } else {

            JOptionPane.showMessageDialog(null, prod + " Not Found!");

        }
    }//GEN-LAST:event_btnFindActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        clear();
        disbleFields();
        viewAllProducts();
        this.setVisible(false);
        new ManageOrder().setVisible(true);
    }//GEN-LAST:event_btnResetActionPerformed

    private void clear() {

        txtProductName.setText(null);
        txtProductPrice.setText(null);
        txtOrderQuantity.setText(null);
        txtProductID.setText(null);

    }

    private void disbleFields() {

        txtProductName.setEnabled(false);
        txtProductPrice.setEnabled(false);
        txtOrderQuantity.setEnabled(false);
        txtProductID.setEnabled(false);

    }

    private void viewAllProducts() {

        DefaultTableModel model = (DefaultTableModel) tblProduct.getModel();
        model.setRowCount(0);

        Product product = new Product();
        product.viewAll();

        try {

            MyConnection.rs = MyConnection.pst.executeQuery();

            while (MyConnection.rs.next()) {
                model.addRow(new String[]{MyConnection.rs.getString(1), MyConnection.rs.getString(2), MyConnection.rs.getString(3), MyConnection.rs.getString(4), MyConnection.rs.getString(5), MyConnection.rs.getString(6), MyConnection.rs.getString(9), MyConnection.rs.getString(7), MyConnection.rs.getString(11)});

            }
            MyConnection.con.close();
            MyConnection.clear();

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "DB_PRODUCT_VIEW_ALL_ERROR: " + e, "PRODUCT VIEW ALL ERROR", JOptionPane.ERROR_MESSAGE);

        }

    }

    private boolean checkEmptyFields() {

        JTextField checkEmptyFilds[] = {txtProductID, txtProductName, txtProductPrice, txtOrderQuantity};

        for (JTextField txt : checkEmptyFilds) {

            String field = txt.getText().trim();

            if (field.isEmpty()) {

                JOptionPane.showMessageDialog(null, "CHECK YOUR BLANK FIELDS PLEASE!", "BLANK", JOptionPane.ERROR_MESSAGE
                );
                return false;
            }

        }

        return true;

    }
    
    public String priceFormat(double price){
        
        DecimalFormat df = new DecimalFormat("#.00");
        String formattedPrice = df.format(price);
        return formattedPrice;
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ManageOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageOrder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddtoCart;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnCreateOrder;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnReset;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCart;
    private javax.swing.JLabel lblCustomerMobileNumber;
    private javax.swing.JLabel lblCustomerName;
    private javax.swing.JLabel lblManageOrderTitle;
    private javax.swing.JLabel lblOrderBackground;
    private javax.swing.JLabel lblOrderQuantity;
    private javax.swing.JLabel lblProductID;
    private javax.swing.JLabel lblProductList;
    private javax.swing.JLabel lblProductName;
    private javax.swing.JLabel lblProductPrice;
    private javax.swing.JLabel lblTotalAmount;
    private javax.swing.JLabel lblTotalAmountTitle;
    private javax.swing.JTable tblCart;
    private javax.swing.JTable tblProduct;
    private javax.swing.JTextField txtCustomerMobileNumber;
    private javax.swing.JTextField txtCustomerName;
    private javax.swing.JTextField txtOrderQuantity;
    private javax.swing.JTextField txtProductID;
    private javax.swing.JTextField txtProductName;
    private javax.swing.JTextField txtProductPrice;
    // End of variables declaration//GEN-END:variables
}
