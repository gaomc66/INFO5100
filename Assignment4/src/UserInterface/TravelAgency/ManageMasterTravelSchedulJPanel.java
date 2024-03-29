/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.TravelAgency;

import Business.Airliner.Airliner;
import Business.Airliner.Flight.Flight;
import Business.MasterTravelSchedule;
import Business.Ticket.TicketDirectory;
import Business.TravelAgency.TravelAgency;
import Business.TravelOffice.TravelOffice;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gaomc
 */
public class ManageMasterTravelSchedulJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageMasterFlightSchedulJPanel
     */
    private JPanel cardSequenceJPanel;
    private TravelOffice travelOffice;
    private List<Flight> allFlightList;
    

    public ManageMasterTravelSchedulJPanel(TravelAgency travelAgency, JPanel cardSequenceJPanel) {
       initComponents();
        
        this.allFlightList = MasterTravelSchedule.getInstance().getAllFlightsOfAirliners();
//        populateFlight()
        populateFlight(allFlightList);
        
//        System.out.println(MasterTravelSchedule.getInstance().getAllFlightsOfAirliners());
        this.cardSequenceJPanel = cardSequenceJPanel;
        
        
        flightCombox.setModel(new DefaultComboBoxModel(allFlightList.toArray())); 
        
        List<String> departureList = new ArrayList<>();
        List<String> tempListD = new ArrayList<>();
        allFlightList.forEach(flight ->{
                    tempListD.add(flight.getDeparture());});
        Set<String> tempSet = tempListD.stream()
                .collect(Collectors.toSet());
        tempSet.forEach(a -> {
            departureList.add(a);
        });
        
        
        departLocationComBox.setModel(new DefaultComboBoxModel(departureList.toArray())); 
        
        List<String> arraivalList = new ArrayList<>();
        List<String> tempListA = new ArrayList<>();
        allFlightList.forEach(flight ->{
                    tempListA.add(flight.getDestination());});
        Set<String> tempSetA = tempListA.stream()
                .collect(Collectors.toSet());
        tempSetA.forEach(a -> {
            arraivalList.add(a);
        });
        
        ArrivalLocationComBox1.setModel(new DefaultComboBoxModel(arraivalList.toArray())); 
        
         List<String> dateList = new ArrayList<>();
        List<String> tempListDate = new ArrayList<>();
        allFlightList.forEach(flight ->{
                    tempListDate.add(flight.getDate());});
        Set<String> tempSetDate = tempListDate.stream()
                .collect(Collectors.toSet());
        tempSetDate.forEach(a -> {
            dateList.add(a);
        });
        
        dataComBox.setModel(new DefaultComboBoxModel(dateList.toArray())); 
        
        
        preferrenceComBox.setModel(new DefaultComboBoxModel(new String[]{"Morning","DayTime","Evening"}));
    }
    

public void populateFlight(List<Flight> flightList){
        DefaultTableModel dtm = (DefaultTableModel)flightJTable.getModel();
        dtm.setRowCount(0);
        
        flightList.forEach((Flight flight) -> {
            Object[] row = new Object[dtm.getColumnCount()];
            row[0] = flight;
            row[1] = flight.getAirplane().getSerialNum();
            row[2] = flight.getStartTime();
            row[3] = flight.getDeparture();
            row[4] = flight.getDestination();
            row[5] = flight.getDate();
            row[6] = flight.getSeatAssignment();
            
            dtm.addRow(row);
        });
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
        findPreferBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        flightJTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        departLocationComBox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        ArrivalLocationComBox1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        preferrenceComBox = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        flightCombox = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        dataComBox = new javax.swing.JComboBox<>();
        dateRadioBtn = new javax.swing.JRadioButton();
        flightRadioBtn = new javax.swing.JRadioButton();
        flightSearchRedio2 = new javax.swing.JRadioButton();
        departureRadioBtn = new javax.swing.JRadioButton();
        PreRadioBtn = new javax.swing.JRadioButton();
        ArrivalRadioBtn = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("Search: multi-field & multi-parameter");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, -1));

        findPreferBtn.setBackground(new java.awt.Color(255, 255, 255));
        findPreferBtn.setText("Find Preferred Flight");
        findPreferBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findPreferBtnActionPerformed(evt);
            }
        });
        add(findPreferBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 170, -1));

        flightJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Flight #", "Airplane #", "Time", "Departure", "Arrival", "Date", "SeatAssign"
            }
        ));
        jScrollPane1.setViewportView(flightJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 530, 270));

        jLabel3.setText("Departure:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, -1, -1));

        departLocationComBox.setBackground(new java.awt.Color(255, 255, 255));
        departLocationComBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(departLocationComBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, -1, -1));

        jLabel4.setText("Arrival:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, -1, -1));

        ArrivalLocationComBox1.setBackground(new java.awt.Color(255, 255, 255));
        ArrivalLocationComBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(ArrivalLocationComBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, -1, -1));

        jLabel5.setText("Preferrence:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, -1, -1));

        preferrenceComBox.setBackground(new java.awt.Color(255, 255, 255));
        preferrenceComBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(preferrenceComBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, -1, -1));

        jLabel6.setText("Flight #:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, 20));

        flightCombox.setBackground(new java.awt.Color(255, 255, 255));
        flightCombox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(flightCombox, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, -1));

        jLabel7.setText("Date:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, 30));

        backBtn.setBackground(new java.awt.Color(255, 255, 255));
        backBtn.setText("Back<<");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, -1, -1));

        dataComBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(dataComBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 120, -1));
        add(dateRadioBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));
        add(flightRadioBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));
        add(flightSearchRedio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));
        add(departureRadioBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, -1, -1));
        add(PreRadioBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, -1, -1));
        add(ArrivalRadioBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void findPreferBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findPreferBtnActionPerformed
        // TODO add your handling code here:
        //        List<Flight> list = new ArrayList<>();
        if(flightRadioBtn.isSelected()){
            populateFlight(MasterTravelSchedule.getInstance().searchFlightsByFlightNum(flightCombox.getSelectedItem().toString()));
            //            dateRadioBtn.setEnabled(false);
            //            departureRadioBtn.setEnabled(false);
            //            ArrivalRadioBtn.setEnabled(false);
            //            PreRadioBtn.setEnabled(false);
        }else if ((dateRadioBtn.isSelected())
            && (!departureRadioBtn.isSelected())
            && (!ArrivalRadioBtn.isSelected())
            && (!PreRadioBtn.isSelected())){
            populateFlight((List<Flight>) MasterTravelSchedule.getInstance().searchFlightByDate(this.allFlightList, dataComBox.getSelectedItem().toString()));
        }else if ((departureRadioBtn.isSelected())
            && (!dateRadioBtn.isSelected())
            && (!ArrivalRadioBtn.isSelected())
            && (!PreRadioBtn.isSelected())){
            populateFlight((List<Flight>) MasterTravelSchedule.getInstance().searchFlightByDeparture(this.allFlightList, departLocationComBox.getSelectedItem().toString()));
        }else if (ArrivalRadioBtn.isSelected()
            && (!departureRadioBtn.isSelected())
            && (!dateRadioBtn.isSelected())
            && (!PreRadioBtn.isSelected())){
            populateFlight((List<Flight>) MasterTravelSchedule.getInstance().searchFlightByArrival(this.allFlightList, ArrivalLocationComBox1.getSelectedItem().toString()));
        }else if (PreRadioBtn.isSelected()
            && (!departureRadioBtn.isSelected())
            && (!dateRadioBtn.isSelected())
            && (!ArrivalRadioBtn.isSelected())){
            populateFlight((List<Flight>) MasterTravelSchedule.getInstance().searchFlightByTimeRange(this.allFlightList, preferrenceComBox.getSelectedItem().toString()));
        }else if((dateRadioBtn.isSelected())
            && (departureRadioBtn.isSelected())
            && (!ArrivalRadioBtn.isSelected())
            && (!PreRadioBtn.isSelected())){
            List<Flight> searchList = MasterTravelSchedule.getInstance().searchFlightByDate(this.allFlightList, dataComBox.getSelectedItem().toString());
            populateFlight((List<Flight>) MasterTravelSchedule.getInstance().searchFlightByDeparture(searchList, departLocationComBox.getSelectedItem().toString()));
        }else if((dateRadioBtn.isSelected())
            && (!departureRadioBtn.isSelected())
            && (ArrivalRadioBtn.isSelected())
            && (!PreRadioBtn.isSelected())){
            List<Flight> searchList = MasterTravelSchedule.getInstance().searchFlightByDate(this.allFlightList, dataComBox.getSelectedItem().toString());
            populateFlight((List<Flight>) MasterTravelSchedule.getInstance().searchFlightByArrival(searchList, ArrivalLocationComBox1.getSelectedItem().toString()));
        }else if((dateRadioBtn.isSelected())
            && (!departureRadioBtn.isSelected())
            && (!ArrivalRadioBtn.isSelected())
            && (PreRadioBtn.isSelected())){
            List<Flight> searchList = MasterTravelSchedule.getInstance().searchFlightByDate(this.allFlightList, dataComBox.getSelectedItem().toString());
            populateFlight((List<Flight>) MasterTravelSchedule.getInstance().searchFlightByTimeRange(searchList, preferrenceComBox.getSelectedItem().toString()));
        }else if((!dateRadioBtn.isSelected())
            && (departureRadioBtn.isSelected())
            && (ArrivalRadioBtn.isSelected())
            && (!PreRadioBtn.isSelected())){
            List<Flight> searchList = MasterTravelSchedule.getInstance().searchFlightByDeparture(this.allFlightList, departLocationComBox.getSelectedItem().toString());
            populateFlight((List<Flight>) MasterTravelSchedule.getInstance().searchFlightByArrival(searchList, ArrivalLocationComBox1.getSelectedItem().toString()));
        }else if((!dateRadioBtn.isSelected())
            && (departureRadioBtn.isSelected())
            && (!ArrivalRadioBtn.isSelected())
            && (PreRadioBtn.isSelected())){
            List<Flight> searchList = MasterTravelSchedule.getInstance().searchFlightByDeparture(this.allFlightList, departLocationComBox.getSelectedItem().toString());
            populateFlight((List<Flight>) MasterTravelSchedule.getInstance().searchFlightByTimeRange(searchList, preferrenceComBox.getSelectedItem().toString()));
        }else if((!dateRadioBtn.isSelected())
            && (!departureRadioBtn.isSelected())
            && (ArrivalRadioBtn.isSelected())
            && (PreRadioBtn.isSelected())){
            List<Flight> searchList = MasterTravelSchedule.getInstance().searchFlightByArrival(this.allFlightList, ArrivalLocationComBox1.getSelectedItem().toString());
            populateFlight((List<Flight>) MasterTravelSchedule.getInstance().searchFlightByTimeRange(searchList, preferrenceComBox.getSelectedItem().toString()));
        }else if((!dateRadioBtn.isSelected())
            && (departureRadioBtn.isSelected())
            && (ArrivalRadioBtn.isSelected())
            && (PreRadioBtn.isSelected())){
            List<Flight> searchList1 = MasterTravelSchedule.getInstance().searchFlightByDeparture(this.allFlightList, departLocationComBox.getSelectedItem().toString());
            List<Flight> searchList2 = MasterTravelSchedule.getInstance().searchFlightByArrival(searchList1, ArrivalLocationComBox1.getSelectedItem().toString());
            populateFlight((List<Flight>) MasterTravelSchedule.getInstance().searchFlightByTimeRange(searchList2, preferrenceComBox.getSelectedItem().toString()));
        }else if((dateRadioBtn.isSelected())
            && (!departureRadioBtn.isSelected())
            && (ArrivalRadioBtn.isSelected())
            && (PreRadioBtn.isSelected())){
            List<Flight> searchList1 = MasterTravelSchedule.getInstance().searchFlightByDate(this.allFlightList, dataComBox.getSelectedItem().toString());
            List<Flight> searchList2 = MasterTravelSchedule.getInstance().searchFlightByArrival(searchList1, ArrivalLocationComBox1.getSelectedItem().toString());
            populateFlight((List<Flight>) MasterTravelSchedule.getInstance().searchFlightByTimeRange(searchList2, preferrenceComBox.getSelectedItem().toString()));
        }else if((dateRadioBtn.isSelected())
            && (departureRadioBtn.isSelected())
            && (!ArrivalRadioBtn.isSelected())
            && (PreRadioBtn.isSelected())){
            List<Flight> searchList1 = MasterTravelSchedule.getInstance().searchFlightByDate(this.allFlightList, dataComBox.getSelectedItem().toString());
            List<Flight> searchList2 = MasterTravelSchedule.getInstance().searchFlightByDeparture(searchList1, departLocationComBox.getSelectedItem().toString());
            populateFlight((List<Flight>) MasterTravelSchedule.getInstance().searchFlightByTimeRange(searchList2, preferrenceComBox.getSelectedItem().toString()));
        }else if((dateRadioBtn.isSelected())
            && (departureRadioBtn.isSelected())
            && (ArrivalRadioBtn.isSelected())
            && (!PreRadioBtn.isSelected())){
            List<Flight> searchList1 = MasterTravelSchedule.getInstance().searchFlightByDate(this.allFlightList, dataComBox.getSelectedItem().toString());
            List<Flight> searchList2 = MasterTravelSchedule.getInstance().searchFlightByDeparture(searchList1, departLocationComBox.getSelectedItem().toString());
            populateFlight((List<Flight>) MasterTravelSchedule.getInstance().searchFlightByArrival(searchList2, ArrivalLocationComBox1.getSelectedItem().toString()));
        }else if((dateRadioBtn.isSelected())
            && (departureRadioBtn.isSelected())
            && (ArrivalRadioBtn.isSelected())
            && (PreRadioBtn.isSelected())){
            List<Flight> searchList1 = MasterTravelSchedule.getInstance().searchFlightByDate(this.allFlightList, dataComBox.getSelectedItem().toString());
            List<Flight> searchList2 = MasterTravelSchedule.getInstance().searchFlightByDeparture(searchList1, departLocationComBox.getSelectedItem().toString());
            List<Flight> searchList3 = MasterTravelSchedule.getInstance().searchFlightByTimeRange(searchList2, preferrenceComBox.getSelectedItem().toString());
            populateFlight((List<Flight>) MasterTravelSchedule.getInstance().searchFlightByArrival(searchList3, ArrivalLocationComBox1.getSelectedItem().toString()));
        }
    }//GEN-LAST:event_findPreferBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        cardSequenceJPanel.remove(this);
        CardLayout layout = (CardLayout) cardSequenceJPanel.getLayout();
        layout.previous(cardSequenceJPanel);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ArrivalLocationComBox1;
    private javax.swing.JRadioButton ArrivalRadioBtn;
    private javax.swing.JRadioButton PreRadioBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JComboBox<String> dataComBox;
    private javax.swing.JRadioButton dateRadioBtn;
    private javax.swing.JComboBox<String> departLocationComBox;
    private javax.swing.JRadioButton departureRadioBtn;
    private javax.swing.JButton findPreferBtn;
    private javax.swing.JComboBox<String> flightCombox;
    private javax.swing.JTable flightJTable;
    private javax.swing.JRadioButton flightRadioBtn;
    private javax.swing.JRadioButton flightSearchRedio2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> preferrenceComBox;
    // End of variables declaration//GEN-END:variables
}
