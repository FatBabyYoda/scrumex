/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Hattmakarsystem;

import static Hattmakarsystem.Databaskoppling.koppling;
import oru.inf.InfDB;
import oru.inf.InfException;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author osman
 */
public class SkrivUtFraktsedel extends javax.swing.JFrame {

    /**
     * Creates new form SkrivUtFraktsedel
     */
    public SkrivUtFraktsedel() {
        initComponents();
        koppling();
        fyllcbBox();

    }

    public void fyllcbBox() {
        String fraga = "SELECT namn FROM kund";
        ArrayList<String> kundNamn;

        try {
            kundNamn = Databaskoppling.idb.fetchColumn(fraga);
            //DefaultComboBoxModel<String> comboBoxModell = new DefaultComboBoxModel<>();
            for (String n : kundNamn) {
                jSokKundBox.addItem(n);
            }

            //jSokKundBox.setModel(comboBoxModell);
            //jSokKundBox.setEnabled(true);
        } catch (InfException ex) {
            ex.printStackTrace();
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

        jSokKundBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jVisa = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jKundTabell = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSokKundBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSokKundBoxActionPerformed(evt);
            }
        });

        jLabel1.setText("Välj kund");

        jVisa.setText("Visa");
        jVisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jVisaActionPerformed(evt);
            }
        });

        jKundTabell.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Namn", "Address", "Email", "Telefonnummer", "Typ", "Orderdatum", "Pris", "Totalpris"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jKundTabell.setRowHeight(30);
        jKundTabell.setRowMargin(10);
        jScrollPane2.setViewportView(jKundTabell);

        jButton1.setText("Tillbaka");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Skriv ut");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 712, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jSokKundBox, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jVisa)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jVisa});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jSokKundBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jVisa)
                        .addComponent(jButton1))
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton1, jVisa});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void jSokKundBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSokKundBoxActionPerformed

    }//GEN-LAST:event_jSokKundBoxActionPerformed

    private void jVisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jVisaActionPerformed

        try {
            String valdKund = jSokKundBox.getSelectedItem().toString();

            String hamtaKund = "SELECT address, email, namn, telf FROM kund WHERE namn = '" + valdKund + "'";
            String hamtaOrder = "SELECT typ, orderdate, totpris FROM ordrar";
            String hamtaSpec = "SELECT pris FROM specialbestallning";

            HashMap<String, String> kund = Databaskoppling.idb.fetchRow(hamtaKund);
            HashMap<String, String> ordrar = Databaskoppling.idb.fetchRow(hamtaOrder);
            HashMap<String, String> spec = Databaskoppling.idb.fetchRow(hamtaSpec);

            DefaultTableModel model = (DefaultTableModel) jKundTabell.getModel();

            model.setRowCount(0);

            model.addRow(new Object[]{
                kund.get("namn"),
                kund.get("address"),
                kund.get("email"),
                kund.get("telf"),
                ordrar.get("typ"),
                ordrar.get("orderdate"),
                ordrar.get("totpris"),
                spec.get("pris")
                
            });

        } catch (InfException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jVisaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Huvudmeny tillbakaMeny = new Huvudmeny();
        tillbakaMeny.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int valdRad = jKundTabell.getSelectedRow();
        
        if (valdRad < 0) {
            JOptionPane.showMessageDialog(this, "Ingen kund vald");
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(SkrivUtFraktsedel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SkrivUtFraktsedel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SkrivUtFraktsedel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SkrivUtFraktsedel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SkrivUtFraktsedel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JTable jKundTabell;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> jSokKundBox;
    private javax.swing.JButton jVisa;
    // End of variables declaration//GEN-END:variables
}
