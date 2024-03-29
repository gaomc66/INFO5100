/*
 * HappyLamb - TravelAgencySystem
 * Each line should be prefixed with  * 
 */
package UserInterface.TravelAgency;

import Business.TravelAgency.TravelAgency;
import Business.TravelOffice.TravelOffice;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author sallywang
 */
public class NewTravelOfficeJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NewTravelOfficeJPanel
     */
    private TravelAgency travelAgency;
    private JPanel cardSequenceJPanel;
    public NewTravelOfficeJPanel(TravelAgency travelAgency,JPanel cardSequenceJPanel) {
        initComponents();
        this.travelAgency = travelAgency;
        this.cardSequenceJPanel = cardSequenceJPanel;
        this.namejTextField.setEditable(true);
        this.userNamejTextField.setEditable(true);
        this.passwordjTextField.setEditable(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        passwordjTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        userNamejTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        namejTextField = new javax.swing.JTextField();
        backjButton = new javax.swing.JButton();
        savejButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        passwordjTextField.setEditable(false);
        passwordjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordjTextFieldActionPerformed(evt);
            }
        });
        add(passwordjTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 80, -1));

        jLabel3.setText("password:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, -1));

        jLabel1.setText("user name:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, -1));

        userNamejTextField.setEditable(false);
        userNamejTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNamejTextFieldActionPerformed(evt);
            }
        });
        add(userNamejTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 80, -1));

        jLabel2.setText("name：");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, -1, -1));

        namejTextField.setEditable(false);
        add(namejTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 80, -1));

        backjButton.setText("<< back");
        backjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButtonActionPerformed(evt);
            }
        });
        add(backjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, -1, -1));

        savejButton.setText("save");
        savejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savejButtonActionPerformed(evt);
            }
        });
        add(savejButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButtonActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout)cardSequenceJPanel.getLayout();
        cardSequenceJPanel.remove(this);
        layout.previous(cardSequenceJPanel);

        Component[] comps = cardSequenceJPanel.getComponents();
        for(Component comp : comps){
            if(comp instanceof ManageTravelOfficeJPanel){
                ManageTravelOfficeJPanel manage = (ManageTravelOfficeJPanel)comp;
                manage.populate();
            }
        }
    }//GEN-LAST:event_backjButtonActionPerformed

    private void userNamejTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNamejTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNamejTextFieldActionPerformed

    private void savejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savejButtonActionPerformed
        // TODO add your handling code here:
        boolean nameCorrect = false;
        boolean usernameCorrect = false;
        boolean passwordCorrect = false;
        String name = namejTextField.getText();
        if(name.equals("")||name.startsWith(" ")){
            JOptionPane.showMessageDialog(null, "Please do not input name start with space");
        }else if(travelAgency.isTravelOfficeNameDuplicated(name)){
            JOptionPane.showMessageDialog(null, "Please use another name, same name used");
        }else{
            nameCorrect = true;
        }

        String username = userNamejTextField.getText();
        if(username.equals("")||username.startsWith(" ")){
            JOptionPane.showMessageDialog(null, "Please do not input username start with space");
        }else if(travelAgency.isUserNameDuplicated(username)){
            JOptionPane.showMessageDialog(null, "Please use another user name, same user name used");
        }else{
            usernameCorrect = true;
        }

        String passWord = passwordjTextField.getText();
        if(passWord.equals("")||passWord.startsWith(" ")){
            JOptionPane.showMessageDialog(null, "Please do not input password start with space");
        }else{
            passwordCorrect = true;
        }

        if(nameCorrect&&usernameCorrect&&passwordCorrect){
            JOptionPane.showMessageDialog(null, "Successly add a new travel office!");
            TravelOffice to = travelAgency.addTravelOffice(name, username, passWord);
            System.out.println(to.getName());
            
            
            this.namejTextField.setText("");
            this.passwordjTextField.setText("");
            this.userNamejTextField.setText("");
        }
    }//GEN-LAST:event_savejButtonActionPerformed

    private void passwordjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordjTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordjTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backjButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField namejTextField;
    private javax.swing.JTextField passwordjTextField;
    private javax.swing.JButton savejButton;
    private javax.swing.JTextField userNamejTextField;
    // End of variables declaration//GEN-END:variables
}
