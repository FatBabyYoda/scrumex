/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hattmakarsystem;

import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import oru.inf.InfException;

/**
 *
 * @author filip
 */
public class LaggTillAnpassade {
    
    public void laggTillAnpassade(String namn, int pris, String dekoration, String beskrivning, int storlek, JCheckBox jCheckBox){
        
        try{
         Databaskoppling.koppling();
         
         if(jCheckBox.isSelected()){
         String fraga = "SELECT MAX(anpassadID) AS senaste_anpassad_id FROM anpassade";
         String senasteIdStr = Databaskoppling.idb.fetchSingle(fraga);
         int senasteId = senasteIdStr != null ? Integer.parseInt(senasteIdStr) + 1 : 1;   
            
         String laggTill = "INSERT INTO anpassade (anpassadId, namn, pris, storlek, dekoration, beskrivning) VALUES ('" + senasteId + "', '" + namn + "', '" + pris + "', '" + storlek + "', '" + dekoration + "', '" + beskrivning + "')";
         Databaskoppling.idb.insert(laggTill);
            
         JOptionPane.showMessageDialog(null, "Ny anpassad hatt tillagd!");
         }
         
        }catch(InfException e){
            JOptionPane.showMessageDialog(null, "fel i databasen");
            System.out.println("Fel i databasen" + e.getMessage());
        }    
    }  
}
