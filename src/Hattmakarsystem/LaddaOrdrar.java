/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hattmakarsystem;

import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import oru.inf.InfException;


/**
 *
 * @author lokef
 */
public class LaddaOrdrar {
static ArrayList<HashMap<String,String>> hattarspec;
static ArrayList<HashMap<String,String>> hattarlagger;
static ArrayList<HashMap<String,String>> hattaranpassad;
static DefaultListModel<String> ordrar = new DefaultListModel<>();

    public static void main(String[] args){

		
	
	}
   
    public static void Allaordrar(JList lista, int anvandarid) {
         ordrar.removeAllElements();
         
        try {
            Databaskoppling.koppling();
            
            
            for(int i = 0; i<= parseInt(Databaskoppling.idb.fetchSingle("SELECT COUNT(*) FROM ordrar")) ; i++){
               
                
                if(!(Databaskoppling.idb.fetchSingle("SELECT orderid FROM ordrar WHERE orderid = "+i) == null)){
                    ordrar.addElement(Databaskoppling.idb.fetchSingle("SELECT orderid FROM ordrar WHERE orderID = "+i+""));
                    
                    hattarspec = Databaskoppling.idb.fetchRows("select special.specialID,namn from specialorderkoppling join special on special.specialID = specialorderkoppling.specialID where orderID = "+i);
                    hattaranpassad = Databaskoppling.idb.fetchRows("select anpassade.anpassadID,namn from anpassadorderkoppling join anpassade on anpassade.anpassadID = anpassadorderkoppling.anpassadID where orderID = "+i);
                    hattarlagger = Databaskoppling.idb.fetchRows("select lagerforda.lagfordID,namn from lagerorderkoppling join lagerforda on lagerforda.lagfordID = lagerorderkoppling.lagfordID where orderID = "+i);
                    
                
                    String value = "-";
                    for (HashMap<String, String> stockedOrder : hattarlagger) {
                        for (String key : stockedOrder.keySet()) {
                            if (stockedOrder.get(key) != null && !key.equals("orderID")) {
                                value += stockedOrder.get(key) + " ";
                       
                            }
                           
                        }
                    ordrar.addElement(value);
                    value = "-";
                    
                    
                    }
                    
                    for (HashMap<String, String> stockedOrder : hattarspec) {
                        for (String key : stockedOrder.keySet()) {
                            if (stockedOrder.get(key) != null && !key.equals("orderID")) {
                                value += stockedOrder.get(key) + " ";
                       
                            }
                           
                        }
                    ordrar.addElement(value);
                    value = "-";
                    
                    
                    }
                    
                    for (HashMap<String, String> stockedOrder : hattaranpassad) {
                        for (String key : stockedOrder.keySet()) {
                            if (stockedOrder.get(key) != null && !key.equals("orderID")) {
                                value += stockedOrder.get(key) + " ";
                       
                            }
                           
                        }
                    ordrar.addElement(value);
                    value = "-";
                    
                    
                    }
                    
                    
                }
                
                    
            }
        } catch (InfException ex) {
            Logger.getLogger(LaddaOrdrar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        lista.setModel(ordrar);
               
        
    }
    
    
    
}
