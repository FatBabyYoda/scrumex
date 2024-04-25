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
                    ordrar.addElement(Databaskoppling.idb.fetchSingle("select CONCAT('-',specialorderkoppling.specialID,' ',namn) from specialorderkoppling join special on specialorderkoppling.specialID = special.specialID where orderID = "+i));
                    ordrar.addElement(Databaskoppling.idb.fetchSingle("select CONCAT('-',lagerorderkoppling.lagfordID,' ',namn) from lagerorderkoppling join lagerforda on lagerorderkoppling.lagfordID = lagerforda.lagfordID where orderID = "+i));
                    ordrar.addElement(Databaskoppling.idb.fetchSingle("select CONCAT('-',anpassade.anpassadID,' ',namn) from anpassadorderkoppling join anpassade on anpassade.anpassadID = anpassadorderkoppling.anpassadID where orderID = "+i));
                
                }
                
                    
            }
        } catch (InfException ex) {
            Logger.getLogger(LaddaOrdrar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        lista.setModel(ordrar);
               
        
    }
    
    
    
}
