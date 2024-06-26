/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hattmakarsystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JTextField;
import oru.inf.InfException;

/**
 *
 * @author Lucas
 */
public class LaggaLagerHatIBestallning {
    
    
    static HashMap<String, String> hatinfo;
    static ArrayList<HashMap<String,String>> lagerhattar = new ArrayList();
    public static void fyllComboBox(JComboBox combo)
    {
        
        if (combo.getSelectedItem() == null) {
            Databaskoppling.koppling(); 
        try {
            ArrayList<String> hatnamn = Databaskoppling.idb.fetchColumn("select namn from lagerforda");
            for (String namn: hatnamn) {
                combo.addItem(namn);
            }
        } catch (InfException ex) {
            Logger.getLogger(LaggaLagerHatIBestallning.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
    }
    
    public static void AktivraAnpassad(JCheckBox anpassad,JTextField... TextFields)
    {
        for (JTextField b:TextFields) {
            if (anpassad.isSelected()) {
                b.setEditable(true);
            }
            else 
            {
                b.setEditable(false);
            
            }
            
        }
    }
    
    public static void fyllText(JList combo,JTextField pris,JTextField dekoration,JTextField beskrivning)
    {
        Databaskoppling.koppling(); 
        
        try {
            hatinfo = Databaskoppling.idb.fetchRow("select * from lagerforda where namn = '"+combo.getSelectedValue().toString()+"'");
            pris.setText(hatinfo.get("pris"));

            dekoration.setText(hatinfo.get("dekoration"));
            beskrivning.setText(hatinfo.get("beskrivning"));
            
        } catch (InfException ex) {
            Logger.getLogger(LaggaLagerHatIBestallning.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void regglageranpassade(JList combo,DefaultListModel<String> orderlista,JList lista,JTextField pris,JTextField storlek,JTextField dekoration,JTextField beskrivning)
    {
        orderlista.addElement(combo.getSelectedValue().toString());
        HashMap<String, String> varden = new HashMap<>();
        varden.put("namn", combo.getSelectedValue().toString());
        varden.put("id", hatinfo.get("lagfordID"));
        varden.put("pris",pris.getText());
        varden.put("storlek",storlek.getText());
        varden.put("dekoration",dekoration.getText());
        varden.put("beskrivning",beskrivning.getText());
        lagerhattar.add(varden);
        lista.setModel(orderlista);
        
    }
    public static ArrayList<HashMap<String,String>> getHattArray()
    {  
        return lagerhattar;
    }
    
    
}
