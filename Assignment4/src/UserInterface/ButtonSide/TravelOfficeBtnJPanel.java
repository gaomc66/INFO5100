/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ButtonSide;

import Business.TravelOffice.TravelOffice;
import Business.UserAccount.UserAccount;
import UserInterface.TravelOffice.ManageCustomerJPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author gaomc
 */
public class TravelOfficeBtnJPanel extends javax.swing.JPanel {

    /**
     * Creates new form TravelOfficeBtn
     */
    private TravelOffice travelOffice;
    private JPanel cardSequenceJPanel;
    
    public TravelOfficeBtnJPanel(UserAccount userAccount, JPanel cardSequenceJPanel) {
        initComponents();
        
        this.travelOffice = (TravelOffice) userAccount.getMember();
        this.cardSequenceJPanel = cardSequenceJPanel;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        manageCustomerBtn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        customerComboBtn = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        manageCustomerBtn.setBackground(new java.awt.Color(255, 255, 255));
        manageCustomerBtn.setText("Manage Customer");
        manageCustomerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageCustomerBtnActionPerformed(evt);
            }
        });
        add(manageCustomerBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 99, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Book Ticket for a Customer");
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel1.setText("// toMasterTravelSchedual");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        customerComboBtn.setBackground(new java.awt.Color(255, 255, 255));
        customerComboBtn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(customerComboBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void manageCustomerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageCustomerBtnActionPerformed
        // TODO add your handling code here:
        ManageCustomerJPanel panel = new ManageCustomerJPanel(cardSequenceJPanel, travelOffice);
        cardSequenceJPanel.add(panel);
        CardLayout layout = (CardLayout) cardSequenceJPanel.getLayout();
        layout.next(cardSequenceJPanel);
    }//GEN-LAST:event_manageCustomerBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> customerComboBtn;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton manageCustomerBtn;
    // End of variables declaration//GEN-END:variables
}