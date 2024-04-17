/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Hattmakarsystem;

import static Hattmakarsystem.Databaskoppling.koppling;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.text.Utilities;
import oru.inf.InfException;

/**
 *
 * @author Simon
 */
public class Laggtillkund2 extends javax.swing.JFrame {

    /**
     * Creates new form Laggtillkund2
     */
    public Laggtillkund2() {
        initComponents();
          koppling();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextEmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextTelefon = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextAdress = new javax.swing.JTextField();
        jLaggTillKund = new javax.swing.JButton();
        jÄndraUppgifter = new javax.swing.JButton();
        jTextNamn = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        buttonSok = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Namn");

        jLabel3.setText("Emailadress");

        jTextEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextEmailActionPerformed(evt);
            }
        });

        jLabel4.setText("Telefonnummer");

        jLabel5.setText("Adress");

        jLaggTillKund.setText("Lägg till ny kund och gå vidare");
        jLaggTillKund.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLaggTillKundActionPerformed(evt);
            }
        });

        jÄndraUppgifter.setText("Ändra kunduppgifter och gå vidare");
        jÄndraUppgifter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jÄndraUppgifterActionPerformed(evt);
            }
        });

        jTextNamn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNamnActionPerformed(evt);
            }
        });

        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jLabel1.setText("Sök efter kund epost");

        buttonSok.setLabel("Sök");
        buttonSok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSokActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLaggTillKund)
                    .addComponent(jÄndraUppgifter))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(67, 67, 67)
                                .addComponent(jTextAdress, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(17, 17, 17)
                                .addComponent(jTextTelefon))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextNamn, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                                    .addComponent(jTextEmail))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 17, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(63, 63, 63)
                                        .addComponent(buttonSok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonSok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextAdress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jLaggTillKund)
                .addGap(18, 18, 18)
                .addComponent(jÄndraUppgifter)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextEmailActionPerformed

    private void jLaggTillKundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLaggTillKundActionPerformed
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
       

        
       // int KundID = Integer.parseInt(nextID);
       
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
            String SQLFRAGA = "INSERT INTO kund (kundid, address, email, namn, telf) VALUES ('" + nextID + "', '" + Adress + "','" + Epost + "','" + namn + "','" + telefon + "')";



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
    }//GEN-LAST:event_jLaggTillKundActionPerformed

    private void jÄndraUppgifterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jÄndraUppgifterActionPerformed
try {
    // Konstruera SQL-frågan för att uppdatera kunduppgifter
    String fragaTillDatabas = String.format("UPDATE kund " +
            "SET Namn = '%s', " +
            "Telf = '%s', " +
            "Address = '%s' " + // Lägg till ytterligare fält efter behov
            "WHERE Email = '%s'",
            jTextNamn.getText(), // Hämta det nya värdet från  GUI-komponent
            jTextTelefon.getText(),
            jTextAdress.getText(), // Lägg till motsvarande fält från  GUI
            jTextEmail.getText()); // Använd e-postadressen för att identifiera kunden att uppdatera

    // Utför SQL UPDATE-operationen genom att skicka frågan till databasen
   Databaskoppling.idb.update(fragaTillDatabas);

    // Visar en bekräftelse att kundens information har uppdaterats
    JOptionPane.showMessageDialog(null, "Kundens uppgifter är uppdaterade");

} catch (InfException e) {
    // Hanterar eventuella databasfel genom att skriva ut felmeddelandet
    System.out.println(e.getMessage());
    JOptionPane.showMessageDialog(null, e.getMessage());
}
     
    }//GEN-LAST:event_jÄndraUppgifterActionPerformed

    private void jTextNamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNamnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNamnActionPerformed

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
  
      int selectedIndex = jList1.getSelectedIndex();
    if (selectedIndex != -1) { // Kolla om en rad är vald
        String clickedLine = (String) jList1.getModel().getElementAt(selectedIndex);
        jTextField1.setText(clickedLine);
    }

    
    }//GEN-LAST:event_jList1MouseClicked

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        // TODO add your handling code here:
        DefaultListModel<String> listModel = Sok.sok(jTextField1.getText(), "kund", "email");
        jList1.setModel(listModel);
    }//GEN-LAST:event_jTextField1KeyReleased

    private void buttonSokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSokActionPerformed
            try{
            String kundEmail=jTextField1.getText();
            String hamtakund1 = "SELECT * FROM kund WHERE email = '" + kundEmail + "'";
       var hamtaKund=Databaskoppling.idb.fetchRow(hamtakund1)  ;
       
        jTextEmail.setText(hamtaKund.get("email"));
        
        jTextTelefon.setText(hamtaKund.get("telf"));
       jTextNamn.setText(hamtaKund.get("namn"));
        jTextAdress.setText(hamtaKund.get("address"));
          
        }
catch (InfException exc) {
        JOptionPane.showMessageDialog(null, "FEL " + exc.getMessage());
}
    }//GEN-LAST:event_buttonSokActionPerformed

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
            java.util.logging.Logger.getLogger(Laggtillkund2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Laggtillkund2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Laggtillkund2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Laggtillkund2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Laggtillkund2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button buttonSok;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jLaggTillKund;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextAdress;
    private javax.swing.JTextField jTextEmail;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextNamn;
    private javax.swing.JTextField jTextTelefon;
    private javax.swing.JButton jÄndraUppgifter;
    // End of variables declaration//GEN-END:variables
}