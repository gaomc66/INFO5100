/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import javax.swing.JOptionPane;
import Business.ProductDirectory;
import Business.Product;
import java.awt.CardLayout;
import javax.swing.JPanel;
/**
 *
 * @author info
 */
public class CreateProductJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateAccontJPanel
     */
    private ProductDirectory prodDir;
    private JPanel userProcessContainer;
   

    CreateProductJPanel(JPanel userProcessContainer, ProductDirectory prodDir) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.prodDir = prodDir;    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHead = new javax.swing.JLabel();
        lblRoutingNo = new javax.swing.JLabel();
        lblAccNo = new javax.swing.JLabel();
        lblBankName = new javax.swing.JLabel();
        lblBalance = new javax.swing.JLabel();
        txtProdName = new javax.swing.JTextField();
        txtAvailablity = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        txtDescription = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 153, 255));

        lblHead.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblHead.setText("Create Product");

        lblRoutingNo.setText("Product Name*");

        lblAccNo.setText("Availiblity*");

        lblBankName.setText("Price*");

        lblBalance.setText("Description");

        btnCreate.setText("Create Account");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnBack.setText("Back <<");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblHead))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRoutingNo)
                            .addComponent(lblAccNo)
                            .addComponent(lblBankName)
                            .addComponent(lblBalance))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtAvailablity, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                            .addComponent(txtPrice)
                            .addComponent(txtDescription)
                            .addComponent(txtProdName)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(btnCreate)))
                .addContainerGap(326, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblHead)
                    .addComponent(btnBack))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRoutingNo)
                    .addComponent(txtProdName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAccNo, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAvailablity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBankName)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBalance)
                    .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCreate)
                .addContainerGap(144, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
            
            String productPrice = txtPrice.getText();
            try{
                Double.parseDouble(productPrice);
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Please type in a number of price");
                return;
            }
            
            String availability = txtAvailablity.getText();
            try{
                   Integer.parseInt(availability);
            }catch(NumberFormatException e){ 
                JOptionPane.showMessageDialog(null, "Please type in a number of Availability");
            }
            
            Product prod = prodDir.addProduct();
            
            prod.setName(txtProdName.getText());
            prod.setAvailNum(Integer.parseInt(txtAvailablity.getText()));
            prod.setPrice(Double.parseDouble(txtPrice.getText()));
            prod.setDescription(txtDescription.getText());
            
            JOptionPane.showMessageDialog(null, "Account Created Successfully");
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JLabel lblAccNo;
    private javax.swing.JLabel lblBalance;
    private javax.swing.JLabel lblBankName;
    private javax.swing.JLabel lblHead;
    private javax.swing.JLabel lblRoutingNo;
    private javax.swing.JTextField txtAvailablity;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtProdName;
    // End of variables declaration//GEN-END:variables
}
