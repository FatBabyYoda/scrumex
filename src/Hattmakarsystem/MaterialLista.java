/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Hattmakarsystem;

import static Hattmakarsystem.Databaskoppling.koppling;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import oru.inf.InfException;

/**
 *
 * @author Rikard Söderek; Gustav Alvesvärd
 * @version 0.4
 */
public class MaterialLista extends javax.swing.JFrame {

            
    /**
     * Creates new form TestMaterialLista
     */
    //anropar ComboBox vid start för att ladda rätt alternativ i drop-down listan
    public MaterialLista() {
        initComponents();
        koppling();
//        typVal();
    }

    //    public void typVal(){
//        String sql = "";
//        ArrayList<String> lista2;
//        
//        try{
//            lista2 = Databaskoppling.idb.fetchColumn(sql);
//            for(String namn : lista2){
//                jComboBox1.addItem(namn);
//            }
//        }catch(InfException e){
//            JOptionPane.showMessageDialog(null, "Hoppsan! Något gick fel");
//            System.out.println("Internt felmeddelande: " + e.getMessage());
//        }
//    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jColorChooser1 = new javax.swing.JColorChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        jMaterialLista = new javax.swing.JList<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jHattarList = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jHattyp = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();

        jScrollPane2.setViewportView(jMaterialLista);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 102, 51));

        jHattarList.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jHattarList.setSelectionBackground(new java.awt.Color(153, 255, 153));
        jHattarList.setSelectionForeground(new java.awt.Color(51, 51, 51));
        jHattarList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jHattarListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jHattarList);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Material:");

        jHattyp.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jHattyp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jHattypActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Filtrera träffar:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("- Hitta material för hatt -");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setFocusable(false);
        jTextArea1.setSelectionColor(new java.awt.Color(153, 255, 153));
        jScrollPane4.setViewportView(jTextArea1);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Välj hatt:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jHattyp, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(154, 154, 154))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(252, 252, 252))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 22, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jHattyp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 153, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//    private void visaHattar() {
//        DefaultListModel<String> lista = Sok.sok(jHattyp.getText(), "lagerforda", "namn");
//        jHattarList.setModel(lista);
//    }
    
    private void jHattypActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jHattypActionPerformed
        //Sökning efter specifik hatt
        
        DefaultListModel<String> lista = Sok.sok(jHattyp.getText(), "lagerforda", "namn");
        jHattarList.setModel(lista);
        
    }//GEN-LAST:event_jHattypActionPerformed

    private void jHattarListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jHattarListMouseClicked
        //Klicka på hatt för att få upp material om den valda hatten

    int selectedIndex = jHattarList.getSelectedIndex();
   // if (selectedIndex != -1) { // Kontrollerar om en rad är vald
        String valtHattNamn = jHattarList.getModel().getElementAt(selectedIndex); // Hämta det valda hatt-namnet
        // HÄR
        // Här
        Databaskoppling.koppling();
 
        try {
        //ArrayList<String> test = Databaskoppling.idb.fetchColumn("select lagfordID from lagerforda where namn like '" + selectedIndex + "'");
        ArrayList<String> test = Databaskoppling.idb.fetchColumn("select lagfordID from lagerforda where namn like '" + selectedIndex + "'");
        for (String i :test){
        jTextArea1.append(i +"\n");
        }
        System.out.println(test);
        } catch (InfException ex) {
            System.out.println("bruh " + ex);
        }
        try {
        ArrayList<String> materialLista = Databaskoppling.idb.fetchColumn("select mangd from lagerproduktmaterial join lagerforda on lagerproduktmaterial.lagfordID = lagerforda.lagfordID where namn like '" + valtHattNamn + "';"); // Använd det valda hatt-namnet för att hämta material
        String[] materialArray = materialLista.toArray(String[]::new);

        // Create a JList with the array
        jMaterialLista = new JList<>(materialArray);

        // Add the JList to the JFrame or any other container
        add(new JScrollPane(jMaterialLista));

        //jMaterialLista.setModel(materialLista); // Sätt modellen med de hämtade materialen
        System.out.println(materialLista);
        
      StringBuilder sb = new StringBuilder();
        for (String item : materialArray) {
            sb.append(item).append("\n");
        }
        jTextArea1.setText(sb.toString());
        
     } catch (InfException ex) {
            System.out.println("bruh error oopsie doopsie " + ex);
        }
    
    }//GEN-LAST:event_jHattarListMouseClicked

   //      String clickedLine = (String) jNamnLista.getModel().getElementAt(selectedIndex);
//      jHattyp.setText(clickedLine);
    
    
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
            java.util.logging.Logger.getLogger(MaterialLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MaterialLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MaterialLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MaterialLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MaterialLista().setVisible(true);
                DefaultListModel<String> lista = Sok.sok(jHattyp.getText(), "lagerforda", "namn");
                jHattarList.setModel(lista);
            }
        });
        

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JColorChooser jColorChooser1;
    private static javax.swing.JList<String> jHattarList;
    private static javax.swing.JTextField jHattyp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jMaterialLista;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private static javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
