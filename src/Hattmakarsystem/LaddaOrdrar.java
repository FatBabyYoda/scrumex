/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hattmakarsystem;

import static java.lang.Integer.parseInt;
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
   
    public static void Allaordrar(JList lista, int sortering, int anvandarid) {
         ordrar.removeAllElements();
         
        try {
            Databaskoppling.koppling();
            
            
            for(int i = 0; i<= parseInt(Databaskoppling.idb.fetchSingle("SELECT COUNT(*) FROM ordrar")) ; i++){
               
                
                if(!(Databaskoppling.idb.fetchSingle("SELECT orderid FROM ordrar WHERE anvandare IS NOT NULL && orderid = "+i) == null) && sortering ==0){
                    ordrar.addElement(Databaskoppling.idb.fetchSingle("SELECT CONCAT(orderid, ' - ', namn) FROM ordrar JOIN anvandare ON anvandareID = anvandare WHERE orderID = "+i+""));
                }
                
                if(!(Databaskoppling.idb.fetchSingle("SELECT CONCAT(orderid, ' - ', namn) FROM ordrar JOIN anvandare ON anvandareID = anvandare WHERE orderID = "+i+" AND anvandareID = "+anvandarid) == null) && sortering == 1){
                    ordrar.addElement(Databaskoppling.idb.fetchSingle("SELECT CONCAT(orderid, ' - ', namn) FROM ordrar JOIN anvandare ON anvandareID = anvandare WHERE orderID = "+i+" AND anvandareID = "+anvandarid));
                }
                
                if(!(Databaskoppling.idb.fetchSingle("SELECT orderid FROM ordrar WHERE anvandare IS NULL && orderid = "+i) == null) && (sortering ==2 || sortering == 0)){
                    ordrar.addElement(Databaskoppling.idb.fetchSingle("SELECT CONCAT(orderid, ' - ej tagen') FROM ordrar WHERE anvandare IS NULL && orderid = "+i));
                } 
                    
            }
        } catch (InfException ex) {
            Logger.getLogger(LaddaOrdrar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        lista.setModel(ordrar);
               
        
    }
    
    
    
}
