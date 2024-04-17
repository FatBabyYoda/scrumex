/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hattmakarsystem;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
/**
 *
 * @author Simon
 */
public class LaggTillkund extends javax.swing.JFrame {
    
    public LaggTillkund() {
        initComponents();
    }

    
    private void initComponents() {
        // Initialize GUI components here
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButtonSok = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new JList<>();

        jLabel1.setText("Sök efter kund:");
        jLabel1.setLabelFor(jTextField1);

        jTextField1.setToolTipText("Skriv in e-postadressen till kunden du söker");

        jButtonSok.setText("Sök");
        jButtonSok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String email = jTextField1.getText();
                if (!email.isEmpty()) {
                    DefaultListModel<String> model = Sok.sok(email, "kund", "email");
                    jList1.setModel(model);
                } else {
                    JOptionPane.showMessageDialog(null, "Skriv in en e-postadress för att söka efter en kund.");
                }
            }
        });

        jList1.setModel(new DefaultListModel<>());
        jScrollPane1.setViewportView(jList1);

        // Add GUI components to the frame here
        Container container = getContentPane();
        container.setLayout(new java.awt.FlowLayout());
        container.add(jLabel1);
        container.add(jTextField1);
        container.add(jButtonSok);
        container.add(jScrollPane1);
    }

    // Add other methods and variables here as needed

    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jButtonSok;
    private javax.swing.JScrollPane jScrollPane1;
    private JList<String> jList1;
    private javax.swing.JTextField jTextField1;
}