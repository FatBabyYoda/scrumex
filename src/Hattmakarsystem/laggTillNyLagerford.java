/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hattmakarsystem;

import javax.swing.JOptionPane;
import oru.inf.InfException;


/**
 *
 * @author filip
 */
public class laggTillNyLagerford {
    
    
    
    
    static public void laggTillLagerford(String namn, String pris, String dekoration, String beskrivning){
        
        try{
            Databaskoppling.koppling();
            
            String fraga = "SELECT MAX(lagfordID) AS senaste_modell_id FROM lagerforda";
            String senasteIdStr = Databaskoppling.idb.fetchSingle(fraga);
            int senasteId = senasteIdStr != null ? Integer.parseInt(senasteIdStr) + 1 : 1;
          
            
            String laggTill = "INSERT INTO lagerforda (lagfordId, namn, pris, dekoration, beskrivning) VALUES ('" + senasteId + "', '" + namn + "', '" + pris + "', '" + dekoration + "', '" + beskrivning + "')";
            Databaskoppling.idb.insert(laggTill);
            
            JOptionPane.showMessageDialog(null, "Ny lagerförd hatt tillagd!");
            
        }catch(InfException e){
            JOptionPane.showMessageDialog(null, "fel i databasen");
            System.out.println("Fel i databasen" + e.getMessage());}
        }

}


