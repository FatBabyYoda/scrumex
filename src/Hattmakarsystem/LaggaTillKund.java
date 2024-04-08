/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Hattmakarsystem;

import static Hattmakarsystem.Databaskoppling.koppling;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author Simon
 */
public class LaggaTillKund extends javax.swing.JFrame {

    /**
     * Creates new form LäggaTillKund
     */
    public LaggaTillKund() {
        koppling();
         
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

        jLaggTill = new javax.swing.JButton();
        jTextNamn = new javax.swing.JTextField();
        jTextEmail = new javax.swing.JTextField();
        jTextTelefon = new javax.swing.JTextField();
        jTextAdress = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTillbaka = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLaggTill.setText("Lägg till kund");
        jLaggTill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLaggTillActionPerformed(evt);
            }
        });

        jTextNamn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNamnActionPerformed(evt);
            }
        });

        jTextEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextEmailActionPerformed(evt);
            }
        });

        jTextTelefon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextTelefonActionPerformed(evt);
            }
        });

        jTextAdress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextAdressActionPerformed(evt);
            }
        });

        jLabel1.setText("Namn");

        jLabel2.setText("Emailadress");

        jLabel3.setText("Telefonnummer");

        jLabel4.setText("Adress");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Här kan du lägga till information om en kund!");

        jTillbaka.setText("Tillbaka");
        jTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTillbakaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel5)
                .addContainerGap(75, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextAdress)
                                    .addComponent(jTextEmail)
                                    .addComponent(jTextNamn)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextTelefon))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLaggTill)))
                .addGap(18, 18, 18)
                .addComponent(jTillbaka, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel3, jLabel4});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextAdress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTillbaka)
                            .addComponent(jLaggTill))
                        .addContainerGap())))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jTextAdress, jTextEmail, jTextNamn, jTextTelefon});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel3, jLabel4});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLaggTillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLaggTillActionPerformed
if (!Valideringsklass.emptyTextFields(jTextNamn) && !Valideringsklass.emptyTextFields(jTextEmail)
        && !Valideringsklass.emptyTextFields(jTextTelefon) && !Valideringsklass.emptyTextFields(jTextAdress)
        ) {

    try {
        // Vi skapade variabler för att underlätta för oss själva och läsaren
        String nextID = Databaskoppling.idb.getAutoIncrement("kund", "kundid");
        
       
        String Epost = jTextEmail.getText();
        String telefon = jTextTelefon.getText();
        String namn = jTextNamn.getText();
        String Adress = jTextAdress.getText();
       

        
        int KundID = Integer.parseInt(nextID);
       
        ArrayList<String> NamnPaKund;
        NamnPaKund = Databaskoppling.idb.fetchColumn("select namn from kund");
        boolean finns = false;
        for (String enKund : NamnPaKund) {
            if (namn.equals(enKund)) {
                finns = true;
                break; // Sluta söka när vi har hittat det önskade resultatet
            }
        }

        if (!finns) {
            
            String SQLFRAGA = (Epost + "Insert into kund (kundid, namn, telf, email)"
                    + " VALUES ('" + KundID + "','" + namn + "','" + telefon + "','" + Adress 
                    );
            Databaskoppling.idb.insert(SQLFRAGA);
        } else {
            // Talar om att det sökta namnet redan finns och inte går att använda
            JOptionPane.showMessageDialog(null, "Registreringen gick inte igenom, försök igen!");
        }
         JOptionPane.showMessageDialog(null, "Registrering slutförd!");

                                             
      

    } catch (InfException exc) {
        JOptionPane.showMessageDialog(null, "FEL " + exc.getMessage()); 
    }

} else {
    JOptionPane.showMessageDialog(null, "Registreringen gick inte igenom, försök igen!");
}        // TODO add your handling code here:
    }//GEN-LAST:event_jLaggTillActionPerformed

    private void jTextAdressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextAdressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextAdressActionPerformed

    private void jTextEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextEmailActionPerformed

    private void jTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTillbakaActionPerformed
        Huvudmeny tillbakaMeny = new Huvudmeny();
        tillbakaMeny.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jTillbakaActionPerformed

    private void jTextNamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNamnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNamnActionPerformed

    private void jTextTelefonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextTelefonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextTelefonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LaggaTillKund.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LaggaTillKund.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LaggaTillKund.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LaggaTillKund.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LaggaTillKund().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jLaggTill;
    private javax.swing.JTextField jTextAdress;
    private javax.swing.JTextField jTextEmail;
    private javax.swing.JTextField jTextNamn;
    private javax.swing.JTextField jTextTelefon;
    private javax.swing.JButton jTillbaka;
    // End of variables declaration//GEN-END:variables
}
