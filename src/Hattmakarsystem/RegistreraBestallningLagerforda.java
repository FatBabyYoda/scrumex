/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Hattmakarsystem;

import java.util.ArrayList;
import javax.mail.MessagingException;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author filip
 */
public class RegistreraBestallningLagerforda extends javax.swing.JFrame {

    /**
     * Creates new form RegistreraBestallningLagerforda
     */
    public RegistreraBestallningLagerforda() {
        initComponents();
        Databaskoppling.koppling();
        fyllCbValjKund();
    }
   
    
    private void fyllCbValjKund(){
        String fraga = "SELECT email from kund";
        ArrayList<String> allaKunder ;
        
        try{ 
            allaKunder = Databaskoppling.idb.fetchColumn(fraga);
            
           for(String email:allaKunder){
               cbValjKund.addItem(email); 
           }
               
           
        } catch(InfException undantag){
            JOptionPane.showMessageDialog(null, "fel i databasen");
            System.out.println("Fel i databasen" + undantag.getMessage());
        }
                
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbValjKund = new javax.swing.JComboBox<>();
        lblTitel = new javax.swing.JLabel();
        lblModell = new javax.swing.JLabel();
        lblKund = new javax.swing.JLabel();
        btnRegistrera = new javax.swing.JButton();
        cbxModell1 = new javax.swing.JCheckBox();
        spModell1 = new javax.swing.JSpinner();
        cbxModell2 = new javax.swing.JCheckBox();
        spModell2 = new javax.swing.JSpinner();
        cbxModell3 = new javax.swing.JCheckBox();
        spModell3 = new javax.swing.JSpinner();
        tfDatum = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cbValjKund.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblTitel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitel.setText("Registrera en beställning på lagerförda modeller");

        lblModell.setText("Välj modell");

        lblKund.setText("Välj kund");

        btnRegistrera.setText("Registrera");
        btnRegistrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistreraActionPerformed(evt);
            }
        });

        cbxModell1.setText("1");
        cbxModell1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxModell1ActionPerformed(evt);
            }
        });

        cbxModell2.setText("2");

        cbxModell3.setText("3");

        tfDatum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDatumActionPerformed(evt);
            }
        });

        jLabel1.setText("Välj datum");

        jButton1.setText("Tillbaka");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitel)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(cbxModell2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbxModell1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbxModell3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(spModell1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(spModell2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(spModell3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(lblModell))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(122, 122, 122)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbValjKund, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblKund)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(123, 123, 123)
                                        .addComponent(jLabel1))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnRegistrera)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1)))))
                .addGap(19, 19, 19))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnRegistrera, jButton1});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitel)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(lblKund)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbValjKund, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(lblModell)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spModell1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxModell1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbxModell2)
                            .addComponent(spModell2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(4, 4, 4)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxModell3)
                    .addComponent(spModell3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btnRegistrera))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnRegistrera, jButton1});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistreraActionPerformed
        // TODO add your handling code here:
String valdKund = cbValjKund.getSelectedItem().toString();

try{
String senastOrderFraga = "SELECT MAX(orderid) AS senaste_order_id FROM order";
String senasteOrderIdStr = Databaskoppling.idb.fetchSingle(senastOrderFraga);

int senasteOrderId = Integer.parseInt(senasteOrderIdStr);
int nyttOrderId = senasteOrderId + 1;
String laggTillOrder = "INSERT INTO Order (orderid, status, typ, orderdate, anvandare, kund)" 
 + "VALUES ('" + nyttOrderId + "', '" + "Ej påbörjad" + "', '" + "Lagerförd" + "', '" + tfDatum.getText() + "', '" + 0 + "', '" + valdKund + "')";
 Databaskoppling.idb.insert(laggTillOrder);
 
 // Skicka epostbekräftelse till den kund som ordern tillhör
 eSender.sendComfirmation(valdKund);
 
// Lägg till ordern och respektive modeller samt antal i harprodukt tabellen 
if(cbxModell1.isSelected()){
String laggTillModell1 = "INSERT INTO harprodukt (lagerprodukt, ordrar, antal)"
 + "VALUES ('" + cbxModell1.getText() + "', '" + nyttOrderId + "', '" + spModell1.getValue() + "')";
 Databaskoppling.idb.insert(laggTillModell1);}
if(cbxModell2.isSelected()){
String laggTillModell2 = "INSERT INTO harprodukt (lagerprodukt, ordrar, antal)"
 + "VALUES ('" + cbxModell2.getText() + "', '" + nyttOrderId + "', '" + spModell2.getValue() + "')";
 Databaskoppling.idb.insert(laggTillModell2);}
if(cbxModell3.isSelected()){
String laggTillModell3 = "INSERT INTO harprodukt (lagerprodukt, ordrar, antal)"
 + "VALUES ('" + cbxModell3.getText() + "', '" + nyttOrderId + "', '" + spModell3.getValue() + "')";
 Databaskoppling.idb.insert(laggTillModell3);}
                       
}catch(InfException undantag){
JOptionPane.showMessageDialog(null, "Fel i databasen");
System.out.println("Fel i databasen" + undantag.getMessage());
}catch(MessagingException e){
JOptionPane.showMessageDialog(null, "Något gick snett!");
System.out.println("Fel i databasen" + e.getMessage());
}
    }//GEN-LAST:event_btnRegistreraActionPerformed

    private void cbxModell1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxModell1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxModell1ActionPerformed

    private void tfDatumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDatumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDatumActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Huvudmeny tillbakaMeny = new Huvudmeny();
        tillbakaMeny.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(RegistreraBestallningLagerforda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistreraBestallningLagerforda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistreraBestallningLagerforda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistreraBestallningLagerforda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistreraBestallningLagerforda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrera;
    private javax.swing.JComboBox<String> cbValjKund;
    private javax.swing.JCheckBox cbxModell1;
    private javax.swing.JCheckBox cbxModell2;
    private javax.swing.JCheckBox cbxModell3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblKund;
    private javax.swing.JLabel lblModell;
    private javax.swing.JLabel lblTitel;
    private javax.swing.JSpinner spModell1;
    private javax.swing.JSpinner spModell2;
    private javax.swing.JSpinner spModell3;
    private javax.swing.JTextField tfDatum;
    // End of variables declaration//GEN-END:variables
}
