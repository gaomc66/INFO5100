/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import cargenerator.Car;
import javax.swing.JOptionPane;

import java.io.File;
import javax.swing.*;
import java.awt.Image;


/**
 *
 * @author gaomc
 */
public class CreateJPanel extends javax.swing.JPanel {

    private Car car;
    
    /**
     * Creates new form CreateJPanel
     */
    public CreateJPanel(Car car) {
        initComponents();
        this.car = car;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        chosePicBtn = new javax.swing.JButton();
        generateCarBtn = new javax.swing.JButton();
        transmissionField = new javax.swing.JTextField();
        cancelBtn = new javax.swing.JButton();
        serialNumField = new javax.swing.JTextField();
        dimensionField = new javax.swing.JTextField();
        carFaxNumField = new javax.swing.JTextField();
        brandLabel = new javax.swing.JLabel();
        modelLabel = new javax.swing.JLabel();
        drivetrainsLabel = new javax.swing.JLabel();
        enginesLabel = new javax.swing.JLabel();
        styleLabel = new javax.swing.JLabel();
        exteriorColorLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        brandField = new javax.swing.JTextField();
        interiorColorLabel = new javax.swing.JLabel();
        msprLabel = new javax.swing.JLabel();
        modelField = new javax.swing.JTextField();
        fuelTypeLabel = new javax.swing.JLabel();
        drivetrainsField = new javax.swing.JTextField();
        mpgLabel = new javax.swing.JLabel();
        enginesField = new javax.swing.JTextField();
        mileageLabel = new javax.swing.JLabel();
        styleField = new javax.swing.JTextField();
        transmissionLabel = new javax.swing.JLabel();
        exteriorColorField = new javax.swing.JTextField();
        serialNumLabel = new javax.swing.JLabel();
        interiorColorField = new javax.swing.JTextField();
        dimensionLabel = new javax.swing.JLabel();
        msprField = new javax.swing.JTextField();
        carFaxLabel = new javax.swing.JLabel();
        fuelTypeField = new javax.swing.JTextField();
        chosePicLabel = new javax.swing.JLabel();
        mpgField = new javax.swing.JTextField();
        mileageField = new javax.swing.JTextField();
        picPathField = new javax.swing.JTextField();
        photoComponent = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        chosePicBtn.setBackground(new java.awt.Color(255, 255, 255));
        chosePicBtn.setText("Chose Pic");
        chosePicBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chosePicBtnActionPerformed(evt);
            }
        });
        add(chosePicBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 420, -1, 40));

        generateCarBtn.setBackground(new java.awt.Color(255, 255, 255));
        generateCarBtn.setText("Generate Car");
        generateCarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateCarBtnActionPerformed(evt);
            }
        });
        add(generateCarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 449, 120, 60));

        transmissionField.setText("AUTO");
        transmissionField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transmissionFieldActionPerformed(evt);
            }
        });
        add(transmissionField, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 260, 177, -1));

        cancelBtn.setBackground(new java.awt.Color(255, 255, 255));
        cancelBtn.setText("Clear All");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });
        add(cancelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 449, 120, 60));

        serialNumField.setText("10AB*DFNF");
        serialNumField.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        add(serialNumField, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 300, 177, -1));

        dimensionField.setText("200*400");
        dimensionField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dimensionFieldActionPerformed(evt);
            }
        });
        add(dimensionField, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 330, 177, -1));

        carFaxNumField.setText("233200fff22s");
        carFaxNumField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carFaxNumFieldActionPerformed(evt);
            }
        });
        add(carFaxNumField, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 360, 177, -1));

        brandLabel.setText("Brand:");
        add(brandLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        modelLabel.setText("Model:");
        add(modelLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        drivetrainsLabel.setText("Drivetrains:");
        add(drivetrainsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        enginesLabel.setText("Engines:");
        add(enginesLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        styleLabel.setText("Style:");
        add(styleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        exteriorColorLabel.setText("ExteriorColor:");
        add(exteriorColorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));

        jLabel1.setFont(new java.awt.Font("Marion", 1, 24)); // NOI18N
        jLabel1.setText("Generate Your Own Car");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        brandField.setText("GMC");
        brandField.setSelectedTextColor(new java.awt.Color(204, 204, 204));
        brandField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brandFieldActionPerformed(evt);
            }
        });
        add(brandField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 177, -1));

        interiorColorLabel.setText("InteriorColor:");
        add(interiorColorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, 22));

        msprLabel.setText("MSPR");
        add(msprLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, -1, -1));

        modelField.setText("Terrain");
        modelField.setSelectedTextColor(new java.awt.Color(204, 204, 204));
        modelField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modelFieldActionPerformed(evt);
            }
        });
        add(modelField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 177, -1));

        fuelTypeLabel.setText("Fuel Type:");
        add(fuelTypeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, -1, -1));

        drivetrainsField.setText("AWD");
        drivetrainsField.setSelectedTextColor(new java.awt.Color(204, 204, 204));
        drivetrainsField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drivetrainsFieldActionPerformed(evt);
            }
        });
        add(drivetrainsField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 177, -1));

        mpgLabel.setText("MPG:");
        add(mpgLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, -1, -1));

        enginesField.setText("2.0L");
        enginesField.setSelectedTextColor(new java.awt.Color(204, 204, 204));
        enginesField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enginesFieldActionPerformed(evt);
            }
        });
        add(enginesField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 177, -1));

        mileageLabel.setText("Mileage:");
        add(mileageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, -1, -1));

        styleField.setText("SLT");
        styleField.setSelectedTextColor(new java.awt.Color(204, 204, 204));
        add(styleField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 177, -1));

        transmissionLabel.setText("Transmission:");
        add(transmissionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, -1, -1));

        exteriorColorField.setText("GRAY");
        exteriorColorField.setSelectedTextColor(new java.awt.Color(204, 204, 204));
        add(exteriorColorField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 177, -1));

        serialNumLabel.setText("Serial Number:");
        add(serialNumLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 300, -1, -1));

        interiorColorField.setText("JET BLACK");
        interiorColorField.setSelectedTextColor(new java.awt.Color(204, 204, 204));
        interiorColorField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                interiorColorFieldActionPerformed(evt);
            }
        });
        add(interiorColorField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 177, -1));

        dimensionLabel.setText("Dimenssion:");
        add(dimensionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, -1, -1));

        msprField.setText("22,000");
        msprField.setSelectedTextColor(new java.awt.Color(204, 204, 204));
        add(msprField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, 177, -1));

        carFaxLabel.setText("CarFax Number:");
        add(carFaxLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 360, -1, -1));

        fuelTypeField.setText("GAS");
        add(fuelTypeField, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, 177, -1));

        chosePicLabel.setText("Choose Your Pic:");
        add(chosePicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 400, -1, -1));

        mpgField.setText("29 CTY");
        add(mpgField, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 200, 177, -1));

        mileageField.setText("123,456");
        add(mileageField, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, 177, -1));

        picPathField.setText("Pic Path");
        picPathField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                picPathFieldActionPerformed(evt);
            }
        });
        add(picPathField, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 390, 177, -1));
        add(photoComponent, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 420, 150, 150));

        jLabel2.setText("Instruction: ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        jLabel3.setText(" change them individually.  ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 130, 180, 20));

        jLabel4.setText("* [Generate Car]: When you click \"Generate Car\" Button, all inputs will transfer to CAR class through setters.");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        jLabel5.setText("* [Clear All]:        There are some dafault input, you can click \"Clear All\" Button to clear them all, or you can ");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void chosePicBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chosePicBtnActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String filename = f.getAbsolutePath();
        
        picPathField.setText(filename);
        
        photoComponent.setIcon(ResizeImage(filename));

    }//GEN-LAST:event_chosePicBtnActionPerformed

    
    public ImageIcon ResizeImage(String ImagePath)
    {
        ImageIcon MyImage = new ImageIcon(ImagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(photoComponent.getWidth(), photoComponent.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }
    
    private void generateCarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateCarBtnActionPerformed
        // TODO add your handling code here:
        car.setBrand(brandField.getText());
        car.setModel(modelField.getText());
        car.setDrivetrains(drivetrainsField.getText());
        car.setEngines(enginesField.getText());
        car.setStyle(styleField.getText());
        car.setExteriorColor(exteriorColorField.getText());
        car.setInteriorColor(interiorColorField.getText());
        car.setMspr(msprField.getText());
        car.setFuelType(fuelTypeField.getText());
        car.setMpg(mpgField.getText());
        car.setMileage(mileageField.getText());
        car.setTransmission(transmissionField.getText());
        car.setSerialNum(serialNumField.getText());
        car.setDimension(dimensionField.getText());
        car.setCarFaxNum(carFaxNumField.getText());
        car.setImgPath(picPathField.getText());

        JOptionPane.showMessageDialog(null,"Create Product Successfully");

    }//GEN-LAST:event_generateCarBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        // TODO add your handling code here:
        brandField.setText("");
        
        modelField.setText("");
        
        drivetrainsField.setText("");
        
        enginesField.setText("");
        
        styleField.setText("");
        
        exteriorColorField.setText("");
        
        interiorColorField.setText("");
        
        msprField.setText("");
        
        fuelTypeField.setText("");
        
        mpgField.setText("");
        
        mileageField.setText("");
        
        transmissionField.setText("");
        
        serialNumField.setText("");
        
        dimensionField.setText("");
        
        carFaxNumField.setText("");
        
        picPathField.setText("");
                
        
        photoComponent.setIcon(null);

        
        JOptionPane.showMessageDialog(null,"Your inputs have been canceled");

        
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void dimensionFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dimensionFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dimensionFieldActionPerformed

    private void carFaxNumFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carFaxNumFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_carFaxNumFieldActionPerformed

    private void brandFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brandFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_brandFieldActionPerformed

    private void drivetrainsFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drivetrainsFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_drivetrainsFieldActionPerformed

    private void enginesFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enginesFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enginesFieldActionPerformed

    private void interiorColorFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_interiorColorFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_interiorColorFieldActionPerformed

    private void picPathFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_picPathFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_picPathFieldActionPerformed

    private void modelFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modelFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modelFieldActionPerformed

    private void transmissionFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transmissionFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transmissionFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField brandField;
    private javax.swing.JLabel brandLabel;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JLabel carFaxLabel;
    private javax.swing.JTextField carFaxNumField;
    private javax.swing.JButton chosePicBtn;
    private javax.swing.JLabel chosePicLabel;
    private javax.swing.JTextField dimensionField;
    private javax.swing.JLabel dimensionLabel;
    private javax.swing.JTextField drivetrainsField;
    private javax.swing.JLabel drivetrainsLabel;
    private javax.swing.JTextField enginesField;
    private javax.swing.JLabel enginesLabel;
    private javax.swing.JTextField exteriorColorField;
    private javax.swing.JLabel exteriorColorLabel;
    private javax.swing.JTextField fuelTypeField;
    private javax.swing.JLabel fuelTypeLabel;
    private javax.swing.JButton generateCarBtn;
    private javax.swing.JTextField interiorColorField;
    private javax.swing.JLabel interiorColorLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField mileageField;
    private javax.swing.JLabel mileageLabel;
    private javax.swing.JTextField modelField;
    private javax.swing.JLabel modelLabel;
    private javax.swing.JTextField mpgField;
    private javax.swing.JLabel mpgLabel;
    private javax.swing.JTextField msprField;
    private javax.swing.JLabel msprLabel;
    private javax.swing.JLabel photoComponent;
    private javax.swing.JTextField picPathField;
    private javax.swing.JTextField serialNumField;
    private javax.swing.JLabel serialNumLabel;
    private javax.swing.JTextField styleField;
    private javax.swing.JLabel styleLabel;
    private javax.swing.JTextField transmissionField;
    private javax.swing.JLabel transmissionLabel;
    // End of variables declaration//GEN-END:variables
}
