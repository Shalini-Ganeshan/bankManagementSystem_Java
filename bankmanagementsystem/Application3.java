/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
 package bankmanagementsystem;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS
 */
public class Application3 extends javax.swing.JFrame {
  
    private Random ran;
    int cardnumber;
    int pin;
    String acctype;
    String name;
    String fathername;
    String dob;
    
    String gender;
       
    String email;
    String maritalstatus;
    String address;
    String state;
    String pincode;
    String religion;
    String category;     
    String educationalqualification ;  
    String occupation;
    String income;
    String aadhar;
    String pan;
    String senior;
    String existing;
    String city;
    
    public Application3() {
        initComponents();
        ran = new Random();
        cardnumber = ran.nextInt(65536);
        int min = 1000; // Minimum 4-digit number
        int max = 9999; // Maximum 4-digit number
        pin = ran.nextInt(max - min + 1) + min;}
 public void setVariablesFromApp2(String name, String fathername, String dob, String gender, String email, String maritalstatus, String address, String city, String state, String pincode, String religion, String category, String educationalqualification, String occupation, String income, String aadhar, String pan, String senior, String existing) {
        this.name = name;
        this.fathername = fathername;
        this.dob = dob;
        this.gender = gender;
        this.email = email;
        this.maritalstatus = maritalstatus;
        this.address = address;
        this.city = city;
        this.state = state;
        this.pincode = pincode;
        this.religion = religion;
        this.category = category;
        this.educationalqualification = educationalqualification;
        this.occupation = occupation;
        this.income = income;
        this.aadhar = aadhar;
        this.pan = pan;
        this.senior = senior;
        this.existing = existing;
    }
         

    // ... Other methods remain the same ...

   

    // ... Rest of your code ...

  
         public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Application3().setVisible(true);
            }
        });
    }

      
    

    
    



    


    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 0, 0);

        jLabel2.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        jLabel2.setText("Page 3 : Account Details");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(230, 40, 230, 38);

        jLabel3.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        jLabel3.setText("Account Type:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 102, 157, 35);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        jRadioButton2.setText("Fixed Deposit Account   ");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(361, 155, 240, 30);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        jRadioButton1.setText("Saving Account");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(171, 155, 160, 30);

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        jRadioButton3.setText("Current Account");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton3);
        jRadioButton3.setBounds(171, 222, 176, 29);

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        jRadioButton4.setText("Recurring Deposit Account");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton4);
        jRadioButton4.setBounds(359, 222, 253, 29);

        jLabel4.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 0, 0);

        jLabel5.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        jLabel5.setText("PIN");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 320, 37, 25);

        jLabel7.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        jLabel7.setText("Services Required");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(40, 404, 158, 25);

        jCheckBox1.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        jCheckBox1.setText("ATM CARD");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1);
        jCheckBox1.setBounds(120, 470, 129, 29);

        jCheckBox2.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        jCheckBox2.setText("Mobile Banking");
        getContentPane().add(jCheckBox2);
        jCheckBox2.setBounds(120, 510, 166, 29);

        jCheckBox3.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        jCheckBox3.setText("Cheque Book");
        getContentPane().add(jCheckBox3);
        jCheckBox3.setBounds(0, 0, 0, 0);

        jCheckBox4.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        jCheckBox4.setText("Internet Banking");
        getContentPane().add(jCheckBox4);
        jCheckBox4.setBounds(326, 460, 180, 29);

        jCheckBox5.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        jCheckBox5.setText("E-mail Alerts");
        getContentPane().add(jCheckBox5);
        jCheckBox5.setBounds(326, 507, 140, 29);

        jCheckBox6.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        jCheckBox6.setText("E-Statement");
        getContentPane().add(jCheckBox6);
        jCheckBox6.setBounds(326, 548, 127, 29);

        jLabel6.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        jLabel6.setText("  XXXX (4-DIGIT PIN)");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(160, 320, 191, 25);

        jCheckBox7.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        jCheckBox7.setText("Cheque Book");
        jCheckBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox7ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox7);
        jCheckBox7.setBounds(120, 550, 140, 29);

        jCheckBox8.setFont(new java.awt.Font("Segoe UI Variable", 1, 12)); // NOI18N
        jCheckBox8.setText("I hereby declare that the above stated details are true to the best of my knowledge");
        jCheckBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox8ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox8);
        jCheckBox8.setBounds(60, 640, 560, 20);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(150, 710, 130, 40);

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(350, 710, 120, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jCheckBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox7ActionPerformed

    private void jCheckBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox8ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
         try {if(jRadioButton1.isSelected()){
                acctype=jRadioButton1.getText();}
         else if(jRadioButton2.isSelected()){
                acctype=jRadioButton2.getText();
              }
         else if(jRadioButton3.isSelected()){
              acctype=jRadioButton3.getText();}
         else{
                acctype=jRadioButton4.getText();
              }
         
               
        
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/bank","root","");
           
            PreparedStatement ps = con.prepareStatement("INSERT INTO customer(name,`father name`,dob,gender,email,`marital status`,address,city,state,pincode,religion,category, `educational qualification`,occupation,income,aadhar, `pan number`, isseniorcitizen, `existing account`, acctype,pin,`card number`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

          
              ps.setString(1,name);
              ps.setString(2,fathername);
              ps.setString(3,dob);
              ps.setString(4,gender);
              ps.setString(5,email);
              ps.setString(6,maritalstatus);
              ps.setString(7,address);
              ps.setString(8,city);
              ps.setString(9,state);
              ps.setString(10,pincode);
              ps.setString(11,religion);
              ps.setString(12,category);
              ps.setString(13,educationalqualification);
              ps.setString(14,occupation);
              ps.setString(15,income);
              ps.setString(16,aadhar);
              ps.setString(17,pan);
              ps.setString(18,senior);
              ps.setString(19,existing);
              ps.setString(20,acctype);
              ps.setInt(21,pin);
              ps.setInt(22,cardnumber);
              
              
              
             
              ps.executeUpdate();
              
        } catch (HeadlessException | ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Application3.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
        JOptionPane.showMessageDialog(this, "Card Number:"+cardnumber+"\n"+"Pin Number:"+pin);
        this.dispose();
        Transactions atm=new Transactions();
        atm.setVariablesfromApp3(pin);
        atm.setVisible(true);
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    // End of variables declaration//GEN-END:variables
}
