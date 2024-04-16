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
import javax.swing.JLabel;
import javax.swing.JList;
import oru.inf.InfException;

/**
 *
 * @author Lucas
 */
public class OrdrarHattar {
    
    
    public static void fyllOrderLista(JList hattar,JLabel ordernummer,JLabel pris,JLabel datum)
    {
        DefaultListModel<String> listModel = new DefaultListModel<>();
        Databaskoppling.koppling();
        try {
            HashMap<String,String> order = Databaskoppling.idb.fetchRow("select * from ordrar where orderID = "+ordernummer.getText());
            
            ArrayList<HashMap<String,String>> hattarspec = Databaskoppling.idb.fetchRows("select * from specialorderkoppling join special on specialorderkoppling.specialID = special.specialID where orderID = "+ordernummer.getText());
            ArrayList<HashMap<String,String>> hattarlagger = Databaskoppling.idb.fetchRows("select * from lagerorderkoppling join lagerforda on lagerorderkoppling.lagfordID = lagerforda.lagfordID where orderID = "+ordernummer.getText());
           
            listModel.addElement("Special Orderar:");
            for (HashMap<String, String> specialOrder : hattarspec) {
                
                    listModel.addElement("antal" + ": " + specialOrder.get("antal")+" storlek" + ": " + specialOrder.get("storlek")+" pris" + ": " + specialOrder.get("pris")+" dekoration" + ": " + specialOrder.get("dekoration")+" namn" + ": " + specialOrder.get("namn")+" beskrivning" + ": " + specialOrder.get("beskrivning")+" ID" + ": " + specialOrder.get("specialID"));
                
            }
             listModel.addElement("lager Orderar:");
            for (HashMap<String, String> lagerOrder : hattarlagger) {
            listModel.addElement("antal" + ": " + lagerOrder.get("antal")+" storlek" + ": " + lagerOrder.get("storlek")+" pris" + ": " + lagerOrder.get("pris")+" dekoration" + ": " + lagerOrder.get("dekoration")+" namn" + ": " + lagerOrder.get("namn")+" beskrivning" + ": " + lagerOrder.get("beskrivning")+" ID" + ": " + lagerOrder.get("lagfordID"));

            }
            hattar.setModel(listModel);
            pris.setText(order.get("totalpris")+" kr");
            datum.setText(order.get("datum"));
            
           // ArrayList<HashMap<String,String>> hattaranpassade = Databaskoppling.idb.fetchRows("select * from ordrar where orderID = "+ordernummer.getText());
        } catch (InfException ex) {
            Logger.getLogger(OrdrarHattar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
}
