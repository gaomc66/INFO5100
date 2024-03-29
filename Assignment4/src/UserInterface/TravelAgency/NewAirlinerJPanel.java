/*
 * HappyLamb - TravelAgencySystem
 * Each line should be prefixed with  * 
 */
package UserInterface.TravelAgency;

import Business.Airliner.Airliner;
import Business.TravelAgency.TravelAgency;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author sallywang
 */
public class NewAirlinerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NewAirlinerJPanel
     */
    private TravelAgency travelAgency;
    private JPanel cardSequenceJPanel;
    
    public NewAirlinerJPanel(TravelAgency travelAgency, JPanel cardSequenceJPanel) {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        backjButton = new javax.swing.JButton();
        namejTextField = new javax.swing.JTextField();
        userNamejTextField = new javax.swing.JTextField();
        savejButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        passwordjTextField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("user name:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 103, -1, -1));

        jLabel2.setText("name：");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 71, -1, -1));

        backjButton.setText("<< back");
        backjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButtonActionPerformed(evt);
            }
        });
        jPanel1.add(backjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, -1, -1));

        namejTextField.setEditable(false);
        jPanel1.add(namejTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 66, 80, -1));

        userNamejTextField.setEditable(false);
        userNamejTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNamejTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(userNamejTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 98, 80, -1));

        savejButton.setText("save");
        savejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savejButtonActionPerformed(evt);
            }
        });
        jPanel1.add(savejButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, -1, -1));

        jLabel3.setText("password:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 141, -1, -1));

        passwordjTextField.setEditable(false);
        passwordjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordjTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(passwordjTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 136, 80, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 400, 340));
    }// </editor-fold>//GEN-END:initComponents

    private void backjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButtonActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout)cardSequenceJPanel.getLayout();
        cardSequenceJPanel.remove(this);
        layout.previous(cardSequenceJPanel);

        Component[] comps = cardSequenceJPanel.getComponents();
        for(Component comp : comps){
            if(comp instanceof ManageAirlinerJPanel){
                ManageAirlinerJPanel manage = (ManageAirlinerJPanel)comp;
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
        }else if(travelAgency.isAirlinerNameDuplicated(name)){
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
        
        String passWord = passwordjTextField.getText();String newPassWord;
        if(passWord.equals("")||passWord.startsWith(" ")){
            JOptionPane.showMessageDialog(null, "Please do not input password start with space");
        }else{
            passwordCorrect = true;
        }
        
        if(nameCorrect&&usernameCorrect&&passwordCorrect){
            JOptionPane.showMessageDialog(null, "Successly add a new airliner!");
            travelAgency.addAirliner(name, username, passWord);
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField namejTextField;
    private javax.swing.JTextField passwordjTextField;
    private javax.swing.JButton savejButton;
    private javax.swing.JTextField userNamejTextField;
    // End of variables declaration//GEN-END:variables
}
