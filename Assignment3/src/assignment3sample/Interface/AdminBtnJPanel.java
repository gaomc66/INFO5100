/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3sample.Interface;

import assignment3sample.Business.Car;
import assignment3sample.Business.CarList;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author gaomc
 */
public class AdminBtnJPanel extends javax.swing.JPanel {

    CarList carList;
    JPanel viewJPanel;
    
    /**
     * Creates new form AdminJPanel
     */
    public AdminBtnJPanel(CarList carList) {
        
        
    }

    AdminBtnJPanel(CarList carList, JPanel viewJPanel) {
        initComponents();
        
        this.carList = carList;
        this.viewJPanel = viewJPanel;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        checkAvalCarBtn = new javax.swing.JButton();
        checkUnAvalCarBtn = new javax.swing.JButton();
        listCarByManuYearBtn = new javax.swing.JButton();
        findCarBySerialNumBtn = new javax.swing.JButton();
        listCarByMaintCertBtn = new javax.swing.JButton();
        countAvalCarTxt = new javax.swing.JTextField();
        countUnAvalCarTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        manuYearTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        serialNumTxt = new javax.swing.JTextField();
        addCarBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        checkAvalCarBtn.setBackground(new java.awt.Color(255, 255, 255));
        checkAvalCarBtn.setText("Count Avaliable Car");
        checkAvalCarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkAvalCarBtnActionPerformed(evt);
            }
        });
        add(checkAvalCarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 41, 185, -1));

        checkUnAvalCarBtn.setBackground(new java.awt.Color(255, 255, 255));
        checkUnAvalCarBtn.setText("Count UnAvaliable Car");
        checkUnAvalCarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkUnAvalCarBtnActionPerformed(evt);
            }
        });
        add(checkUnAvalCarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 76, -1, -1));

        listCarByManuYearBtn.setBackground(new java.awt.Color(255, 255, 255));
        listCarByManuYearBtn.setText("List Cars by Manufacture Year");
        listCarByManuYearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listCarByManuYearBtnActionPerformed(evt);
            }
        });
        add(listCarByManuYearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 250, -1));

        findCarBySerialNumBtn.setBackground(new java.awt.Color(255, 255, 255));
        findCarBySerialNumBtn.setText("Find Car By Serial Number");
        findCarBySerialNumBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findCarBySerialNumBtnActionPerformed(evt);
            }
        });
        add(findCarBySerialNumBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 250, -1));

        listCarByMaintCertBtn.setBackground(new java.awt.Color(255, 255, 255));
        listCarByMaintCertBtn.setText("List Cars by Maintenance Certificate");
        listCarByMaintCertBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listCarByMaintCertBtnActionPerformed(evt);
            }
        });
        add(listCarByMaintCertBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 250, -1));

        countAvalCarTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countAvalCarTxtActionPerformed(evt);
            }
        });
        add(countAvalCarTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 41, 50, -1));
        add(countUnAvalCarTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 76, 50, -1));

        jLabel1.setText("Manufacutured in");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, 30));

        manuYearTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manuYearTxtActionPerformed(evt);
            }
        });
        add(manuYearTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 70, -1));

        jLabel2.setText("Years");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, -1, 30));

        jLabel3.setText("Serial Number: ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, 30));
        add(serialNumTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 110, -1));

        addCarBtn.setBackground(new java.awt.Color(255, 255, 255));
        addCarBtn.setText("Add a New Car");
        addCarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCarBtnActionPerformed(evt);
            }
        });
        add(addCarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 250, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void checkAvalCarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkAvalCarBtnActionPerformed
        // TODO add your handling code here:
        ArrayList<Car> avaliableCars = (ArrayList<Car>) carList.getCarList("avaliability", "true");
        countAvalCarTxt.setText(String.valueOf(avaliableCars.size()));
        
        showAdminList(avaliableCars);
    }//GEN-LAST:event_checkAvalCarBtnActionPerformed

    private void checkUnAvalCarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkUnAvalCarBtnActionPerformed
        // TODO add your handling code here:
        List<Car> unAvaliableCars = carList.getCarList("avaliability", "false");
        countUnAvalCarTxt.setText(String.valueOf(unAvaliableCars.size()));
        showAdminList(unAvaliableCars);
    }//GEN-LAST:event_checkUnAvalCarBtnActionPerformed

    private void listCarByMaintCertBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listCarByMaintCertBtnActionPerformed
        // TODO add your handling code here:
        List<Car> expireCars = carList.getCarList("maintenanceCertificate","false");
        showAdminList(expireCars);
    }//GEN-LAST:event_listCarByMaintCertBtnActionPerformed

    private void countAvalCarTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countAvalCarTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_countAvalCarTxtActionPerformed

    private void findCarBySerialNumBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findCarBySerialNumBtnActionPerformed
        // TODO add your handling code here:
        try{
            Integer.valueOf(serialNumTxt.getText());
        }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Please type in a number of serialNum");
                return;
        }
        List<Car> findCarBySerialNum = carList.getCarList("serialNum",serialNumTxt.getText());
        showAdminList(findCarBySerialNum);
    }//GEN-LAST:event_findCarBySerialNumBtnActionPerformed

    private void listCarByManuYearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listCarByManuYearBtnActionPerformed
        // TODO add your handling code here:
        try{
            Integer.valueOf(manuYearTxt.getText());
        }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Please type in a number of manuYearTxt");
                return;
        }
        if(manuYearTxt.getText() == null){
            JOptionPane.showMessageDialog(null, "You need to input a manufacture Year!");
            return;
        }
       
        List<Car> listCarByManuYear = carList.getCarList("manufactureYear",manuYearTxt.getText());
        showAdminList(listCarByManuYear);
    }//GEN-LAST:event_listCarByManuYearBtnActionPerformed

    private void manuYearTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manuYearTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_manuYearTxtActionPerformed

    private void addCarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCarBtnActionPerformed
        // TODO add your handling code here:
        AdminAddSigleCarJPanel addCarJPanel = new AdminAddSigleCarJPanel(viewJPanel, carList);
        viewJPanel.add("AdminAddSigleCarJPanel",addCarJPanel);
        CardLayout layout = (CardLayout) viewJPanel.getLayout();
        layout.next(viewJPanel);
    }//GEN-LAST:event_addCarBtnActionPerformed
    
    public void showAdminList(List<Car> searchResult){
        
        AdminListCarJPanel adminListCarJPanel = new AdminListCarJPanel(viewJPanel,searchResult,carList);
        viewJPanel.add("AdminListJPanel",adminListCarJPanel);
        CardLayout layout = (CardLayout) viewJPanel.getLayout();
        layout.next(viewJPanel);
//        disableBtns();
       
    }
    
    public void disableBtns(){
        checkAvalCarBtn.setEnabled(false);
        checkUnAvalCarBtn.setEnabled(false);
        findCarBySerialNumBtn.setEnabled(false);
        listCarByMaintCertBtn.setEnabled(false);
        listCarByManuYearBtn.setEnabled(false);
        
    }
//    
//    public void showSigleCar(List<Car> car){
//        AdminSigleCarJPanel adminSigleCarJPanel = new AdminSigleCarJPanel(viewJPanel,car,carList);
//        viewJPanel.add("AdminSigleCarJPanel",adminSigleCarJPanel);
//        CardLayout layout = (CardLayout) viewJPanel.getLayout();
//        layout.next(viewJPanel);
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCarBtn;
    private javax.swing.JButton checkAvalCarBtn;
    private javax.swing.JButton checkUnAvalCarBtn;
    private javax.swing.JTextField countAvalCarTxt;
    private javax.swing.JTextField countUnAvalCarTxt;
    private javax.swing.JButton findCarBySerialNumBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton listCarByMaintCertBtn;
    private javax.swing.JButton listCarByManuYearBtn;
    private javax.swing.JTextField manuYearTxt;
    private javax.swing.JTextField serialNumTxt;
    // End of variables declaration//GEN-END:variables
}
