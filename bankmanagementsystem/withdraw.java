/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bankmanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class withdraw extends javax.swing.JFrame {
      public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new withdraw().setVisible(true);
            }
        });
    }
    String amt;
    private int deposit;
    
    int apin;
    int pin;
    
    public withdraw()
    {
        
        initComponents();
        jButton3.setVisible(false);
    }
   
   
    /**
     * Creates new form withdraw
     */
   
        

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        withdrawamt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        jLabel1.setText("Cash Withdrawal");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 400, 130, -1));

        withdrawamt.setFont(new java.awt.Font("Segoe UI Variable", 1, 12)); // NOI18N
        withdrawamt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawamtActionPerformed(evt);
            }
        });
        getContentPane().add(withdrawamt, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 450, 90, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Enter  pin");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 450, 110, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 540, -1, -1));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("OK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 490, -1, -1));

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("withdraw");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 540, 100, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Desktop\\atm.jfif")); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -110, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Transactions().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
                                         
          String pino=withdrawamt.getText();
          apin=Integer.parseInt(pino);
          jButton2.setVisible(false);
          jLabel2.setText("Enter the amount");
          jButton3.setVisible(true);
          withdrawamt.setText("");
          
      

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/bank", "root", "");
            PreparedStatement ps = con.prepareStatement("SELECT pin, deposit from customer where pin=? ");
            ps.setInt(1, apin);
          
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                pin = rs.getInt("pin");
                deposit = rs.getInt("deposit");
            }
            else {
                 // Handle the case when no rows were found in the result set
                 JOptionPane.showMessageDialog(null, "Customer not found.");
                 new Transactions().setVisible(true); // Exit the method to avoid further processing
             }

             amt = withdrawamt.getText();
             if("".equals(amt)){
                 
                 JOptionPane.showMessageDialog(null, "enter a valid amount"); 
             }
          
            int withdraw = Integer.parseInt(amt);
            System.out.println("Deposit: " + deposit);
            System.out.println("Withdrawal amount: " + withdraw);

            if (withdraw > deposit) {
                JOptionPane.showMessageDialog(null, "Requested amount greater than deposit");
            } else {
                int newamt = deposit - withdraw;
                PreparedStatement updatePs = con.prepareStatement("UPDATE customer set deposit=? where pin=?");
                updatePs.setInt(1, newamt);
                updatePs.setInt(2, pin);
                updatePs.executeUpdate();
                JOptionPane.showMessageDialog(null, "RS." + withdraw + " withdrawn successfully");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(withdraw.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }//GEN-LAST:event_jButton3ActionPerformed

    private void withdrawamtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawamtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_withdrawamtActionPerformed

    
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField withdrawamt;
    // End of variables declaration//GEN-END:variables
} 
