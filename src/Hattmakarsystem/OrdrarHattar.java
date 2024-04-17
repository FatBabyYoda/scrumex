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
    static ArrayList<HashMap<String,String>> hattarspec;
    static ArrayList<HashMap<String,String>> hattarlagger;
    static HashMap<String,String> order;
    public static void fyllOrderLista(JList hattar,JLabel ordernummer,JLabel pris,JLabel datum)
    {
        DefaultListModel<String> listModel = new DefaultListModel<>();
        Databaskoppling.koppling();
        try {
            order = Databaskoppling.idb.fetchRow("select * from ordrar where orderID = "+ordernummer.getText());           
            hattarspec = Databaskoppling.idb.fetchRows("select * from specialorderkoppling join special on specialorderkoppling.specialID = special.specialID where orderID = "+ordernummer.getText());
            hattarlagger = Databaskoppling.idb.fetchRows("select * from lagerorderkoppling join lagerforda on lagerorderkoppling.lagfordID = lagerforda.lagfordID where orderID = "+ordernummer.getText());
           /*
            listModel.addElement("Special Orderar:");
            for (HashMap<String, String> specialOrder : hattarspec) {
                
                    listModel.addElement("antal" + ": " + specialOrder.get("antal")+" storlek" + ": " + specialOrder.get("storlek")+" pris" + ": " + specialOrder.get("pris")+" dekoration" + ": " + specialOrder.get("dekoration")+" namn" + ": " + specialOrder.get("namn")+" beskrivning" + ": " + specialOrder.get("beskrivning")+" ID" + ": " + specialOrder.get("specialID"));
                
            }*/
            //förbättrings kod som jag inte implementeraat än tar bort null värden och mer lätt läslig
            String value = "";
            listModel.addElement("lager Orderar:");
            for (HashMap<String, String> stockedOrder : hattarlagger) {
                for (String key : stockedOrder.keySet()) {
                    if (stockedOrder.get(key) != null && !key.equals("orderID")) {
                       value += key + ": " + stockedOrder.get(key) + " | ";
                       
                    }
                           
                }
                listModel.addElement(value);
            }
            value = "";
            
            listModel.addElement("Special Orderar:");
            for (HashMap<String, String> stockedOrder : hattarspec) {
                for (String key : stockedOrder.keySet()) {
                    if (stockedOrder.get(key) != null && !key.equals("orderID")&& !key.equals("ritning")) {
                       value += key + ": " + stockedOrder.get(key)+ " | ";
                       
                    }
                           
                }
                listModel.addElement(value);
            }

            /*
             listModel.addElement("lager Orderar:");
            for (HashMap<String, String> lagerOrder : hattarlagger) {
            listModel.addElement("antal" + ": " + lagerOrder.get("antal")+" storlek" + ": " + lagerOrder.get("storlek")+" pris" + ": " + lagerOrder.get("pris")+" dekoration" + ": " + lagerOrder.get("dekoration")+" namn" + ": " + lagerOrder.get("namn")+" beskrivning" + ": " + lagerOrder.get("beskrivning")+" ID" + ": " + lagerOrder.get("lagfordID"));

            }
            */
            hattar.setModel(listModel);
            pris.setText(order.get("totalpris")+" kr");
            datum.setText(order.get("datum"));
            
           // ArrayList<HashMap<String,String>> hattaranpassade = Databaskoppling.idb.fetchRows("select * from ordrar where orderID = "+ordernummer.getText());
        } catch (InfException ex) {
            Logger.getLogger(OrdrarHattar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
}
