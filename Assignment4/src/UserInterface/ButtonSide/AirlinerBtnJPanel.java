/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ButtonSide;

/**
 *
 * @author gaomc
 */
public class AirlinerBtnJPanel extends javax.swing.JPanel {

    /**
     * Creates new form TravelAgencyBtnJPanel
     */
    public AirlinerBtnJPanel() {
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

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        goAirlinerBtn = new javax.swing.JButton();
        airlinerListComBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Airliner name:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Manage Flight");
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jLabel2.setText("// -> flight Schedule");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, -1));

        goAirlinerBtn.setBackground(new java.awt.Color(255, 255, 255));
        goAirlinerBtn.setText("GO");
        add(goAirlinerBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, -1, -1));

        airlinerListComBox.setBackground(new java.awt.Color(255, 255, 255));
        airlinerListComBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(airlinerListComBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, -1, -1));

        jLabel3.setText("// airliners name");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, -1, -1));

        jLabel4.setText("// fleet : manage several flight");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        jLabel5.setText("// each airline has only on Fleet");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> airlinerListComBox;
    private javax.swing.JButton goAirlinerBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
