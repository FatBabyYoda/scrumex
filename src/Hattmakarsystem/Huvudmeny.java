/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Hattmakarsystem;

import static Hattmakarsystem.Databaskoppling.koppling;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author Simon
 */
public class Huvudmeny extends javax.swing.JFrame {

    /**
     * Creates new form Huvudmeny
     */
    public Huvudmeny() {
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

        jLabel1 = new javax.swing.JLabel();
        jRegistreraKund = new javax.swing.JButton();
        jSeOrdrar = new javax.swing.JButton();
        jSeMateriallista = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jAvregistrera = new javax.swing.JButton();
        jAvbryt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Välkommen in!");

        jRegistreraKund.setText("Registrera kund");
        jRegistreraKund.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRegistreraKundActionPerformed(evt);
            }
        });

        jSeOrdrar.setText("Se ordrar");
        jSeOrdrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSeOrdrarActionPerformed(evt);
            }
        });

        jSeMateriallista.setText("Se materiallista");
        jSeMateriallista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSeMateriallistaActionPerformed(evt);
            }
        });

        jButton4.setText("Registrera beställningar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jAvregistrera.setText("Avregistrera kund");
        jAvregistrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAvregistreraActionPerformed(evt);
            }
        });

        jAvbryt.setText("Avbryt");
        jAvbryt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAvbrytActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jRegistreraKund, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeOrdrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeMateriallista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jAvregistrera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(122, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jAvbryt)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addComponent(jRegistreraKund)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeMateriallista)
                .addGap(12, 12, 12)
                .addComponent(jSeOrdrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jAvregistrera)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jAvbryt)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jAvregistrera, jButton4, jRegistreraKund, jSeMateriallista, jSeOrdrar});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRegistreraKundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRegistreraKundActionPerformed
       LaggaTillKund Kundruta = new LaggaTillKund();
        Kundruta.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jRegistreraKundActionPerformed

    private void jSeMateriallistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSeMateriallistaActionPerformed
       MaterialLista materialMeny = new MaterialLista();
        materialMeny.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jSeMateriallistaActionPerformed

    private void jSeOrdrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSeOrdrarActionPerformed
      SeOrdrar seOrder = new SeOrdrar();
        seOrder.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jSeOrdrarActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       RegistreraBestallningLagerforda registreraBest = new RegistreraBestallningLagerforda();
        registreraBest.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jAvregistreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAvregistreraActionPerformed
         AvregistreraKund Avregistrera = new AvregistreraKund();
        Avregistrera.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jAvregistreraActionPerformed

    private void jAvbrytActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAvbrytActionPerformed
dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jAvbrytActionPerformed

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
            java.util.logging.Logger.getLogger(Huvudmeny.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Huvudmeny.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Huvudmeny.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Huvudmeny.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Huvudmeny().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jAvbryt;
    private javax.swing.JButton jAvregistrera;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jRegistreraKund;
    private javax.swing.JButton jSeMateriallista;
    private javax.swing.JButton jSeOrdrar;
    // End of variables declaration//GEN-END:variables
}
