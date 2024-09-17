/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

/**
 *
 * @author tharindulakshan
 */
public class ManagerHomeUI extends javax.swing.JFrame {

    /**
     * Creates new form ManagerHomeUI
     */
    public ManagerHomeUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAdminDashboard = new javax.swing.JLabel();
        btnUsers = new javax.swing.JButton();
        btnCategory = new javax.swing.JButton();
        btnBrands = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        btnBrands1 = new javax.swing.JButton();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAdminDashboard.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblAdminDashboard.setForeground(new java.awt.Color(255, 255, 255));
        lblAdminDashboard.setText("Manager Dashboard");
        getContentPane().add(lblAdminDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));

        btnUsers.setBackground(new java.awt.Color(102, 204, 0));
        btnUsers.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        btnUsers.setText("MANAGE USERS");
        btnUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsersActionPerformed(evt);
            }
        });
        getContentPane().add(btnUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 111, 156, 32));

        btnCategory.setBackground(new java.awt.Color(0, 204, 204));
        btnCategory.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        btnCategory.setText("MANAGE CATEGORY");
        btnCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoryActionPerformed(evt);
            }
        });
        getContentPane().add(btnCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 161, 156, 32));

        btnBrands.setBackground(new java.awt.Color(0, 204, 204));
        btnBrands.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        btnBrands.setText("MANAGE PRODUCTS");
        btnBrands.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrandsActionPerformed(evt);
            }
        });
        getContentPane().add(btnBrands, new org.netbeans.lib.awtextra.AbsoluteConstraints(422, 111, -1, 32));

        btnLogout.setBackground(new java.awt.Color(255, 51, 51));
        btnLogout.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(658, 309, -1, -1));

        btnBrands1.setBackground(new java.awt.Color(0, 204, 204));
        btnBrands1.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        btnBrands1.setText("MANAGE BRANDS");
        btnBrands1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrands1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnBrands1, new org.netbeans.lib.awtextra.AbsoluteConstraints(422, 161, 154, 32));

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Dashboard Background.jpg"))); // NOI18N
        getContentPane().add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsersActionPerformed

        new ManageUser().setVisible(true);
    }//GEN-LAST:event_btnUsersActionPerformed

    private void btnCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoryActionPerformed
        new ManageCategory().setVisible(true);
    }//GEN-LAST:event_btnCategoryActionPerformed

    private void btnBrandsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrandsActionPerformed
        new ManageBrand().setVisible(true);
    }//GEN-LAST:event_btnBrandsActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        this.setVisible(false);
        Login lp = new Login();
        lp.setVisible(true);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnBrands1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrands1ActionPerformed
        new ManageBrand().setVisible(true);
    }//GEN-LAST:event_btnBrands1ActionPerformed

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
            java.util.logging.Logger.getLogger(ManagerHomeUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagerHomeUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagerHomeUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagerHomeUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagerHomeUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBrands;
    private javax.swing.JButton btnBrands1;
    private javax.swing.JButton btnCategory;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnUsers;
    private javax.swing.JLabel lblAdminDashboard;
    private javax.swing.JLabel lblBackground;
    // End of variables declaration//GEN-END:variables
}
