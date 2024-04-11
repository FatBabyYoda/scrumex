/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Hattmakarsystem;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import oru.inf.InfException;
import static java.nio.file.StandardCopyOption.*;
import java.text.SimpleDateFormat;

/**
 *
 * @author lokef
 */
public class LaggTillSpecBestallning extends javax.swing.JFrame {

    String filename = null;
    DefaultListModel<String> listModel = new DefaultListModel<>();
    ArrayList<String> materialNamn = new ArrayList<String>();
    ArrayList<String> materialMangd = new ArrayList<String>();
    ArrayList<String> materialFarg = new ArrayList<String>();
    
    public LaggTillSpecBestallning() {
        initComponents();
        Databaskoppling.koppling();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        EmailTB = new javax.swing.JTextField();
        StorlekTB = new javax.swing.JTextField();
        PrisTB = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        MaterialList = new javax.swing.JList<>();
        MaterialTB = new javax.swing.JTextField();
        Mangdtextbox = new javax.swing.JTextField();
        MaterialLabel = new javax.swing.JLabel();
        Mangdlabel = new javax.swing.JLabel();
        LaggTillMaterial = new javax.swing.JButton();
        SkapaBestallningButton = new javax.swing.JButton();
        Enhet = new javax.swing.JComboBox<>();
        StorlekLabel = new javax.swing.JLabel();
        EmailLabel = new javax.swing.JLabel();
        PrisLabel = new javax.swing.JLabel();
        RitningIcon = new javax.swing.JLabel();
        RitningButton = new javax.swing.JButton();
        FargTB = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        AntalTB = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        menu1.setLabel("File");
        menuBar1.add(menu1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(MaterialList);

        Mangdtextbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MangdtextboxActionPerformed(evt);
            }
        });

        MaterialLabel.setText("Material");

        Mangdlabel.setText("Mängd");

        LaggTillMaterial.setText("Lägg till material");
        LaggTillMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LaggTillMaterialActionPerformed(evt);
            }
        });

        SkapaBestallningButton.setText("Lägg till beställning");
        SkapaBestallningButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SkapaBestallningButtonActionPerformed(evt);
            }
        });

        Enhet.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "cm²", "cm", "m", "m²" }));
        Enhet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnhetActionPerformed(evt);
            }
        });

        StorlekLabel.setText("Storlek");

        EmailLabel.setText("Kund Email");

        PrisLabel.setText("Pris");

        RitningIcon.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        RitningButton.setText("Välj ritning");
        RitningButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RitningButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Färg");

        jLabel2.setText("Antal hattar");

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
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(226, 226, 226)
                        .addComponent(RitningButton))
                    .addComponent(StorlekLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(PrisLabel))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(PrisTB, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(AntalTB)
                            .addComponent(EmailLabel)
                            .addComponent(EmailTB, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                            .addComponent(StorlekTB))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 233, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Mangdtextbox, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Enhet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(FargTB, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(MaterialTB, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Mangdlabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(MaterialLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(124, 124, 124)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(LaggTillMaterial))))
                .addGap(24, 24, 24))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(RitningIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(127, 127, 127)
                        .addComponent(SkapaBestallningButton)
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(308, 308, 308))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {LaggTillMaterial, jButton1});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(SkapaBestallningButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(RitningIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RitningButton)
                    .addComponent(jLabel2))
                .addGap(13, 13, 13)
                .addComponent(AntalTB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(StorlekLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(StorlekTB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FargTB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(EmailLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EmailTB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(PrisLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PrisTB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(MaterialLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(MaterialTB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(Mangdlabel))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Mangdtextbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LaggTillMaterial)
                            .addComponent(Enhet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(5, 5, 5)
                .addComponent(jButton1))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {LaggTillMaterial, jButton1});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MangdtextboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MangdtextboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MangdtextboxActionPerformed

    private void LaggTillMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LaggTillMaterialActionPerformed
        if(!Valideringsklass.emptyTextFields(Mangdtextbox, MaterialTB, FargTB)){
            materialNamn.add(MaterialTB.getText());
            materialMangd.add(Mangdtextbox.getText());
            materialFarg.add(FargTB.getText());
            listModel.addElement(MaterialTB.getText() +" "+Mangdtextbox.getText() +Enhet.getSelectedItem().toString() +" "+ FargTB.getText());
            MaterialList.setModel(listModel);
        }
    }//GEN-LAST:event_LaggTillMaterialActionPerformed

    private void RitningButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RitningButtonActionPerformed
        
        
        
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        
        filename = f.getAbsolutePath();
        
        
        RitningIcon.setIcon(new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(215, 130, Image.SCALE_DEFAULT)));
        
        
        
        
        
        
    }//GEN-LAST:event_RitningButtonActionPerformed

    private void SkapaBestallningButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SkapaBestallningButtonActionPerformed
        
        int c;
        String specid;
        String matid;
        String orderid;
        
        Date dagensDatum = new Date();
         //skapar fromat för datumet
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        //fromaterar datumet
        String datum = format.format(dagensDatum);
        
        if(!Valideringsklass.emptyTextFields(PrisTB,StorlekTB,EmailTB) && Valideringsklass.finnsEpostenRedan(EmailTB.getText())== true){
            
            
            
            try {
                specid = Databaskoppling.idb.getAutoIncrement("Specialbestallning", "specialbestallningid");
                matid = Databaskoppling.idb.getAutoIncrement("Material", "matid");
                orderid = Databaskoppling.idb.getAutoIncrement("ordrar", "orderid");
                String kundid = Databaskoppling.idb.fetchSingle("select kundid from kund where email = '"+EmailTB.getText().toLowerCase()+"';");
                
                FileOutputStream outputdir = new FileOutputStream(".\\src\\Hattmakarsystem\\bilder\\output"+specid+".jpg");
                FileInputStream inputdir = new FileInputStream(filename);
            
            
            while((c = inputdir.read()) != -1){
                outputdir.write(c);
            }
            
                Databaskoppling.idb.insert("INSERT INTO Specialbestallning VALUES("
                        +specid+", 'output"+specid+"',"+StorlekTB.getText()+", "+PrisTB.getText()+");");
                
                Databaskoppling.idb.insert("insert into ordrar values ("
                            +orderid+", " + "FALSE" +", "+ "'Specialbestallning'"+", '"+datum+"', "+Integer.parseInt(PrisTB.getText())*Integer.parseInt(AntalTB.getText())+ ",NULL," + kundid+");");
                
                Databaskoppling.idb.insert("INSERT INTO harspec VALUES("
                        +specid+","+orderid+","+AntalTB.getText()+");");
                
                for(int i = 0; i < materialNamn.size(); i++){
                   
                    
                    Databaskoppling.idb.insert("insert into Material values ("
                            +matid+", '"+ materialNamn.get(i) +"', '"+ materialFarg.get(i)+"');");
                    
                    Databaskoppling.idb.insert("insert into specbestar values ("
                            +matid+", "+ specid +", "+ Mangdtextbox.getText()+");");
                    
                    matid = Databaskoppling.idb.getAutoIncrement("Material", "matid");
                    
                }
                
                eSender.sendComfirmation(EmailTB.getText());
                
            } catch (Exception ex) {
                System.out.println(ex);
            }
            
            
            
            
        }
    }//GEN-LAST:event_SkapaBestallningButtonActionPerformed

    private void EnhetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnhetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EnhetActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 RegistreraBestallningLagerforda RGLMeny = new RegistreraBestallningLagerforda();
        RGLMeny.setVisible(true);
        this.dispose();        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(LaggTillSpecBestallning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LaggTillSpecBestallning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LaggTillSpecBestallning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LaggTillSpecBestallning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LaggTillSpecBestallning().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AntalTB;
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JTextField EmailTB;
    private javax.swing.JComboBox<String> Enhet;
    private javax.swing.JTextField FargTB;
    private javax.swing.JButton LaggTillMaterial;
    private javax.swing.JLabel Mangdlabel;
    private javax.swing.JTextField Mangdtextbox;
    private javax.swing.JLabel MaterialLabel;
    private javax.swing.JList<String> MaterialList;
    private javax.swing.JTextField MaterialTB;
    private javax.swing.JLabel PrisLabel;
    private javax.swing.JTextField PrisTB;
    private javax.swing.JButton RitningButton;
    private javax.swing.JLabel RitningIcon;
    private javax.swing.JButton SkapaBestallningButton;
    private javax.swing.JLabel StorlekLabel;
    private javax.swing.JTextField StorlekTB;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Menu menu1;
    private java.awt.MenuBar menuBar1;
    // End of variables declaration//GEN-END:variables
}
