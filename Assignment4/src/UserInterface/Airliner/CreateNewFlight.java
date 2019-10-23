/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Airliner;

import Business.Airliner.Airliner;
import Business.Airliner.Fleet.Airplane;
import Business.Airliner.Fleet.AirplaneDirectory;
import Business.Airliner.Flight.Flight;
import Business.Airliner.Flight.FlightSchedual;
import UserInterface.TravelOffice.ManageCustomerJPanel;
import java.awt.CardLayout;
import java.awt.Component;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author gaomc
 */
public class CreateNewFlight extends javax.swing.JPanel {

    /**
     * Creates new form FlightFoundJPanel
     */
    public FlightSchedual flightList;
    public JPanel cardSequenceJPanel;
    public AirplaneDirectory airplaneList;
    public Airliner airliner;

    CreateNewFlight(JPanel cardSequenceJPanel, FlightSchedual flightList,Airliner airliner) {
        initComponents();  
        this.cardSequenceJPanel = cardSequenceJPanel;
        this.flightList = flightList;
        this.airplaneList = new AirplaneDirectory();
        this.airliner = airliner;
        airplaneCB.setModel(new DefaultComboBoxModel(this.airliner.getAirplaneDirectory().getAirplaneList().toArray()));

        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        flightNoTxt = new javax.swing.JTextField();
        departureTxt = new javax.swing.JTextField();
        destinationTxt = new javax.swing.JTextField();
        dateTxt = new javax.swing.JTextField();
        priceTxt = new javax.swing.JTextField();
        createBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        airplaneCB = new javax.swing.JComboBox<>();
        startTimeHour = new javax.swing.JTextField();
        startTimeMin = new javax.swing.JTextField();
        arriveHour = new javax.swing.JTextField();
        arriveMin = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Departure");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));

        jLabel2.setText("Destination");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        jLabel3.setText("Take off Date");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        jLabel4.setText("Take off Time");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));

        jLabel5.setText("Arrive Time");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));

        jLabel6.setText("Price($)");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, -1, -1));

        jLabel7.setText("FlightNo.");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        jLabel8.setText("Airplane");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, -1, -1));

        flightNoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flightNoTxtActionPerformed(evt);
            }
        });
        add(flightNoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 80, -1));

        departureTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departureTxtActionPerformed(evt);
            }
        });
        add(departureTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 80, -1));
        add(destinationTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 80, -1));

        dateTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateTxtActionPerformed(evt);
            }
        });
        add(dateTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 90, -1));
        add(priceTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 80, -1));

        createBtn.setText("Create");
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });
        add(createBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 400, -1, -1));

        backBtn.setText("<<Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, -1));

        airplaneCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        airplaneCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                airplaneCBActionPerformed(evt);
            }
        });
        add(airplaneCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, -1, -1));

        startTimeHour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startTimeHourActionPerformed(evt);
            }
        });
        add(startTimeHour, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 40, -1));
        add(startTimeMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 30, -1));

        arriveHour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arriveHourActionPerformed(evt);
            }
        });
        add(arriveHour, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 40, -1));

        arriveMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arriveMinActionPerformed(evt);
            }
        });
        add(arriveMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 30, -1));

        jLabel9.setText("H");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, -1, -1));

        jLabel10.setText("M");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, -1, -1));

        jLabel11.setText("H");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, -1, -1));

        jLabel12.setText("M");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void flightNoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flightNoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_flightNoTxtActionPerformed

    private void departureTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departureTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_departureTxtActionPerformed

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed

        if(flightNoTxt.getText().equals("")||departureTxt.getText().equals("")||destinationTxt.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Flight Number can't be empty!");
            return;
        }else if(Integer.parseInt(startTimeHour.getText())>24||Integer.parseInt(startTimeHour.getText())<0||Integer.parseInt(startTimeMin.getText())>59||Integer.parseInt(startTimeMin.getText())<0||Integer.parseInt(arriveHour.getText())>24||Integer.parseInt(arriveHour.getText())<0|| Integer.parseInt(arriveMin.getText())>59|| Integer.parseInt(arriveMin.getText())<0){
            JOptionPane.showMessageDialog(null, "Hour and minutes must be the right format");
        }else{
            try{
                Double.parseDouble(priceTxt.getText());
            }catch(NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please enter a number of price!");
                return;
            }
            String date = dateTxt.getText();
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
            Flight flight =new Flight();
            try {
                    flight.setDate(sdf.parse(date));
            } catch (ParseException e) {
                    JOptionPane.showMessageDialog(null, "Date should be the form of yyyy-MM-dd");
                    return;
            }

            //Airplane airplane = airplaneList.searchAirplane(airplaneTxt.getText());
            flight.setAirplane((Airplane)airplaneCB.getSelectedItem());
            flight.setFlightNo(flightNoTxt.getText());
            flight.setDeparture(departureTxt.getText());
            flight.setDestination(destinationTxt.getText());
            flight.setStartTime(LocalTime.of(Integer.parseInt(startTimeHour.getText()), Integer.parseInt(startTimeMin.getText())));
            flight.setArriveTime(LocalTime.of(Integer.parseInt(arriveHour.getText()), Integer.parseInt(arriveMin.getText())));
            flight.setPrice(Double.parseDouble(priceTxt.getText()));
            
            
            flightList.getFlghtList().add(flight);

            JOptionPane.showMessageDialog(null,"Account successfully created!");
        }
    }//GEN-LAST:event_createBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        cardSequenceJPanel.remove(this);
        CardLayout layout = (CardLayout) cardSequenceJPanel.getLayout();
        Component[] comps = this.cardSequenceJPanel.getComponents();
        for(Component comp : comps){
            if(comp instanceof ManageFlightJPanel){
                ManageFlightJPanel manage = (ManageFlightJPanel)comp;
                manage.populateTable(); 
            }
        }
        layout.previous(cardSequenceJPanel);
    
        
    }//GEN-LAST:event_backBtnActionPerformed

    private void dateTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateTxtActionPerformed

    private void airplaneCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_airplaneCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_airplaneCBActionPerformed

    private void startTimeHourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startTimeHourActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_startTimeHourActionPerformed

    private void arriveHourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arriveHourActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_arriveHourActionPerformed

    private void arriveMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arriveMinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_arriveMinActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> airplaneCB;
    private javax.swing.JTextField arriveHour;
    private javax.swing.JTextField arriveMin;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton createBtn;
    private javax.swing.JTextField dateTxt;
    private javax.swing.JTextField departureTxt;
    private javax.swing.JTextField destinationTxt;
    private javax.swing.JTextField flightNoTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField priceTxt;
    private javax.swing.JTextField startTimeHour;
    private javax.swing.JTextField startTimeMin;
    // End of variables declaration//GEN-END:variables
}