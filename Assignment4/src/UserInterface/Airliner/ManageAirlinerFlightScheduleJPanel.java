/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Airliner;

/**
 *
 * @author gaomc
 */
public class ManageAirlinerFlightScheduleJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageAirlinerFlightScheduleJPanel
     */
    public ManageAirlinerFlightScheduleJPanel() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        flightSchedJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        viewFlightBtn = new javax.swing.JButton();
        newFlightBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        flightSchedJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Airlines"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(flightSchedJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 135, 440, 160));

        jLabel1.setText("Manage Flights");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 95, -1, -1));

        viewFlightBtn.setText("View Flight >>");
        add(viewFlightBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 475, -1, -1));

        newFlightBtn.setText("New Flight >>");
        add(newFlightBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 435, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable flightSchedJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton newFlightBtn;
    private javax.swing.JButton viewFlightBtn;
    // End of variables declaration//GEN-END:variables
}
