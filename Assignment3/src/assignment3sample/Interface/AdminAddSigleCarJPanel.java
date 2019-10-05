/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3sample.Interface;

import assignment3sample.Business.Car;
import assignment3sample.Business.CarList;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author gaomc
 */
public class AdminAddSigleCarJPanel extends javax.swing.JPanel {

    private JPanel viewJPanel;
    private CarList carList;

    AdminAddSigleCarJPanel(JPanel viewJPanel, CarList carList) {
        initComponents();
        this.viewJPanel = viewJPanel;
        this.carList = carList;
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
        serialNumTxt = new javax.swing.JTextField();
        minSeatNumTxt = new javax.swing.JTextField();
        cityTxt = new javax.swing.JTextField();
        manuYearTxt = new javax.swing.JTextField();
        brandTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        saveBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        MaxSeatNumTxt = new javax.swing.JTextField();
        avalCheckBox = new javax.swing.JCheckBox();
        validCertCheckBox = new javax.swing.JCheckBox();
        brandLabel = new javax.swing.JLabel();
        modelLabel = new javax.swing.JLabel();
        drivetrainsLabel = new javax.swing.JLabel();
        enginesLabel = new javax.swing.JLabel();
        styleLabel = new javax.swing.JLabel();
        exteriorColorLabel = new javax.swing.JLabel();
        msprLabel = new javax.swing.JLabel();
        brandLabel1 = new javax.swing.JLabel();
        enginesLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(modelNumTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 190, -1));

        serialNumTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serialNumTxtActionPerformed(evt);
            }
        });
        add(serialNumTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 190, -1));

        minSeatNumTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minSeatNumTxtActionPerformed(evt);
            }
        });
        add(minSeatNumTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 190, -1));
        add(cityTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 190, -1));
        add(manuYearTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 190, -1));

        brandTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brandTxtActionPerformed(evt);
            }
        });
        add(brandTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 190, -1));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setText("Create new car");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, -1, -1));

        saveBtn.setBackground(new java.awt.Color(255, 255, 255));
        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });
        add(saveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, -1, -1));

        backBtn.setBackground(new java.awt.Color(255, 255, 255));
        backBtn.setText("<< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 419, 320, 50));

        MaxSeatNumTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaxSeatNumTxtActionPerformed(evt);
            }
        });
        add(MaxSeatNumTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 190, -1));

        avalCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        avalCheckBox.setText("Avaliable");
        add(avalCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, -1, -1));

        validCertCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        validCertCheckBox.setText("valid Cert");
        add(validCertCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, -1, -1));

        brandLabel.setText("Brand:");
        add(brandLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, 20));

        modelLabel.setText("Model #:");
        add(modelLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, 20));

        drivetrainsLabel.setText("Serial #:");
        add(drivetrainsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, 20));

        enginesLabel.setText("Min Seats:");
        add(enginesLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, 20));

        styleLabel.setText("City:");
        add(styleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, -1, 20));

        exteriorColorLabel.setText("Maitenance Certificate:");
        add(exteriorColorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, -1, 20));

        msprLabel.setText("Manufacture Year:");
        add(msprLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, 20));

        brandLabel1.setText("Avaliable:");
        add(brandLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, 20));

        enginesLabel1.setText("Max Seats:");
        add(enginesLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void serialNumTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serialNumTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_serialNumTxtActionPerformed

    private void minSeatNumTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minSeatNumTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_minSeatNumTxtActionPerformed

    private void brandTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brandTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_brandTxtActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
        
        
        if("".equals(brandTxt.getText()) || "".equals(cityTxt.getText()) ||"".equals(manuYearTxt.getText())
                || "".equals(minSeatNumTxt.getText()) || "".equals(minSeatNumTxt.getText()) 
                || "".equals(MaxSeatNumTxt.getText()) || "".equals(modelNumTxt.getText())
                ||"".equals(serialNumTxt.getText())){
            JOptionPane.showMessageDialog(null, "Please do not leave blank!");
        }else{
        
            try{
                Integer.valueOf(manuYearTxt.getText());
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "ManuYear should be a integer!");

            }

            try{
                Integer.valueOf(minSeatNumTxt.getText());
                Integer.valueOf(MaxSeatNumTxt.getText());     
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "seats Number should be integers!");
            }
            
            try{
                Integer.valueOf(serialNumTxt.getText());  
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "serial Number should be integers!");
            }
            
            Car car = this.carList.addCar();

            if(avalCheckBox.isSelected() == true  ){
                car.setAvailable(true);
            }else if(avalCheckBox.isSelected()== false){
                car.setAvailable(false);
            }

            car.setBrand(brandTxt.getText());
            car.setAvailble_city(cityTxt.getText());
            car.setManufactured_year(Integer.valueOf(manuYearTxt.getText()));
            car.setMin_seats(Integer.valueOf(minSeatNumTxt.getText()));
            car.setMax_seats(Integer.valueOf(MaxSeatNumTxt.getText()));
            car.setModel_num(modelNumTxt.getText());
            car.setSerial_num(Integer.valueOf(serialNumTxt.getText()));
    //        car.setMaintenance_certificate(true);

            if(validCertCheckBox.isSelected()== true){
                car.setMaintenance_certificate(true);
            }else if (validCertCheckBox.isSelected()== false){
                car.setMaintenance_certificate(false);
            }
            
            avalCheckBox.setEnabled(false);
            brandTxt.setEnabled(false);
            manuYearTxt.setEnabled(false);
            modelNumTxt.setEnabled(false);
            serialNumTxt.setEnabled(false);
            minSeatNumTxt.setEnabled(false);
            MaxSeatNumTxt.setEnabled(false);
            cityTxt.setEnabled(false);    
            validCertCheckBox.setEnabled(false);

            saveBtn.setEnabled(false);
            carList.setTime();
        
            
            JOptionPane.showMessageDialog(null, "Account updated successfully");

        }
        
    }//GEN-LAST:event_saveBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:

        viewJPanel.remove(this);
        CardLayout layout = (CardLayout) viewJPanel.getLayout();

        Component[] comps = viewJPanel.getComponents();
        for(Component comp : comps){
            if(comp instanceof AdminListCarJPanel){
                AdminListCarJPanel manageP = (AdminListCarJPanel) comp;
                manageP.populate(carList.getCarList());
            }
        }
        layout.previous(viewJPanel);
    }//GEN-LAST:event_backBtnActionPerformed

    private void MaxSeatNumTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaxSeatNumTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MaxSeatNumTxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField MaxSeatNumTxt;
    private javax.swing.JCheckBox avalCheckBox;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel brandLabel;
    private javax.swing.JLabel brandLabel1;
    private javax.swing.JTextField brandTxt;
    private javax.swing.JTextField cityTxt;
    private javax.swing.JLabel drivetrainsLabel;
    private javax.swing.JLabel enginesLabel;
    private javax.swing.JLabel enginesLabel1;
    private javax.swing.JLabel exteriorColorLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField manuYearTxt;
    private javax.swing.JTextField minSeatNumTxt;
    private javax.swing.JLabel modelLabel;
    private javax.swing.JTextField modelNumTxt;
    private javax.swing.JLabel msprLabel;
    private javax.swing.JButton saveBtn;
    private javax.swing.JTextField serialNumTxt;
    private javax.swing.JLabel styleLabel;
    private javax.swing.JCheckBox validCertCheckBox;
    // End of variables declaration//GEN-END:variables
}