/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ButtonSide;

import Business.Airliner.Airliner;
import Business.Airliner.AirlinerDirectory;
import Business.Airliner.Flight.Flight;
import Business.Airliner.Flight.FlightSchedual;
import Business.UserAccount.UserAccount;
import UserInterface.Airliner.ManageFlightJPanel;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author gaomc
 */
public class AirlinerBtnJPanel extends javax.swing.JPanel {

    /**
     * Creates new form TravelAgencyBtnJPanel
     */
    public FlightSchedual flightList;
    public AirlinerDirectory airlinerList;
    private JPanel cardSequenceJPanel;
    private UserAccount userAccount;
    private Airliner airliner;
    public AirlinerBtnJPanel(UserAccount userAccount,JPanel cardSequenceJPanel) {
        initComponents();
        this.userAccount = userAccount;
        this.airliner = (Airliner) userAccount.getMember();
        this.cardSequenceJPanel = cardSequenceJPanel;
        initialize();
    }
    public void initialize(){
        nameTxt.setText(userAccount.getUsername());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameTxt = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nameTxt.setFont(new java.awt.Font("Menlo", 0, 14)); // NOI18N
        nameTxt.setText("Airliner name:");
        add(nameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, -1, 30));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Manage Flight");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 200, 40));

        jLabel6.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6.setFont(new java.awt.Font("Apple Chancery", 0, 18)); // NOI18N
        jLabel6.setText("Welcome to");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        FlightSchedual fls =airliner.getFlightSchedual();
        ManageFlightJPanel panel = new ManageFlightJPanel(cardSequenceJPanel,airliner);
        CardLayout layout = (CardLayout) cardSequenceJPanel.getLayout();
        cardSequenceJPanel.add(panel);
        layout.next(cardSequenceJPanel);
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel nameTxt;
    // End of variables declaration//GEN-END:variables
}
