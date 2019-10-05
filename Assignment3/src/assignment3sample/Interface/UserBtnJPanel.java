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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gaomc
 */
public class UserBtnJPanel extends javax.swing.JPanel {


    Car car;
    CarList carList;
    JPanel viewJPanel;
    
    UserBtnJPanel(CarList carList, JPanel viewJPanel) {
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

        listCatByManuBtn = new javax.swing.JButton();
        listCarBySeatsBtn = new javax.swing.JButton();
        listCarByCityBtn = new javax.swing.JButton();
        find1stAvalCarBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        maxSeatsTxt = new javax.swing.JTextField();
        minSeatsTxt = new javax.swing.JTextField();
        listCatByModelNumBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        modelNumTxt = new javax.swing.JTextField();
        listManufactureBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        manufactureTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cityTxt = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        manufactureTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        listCatByManuBtn.setBackground(new java.awt.Color(255, 255, 255));
        listCatByManuBtn.setText("List Cars by Manufacture");
        listCatByManuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listCatByManuBtnActionPerformed(evt);
            }
        });
        add(listCatByManuBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 200, -1));

        listCarBySeatsBtn.setBackground(new java.awt.Color(255, 255, 255));
        listCarBySeatsBtn.setText("List Avaliable Car By Seats");
        listCarBySeatsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listCarBySeatsBtnActionPerformed(evt);
            }
        });
        add(listCarBySeatsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 200, -1));

        listCarByCityBtn.setBackground(new java.awt.Color(255, 255, 255));
        listCarByCityBtn.setText("List Cars by City");
        listCarByCityBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listCarByCityBtnActionPerformed(evt);
            }
        });
        add(listCarByCityBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 200, -1));

        find1stAvalCarBtn.setBackground(new java.awt.Color(255, 255, 255));
        find1stAvalCarBtn.setText("Find First Avaliable Car");
        find1stAvalCarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                find1stAvalCarBtnActionPerformed(evt);
            }
        });
        add(find1stAvalCarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 200, -1));

        jLabel1.setText("maxSeats > max:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, 20));

        jLabel2.setText("minSeats < min:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, 20));

        maxSeatsTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maxSeatsTxtActionPerformed(evt);
            }
        });
        add(maxSeatsTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 50, -1));

        minSeatsTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minSeatsTxtActionPerformed(evt);
            }
        });
        add(minSeatsTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 50, -1));

        listCatByModelNumBtn.setBackground(new java.awt.Color(255, 255, 255));
        listCatByModelNumBtn.setText("List Car by Model #");
        listCatByModelNumBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listCatByModelNumBtnActionPerformed(evt);
            }
        });
        add(listCatByModelNumBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 200, -1));

        jLabel3.setText("Model # :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, 20));

        modelNumTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modelNumTxtActionPerformed(evt);
            }
        });
        add(modelNumTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 100, -1));

        listManufactureBtn.setBackground(new java.awt.Color(255, 255, 255));
        listManufactureBtn.setText("manufactures");
        listManufactureBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listManufactureBtnActionPerformed(evt);
            }
        });
        add(listManufactureBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 100, 110));

        jLabel4.setText("Manufacuture:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, 20));

        manufactureTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manufactureTxtActionPerformed(evt);
            }
        });
        add(manufactureTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 70, -1));

        jLabel5.setText("City:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, 20));

        cityTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityTxtActionPerformed(evt);
            }
        });
        add(cityTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 100, -1));

        manufactureTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Manufacture"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(manufactureTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 90, 110));
    }// </editor-fold>//GEN-END:initComponents

    private void listCatByManuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listCatByManuBtnActionPerformed
        // TODO add your handling code here:
        if(manufactureTxt.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please Input a manufacture!");
            return;
        }
        ArrayList<Car> searchResult = (ArrayList) carList.getCarList("searchManufacture", manufactureTxt.getText());
        showUserListCarJPanel(searchResult);
    }//GEN-LAST:event_listCatByManuBtnActionPerformed

    private void listCarBySeatsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listCarBySeatsBtnActionPerformed
        // TODO add your handling code here:
        try{
            Integer.valueOf(minSeatsTxt.getText());
            Integer.valueOf(maxSeatsTxt.getText());
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Must have a int type min/max SeatsNum!");
        }
        
        if(minSeatsTxt.getText().equals("") ){
            return;
        }else{
            int min = Integer.valueOf(minSeatsTxt.getText());
            int max = Integer.valueOf(maxSeatsTxt.getText());
            ArrayList<Car> searchResult = (ArrayList) carList.goodSeatsNum(min, max);
            showUserListCarJPanel(searchResult);
        }
        

    }//GEN-LAST:event_listCarBySeatsBtnActionPerformed

    private void listCarByCityBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listCarByCityBtnActionPerformed
        // TODO add your handling code here:
        if(cityTxt.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please Input a city!");
            return;
        } 
        ArrayList<Car> searchResult = (ArrayList) carList.getCarList("availbleCity", cityTxt.getText());
        showUserListCarJPanel(searchResult);
    }//GEN-LAST:event_listCarByCityBtnActionPerformed

    private void find1stAvalCarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_find1stAvalCarBtnActionPerformed
        // TODO add your handling code here:
        ArrayList<Car> searchResult = (ArrayList) carList.getCarList("avaliability", "true");
        
        if(searchResult.isEmpty()){
            JOptionPane.showMessageDialog(null, "There is no Avaliable car right now!");
            return;
        }
        ArrayList<Car> sigleResult = new ArrayList<>();
        
        sigleResult.add(searchResult.get(1)) ;
       
        showUserListCarJPanel(sigleResult);
        
    }//GEN-LAST:event_find1stAvalCarBtnActionPerformed

    private void maxSeatsTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maxSeatsTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maxSeatsTxtActionPerformed

    private void minSeatsTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minSeatsTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_minSeatsTxtActionPerformed

    private void listCatByModelNumBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listCatByModelNumBtnActionPerformed
        // TODO add your handling code here:
        if(modelNumTxt.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please Input a model #!");
            return;
        }
        
        ArrayList<Car> searchResult = (ArrayList) carList.getCarList("modelNum",modelNumTxt.getText());
        
        showUserListCarJPanel(searchResult);
    }//GEN-LAST:event_listCatByModelNumBtnActionPerformed

    private void modelNumTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modelNumTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modelNumTxtActionPerformed

    private void listManufactureBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listManufactureBtnActionPerformed
        // TODO add your handling code here:
        ArrayList<String> manufactureList = (ArrayList) carList.getManufacutreList();
//        for(String a : manufactureList){
//            System.out.println(a);
//        }
//       
        DefaultTableModel dtm = (DefaultTableModel)manufactureTable.getModel();
        dtm.setRowCount(0);
        
         manufactureList.forEach(a -> {
            Object[] row = new Object[dtm.getColumnCount()];
            row[0] = a;
            dtm.addRow(row);
        });
        
 
    }//GEN-LAST:event_listManufactureBtnActionPerformed

    private void manufactureTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manufactureTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_manufactureTxtActionPerformed

    private void cityTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityTxtActionPerformed

    private void showUserListCarJPanel(ArrayList<Car> searchResult){
        UserListCarJPanel userListCarJPanel = new UserListCarJPanel(viewJPanel,searchResult, carList );
        viewJPanel.add("UserListCarJPanel",userListCarJPanel);
        CardLayout layout = (CardLayout) viewJPanel.getLayout();
        layout.next(viewJPanel);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cityTxt;
    private javax.swing.JButton find1stAvalCarBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton listCarByCityBtn;
    private javax.swing.JButton listCarBySeatsBtn;
    private javax.swing.JButton listCatByManuBtn;
    private javax.swing.JButton listCatByModelNumBtn;
    private javax.swing.JButton listManufactureBtn;
    private javax.swing.JTable manufactureTable;
    private javax.swing.JTextField manufactureTxt;
    private javax.swing.JTextField maxSeatsTxt;
    private javax.swing.JTextField minSeatsTxt;
    private javax.swing.JTextField modelNumTxt;
    // End of variables declaration//GEN-END:variables
}
