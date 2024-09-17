package ui;

import classes.Brand;
import database.MyConnection;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author tharindulakshan
 */
public class ManageBrand extends javax.swing.JFrame {

    /**
     * Creates new form ManageBrand
     */
    public ManageBrand() {
        initComponents();
        setLocationRelativeTo(null);
        viewAll();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblManageBrandTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBrand = new javax.swing.JTable();
        lblBrandID = new javax.swing.JLabel();
        txtBrandID = new javax.swing.JTextField();
        lblBrandName = new javax.swing.JLabel();
        txtSearchBar = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        txtBrandName = new javax.swing.JTextField();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblManageBrandTitle.setBackground(new java.awt.Color(255, 255, 255));
        lblManageBrandTitle.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        lblManageBrandTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblManageBrandTitle.setText("Manage Brands");
        getContentPane().add(lblManageBrandTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 6, -1, -1));

        tblBrand.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name"
            }
        ));
        tblBrand.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBrandMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblBrand);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 107, 505, 457));

        lblBrandID.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblBrandID.setText("Brand ID");
        getContentPane().add(lblBrandID, new org.netbeans.lib.awtextra.AbsoluteConstraints(581, 241, -1, -1));

        txtBrandID.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        getContentPane().add(txtBrandID, new org.netbeans.lib.awtextra.AbsoluteConstraints(581, 265, 366, -1));

        lblBrandName.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblBrandName.setText("Brand Name");
        getContentPane().add(lblBrandName, new org.netbeans.lib.awtextra.AbsoluteConstraints(581, 307, -1, -1));

        txtSearchBar.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        getContentPane().add(txtSearchBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(581, 107, 366, 30));

        btnSearch.setBackground(new java.awt.Color(255, 204, 102));
        btnSearch.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 140, -1, -1));

        btnAdd.setBackground(new java.awt.Color(0, 204, 204));
        btnAdd.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(615, 427, -1, -1));

        btnUpdate.setBackground(new java.awt.Color(51, 204, 0));
        btnUpdate.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(699, 427, -1, -1));

        btnDelete.setBackground(new java.awt.Color(255, 102, 102));
        btnDelete.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 427, -1, -1));

        btnReset.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        getContentPane().add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(875, 427, -1, -1));

        btnClose.setBackground(new java.awt.Color(255, 51, 51));
        btnClose.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        getContentPane().add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(982, 570, -1, -1));

        txtBrandName.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        getContentPane().add(txtBrandName, new org.netbeans.lib.awtextra.AbsoluteConstraints(581, 331, 366, -1));

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ManageUserBackground.jpg"))); // NOI18N
        getContentPane().add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblBrandMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBrandMouseClicked
        int index = tblBrand.getSelectedRow();
        TableModel model = tblBrand.getModel();

        String catID = model.getValueAt(index, 0).toString();
        txtBrandID.setText(catID);

        String catName = model.getValueAt(index, 1).toString();
        txtBrandName.setText(catName);

        btnAdd.setEnabled(false);
        btnUpdate.setEnabled(true);
    }//GEN-LAST:event_tblBrandMouseClicked

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed

        Brand search = new Brand();
        String searchValue = txtSearchBar.getText();
        search.setBrandID(searchValue);
        search.setBrandName(searchValue);

        if (search.searchBrand()) {
            JOptionPane.showMessageDialog(null, "BRAND FOUND!", "BRAND SEARCHING..", JOptionPane.INFORMATION_MESSAGE);
            txtBrandID.setText(search.getBrandID());
            txtBrandName.setText(search.getBrandName());

            DefaultTableModel model = (DefaultTableModel) tblBrand.getModel();
            model.setRowCount(0);

            model.addRow(new String[]{search.getBrandID(), search.getBrandName()});
        } else {
            JOptionPane.showMessageDialog(null, "BRAND NOT FOUND, TRY AGAIN!", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

        if (checkEmptyFields()) {
            Brand add = new Brand();
            add.setBrandID(txtBrandID.getText());
            add.setBrandName(txtBrandName.getText());

            if (add.addBrand()) {
                JOptionPane.showMessageDialog(null, "NEW BRAND ADDED!", "NEW BRAND", JOptionPane.INFORMATION_MESSAGE);
            } else {

                JOptionPane.showMessageDialog(null, "BRAND NOT INSERTED, TRY AGAIN!", "ERROR", JOptionPane.ERROR_MESSAGE);

            }

            viewAll();
            clear();
            btnUpdate.setEnabled(false);
        }


    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        Brand update = new Brand();
        update.setBrandID(txtBrandID.getText());
        update.setBrandName(txtBrandName.getText());

        if (update.updateBrand()) {
            JOptionPane.showMessageDialog(null, "BRAND UPDATED!", "BRAND UPDATE", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "BRAND NOT UPDATED, TRY AGAIN!", "ERROR", JOptionPane.ERROR_MESSAGE);
        }

        viewAll();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        Brand delete = new Brand();
        delete.setBrandID(txtBrandID.getText());

        if (delete.deleteBrand()) {
            JOptionPane.showMessageDialog(null, "BRAND DELETED!", "BRAND DELETE", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "BRAND NOT DELETED, TRY AGAIN!", "BRAND NOT FOUND!", JOptionPane.ERROR_MESSAGE);
        }

        viewAll();
        clear();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtBrandID.setText(null);
        txtBrandName.setText(null);
        txtSearchBar.setText(null);

        btnAdd.setEnabled(true);
        viewAll();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void viewAll() {
        DefaultTableModel model = (DefaultTableModel) tblBrand.getModel();
        model.setRowCount(0);

        Brand brand = new Brand();
        brand.viewAll();

        try {

            MyConnection.rs = MyConnection.pst.executeQuery();

            while (MyConnection.rs.next()) {
                model.addRow(new String[]{MyConnection.rs.getString(1), MyConnection.rs.getString(2)});

            }
            MyConnection.con.close();
            MyConnection.clear();

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "DB_BRAND_VIEW_ALL_ERROR: " + e, "BRAND VIEW ALL ERROR", JOptionPane.ERROR_MESSAGE);

        }
    }

    private void clear() {

        txtBrandID.setText(null);
        txtBrandName.setText(null);
        txtSearchBar.setText(null);

    }

    private boolean checkEmptyFields() {

        JTextField checkEmptyFilds[] = {txtBrandID, txtBrandName};

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
            java.util.logging.Logger.getLogger(ManageBrand.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageBrand.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageBrand.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageBrand.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageBrand().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblBrandID;
    private javax.swing.JLabel lblBrandName;
    private javax.swing.JLabel lblManageBrandTitle;
    private javax.swing.JTable tblBrand;
    private javax.swing.JTextField txtBrandID;
    private javax.swing.JTextField txtBrandName;
    private javax.swing.JTextField txtSearchBar;
    // End of variables declaration//GEN-END:variables
}
