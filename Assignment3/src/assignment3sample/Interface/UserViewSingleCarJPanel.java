/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3sample.Interface;

import assignment3sample.Business.Car;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author gaomc
 */
public class UserViewSingleCarJPanel extends javax.swing.JPanel {

    private JPanel viewJPanel;
    private Car car;

    UserViewSingleCarJPanel(JPanel viewJPanel, Car car) {
        initComponents();
        this.viewJPanel = viewJPanel;
        this.car = car;
        
        if(car.isAvailable() == true)
            avalRadioBtn.setSelected(true);
        else{
            avalRadioBtn.setSelected(false);
            unAvalRadioBtn.setSelected(true);
        }
        brandTxt.setText(car.getBrand());
        manuYearTxt.setText(String.valueOf(car.getManufactured_year()));
        modelNumTxt.setText(car.getModel_num());
        minSeatNumTxt.setText(String.valueOf(car.getMin_seats()));
        MaxSeatNumTxt.setText(String.valueOf(car.getMax_seats()));
        cityTxt.setText(car.getAvailble_city());
        if(car.isMaintenance_certificate() == true)
            certValidRadioBtn.setSelected(true);
        else{
            certValidRadioBtn.setSelected(false);
            certExpRadioBtn.setSelected(true);
        } 
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        modelNumTxt = new javax.swing.JTextField();
        cityTxt = new javax.swing.JTextField();
        brandLabel = new javax.swing.JLabel();
        modelLabel = new javax.swing.JLabel();
        styleLabel = new javax.swing.JLabel();
        exteriorColorLabel = new javax.swing.JLabel();
        msprLabel = new javax.swing.JLabel();
        manuYearTxt = new javax.swing.JTextField();
        brandTxt = new javax.swing.JTextField();
        brandLabel1 = new javax.swing.JLabel();
        unAvalRadioBtn = new javax.swing.JRadioButton();
        certExpRadioBtn = new javax.swing.JRadioButton();
        certValidRadioBtn = new javax.swing.JRadioButton();
        avalRadioBtn = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        minSeatNumTxt = new javax.swing.JTextField();
        enginesLabel = new javax.swing.JLabel();
        MaxSeatNumTxt = new javax.swing.JTextField();
        enginesLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        modelNumTxt.setEnabled(false);
        add(modelNumTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 190, -1));

        cityTxt.setEnabled(false);
        add(cityTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 190, -1));

        brandLabel.setText("Brand:");
        add(brandLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, 20));

        modelLabel.setText("Model #:");
        add(modelLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, 20));

        styleLabel.setText("City:");
        add(styleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, 20));

        exteriorColorLabel.setText("Maitenance Certificate:");
        add(exteriorColorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, -1, 20));

        msprLabel.setText("Manufacture Year:");
        add(msprLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, 20));

        manuYearTxt.setEnabled(false);
        add(manuYearTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 190, -1));

        brandTxt.setEnabled(false);
        brandTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brandTxtActionPerformed(evt);
            }
        });
        add(brandTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 190, -1));

        brandLabel1.setText("Avaliable:");
        add(brandLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, 20));

        unAvalRadioBtn.setText("Unavliable");
        unAvalRadioBtn.setEnabled(false);
        add(unAvalRadioBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, -1, -1));

        certExpRadioBtn.setText("Expired");
        certExpRadioBtn.setEnabled(false);
        add(certExpRadioBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, -1, -1));

        certValidRadioBtn.setSelected(true);
        certValidRadioBtn.setText("Valid");
        certValidRadioBtn.setEnabled(false);
        add(certValidRadioBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, -1, -1));

        avalRadioBtn.setSelected(true);
        avalRadioBtn.setText("Avaliable");
        avalRadioBtn.setEnabled(false);
        add(avalRadioBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, -1, -1));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setText("Found your car");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, -1, -1));

        backBtn.setBackground(new java.awt.Color(255, 255, 255));
        backBtn.setText("<< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));

        minSeatNumTxt.setEnabled(false);
        minSeatNumTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minSeatNumTxtActionPerformed(evt);
            }
        });
        add(minSeatNumTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 190, -1));

        enginesLabel.setText("Min Seats:");
        add(enginesLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, 20));

        MaxSeatNumTxt.setEnabled(false);
        MaxSeatNumTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaxSeatNumTxtActionPerformed(evt);
            }
        });
        add(MaxSeatNumTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 190, -1));

        enginesLabel1.setText("Max Seats:");
        add(enginesLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void brandTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brandTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_brandTxtActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        viewJPanel.remove(this);
        CardLayout layout = (CardLayout) viewJPanel.getLayout();
        layout.previous(viewJPanel);
    }//GEN-LAST:event_backBtnActionPerformed

    private void minSeatNumTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minSeatNumTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_minSeatNumTxtActionPerformed

    private void MaxSeatNumTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaxSeatNumTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MaxSeatNumTxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField MaxSeatNumTxt;
    private javax.swing.JRadioButton avalRadioBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel brandLabel;
    private javax.swing.JLabel brandLabel1;
    private javax.swing.JTextField brandTxt;
    private javax.swing.JRadioButton certExpRadioBtn;
    private javax.swing.JRadioButton certValidRadioBtn;
    private javax.swing.JTextField cityTxt;
    private javax.swing.JLabel enginesLabel;
    private javax.swing.JLabel enginesLabel1;
    private javax.swing.JLabel exteriorColorLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField manuYearTxt;
    private javax.swing.JTextField minSeatNumTxt;
    private javax.swing.JLabel modelLabel;
    private javax.swing.JTextField modelNumTxt;
    private javax.swing.JLabel msprLabel;
    private javax.swing.JLabel styleLabel;
    private javax.swing.JRadioButton unAvalRadioBtn;
    // End of variables declaration//GEN-END:variables
}
