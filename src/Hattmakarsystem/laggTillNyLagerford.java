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
    
    
    
    
    public void laggTillLagerford(String farg, String material, String dekoration, int storlek, String bild){
        
        try{
            Databaskoppling.koppling();
            
            String fraga = "SELECT MAX(orderid) AS senaste_order_id FROM ordrar";
            String senasteIdStr = Databaskoppling.idb.fetchSingle(fraga);
            int senasteId = senasteIdStr != null ? Integer.parseInt(senasteIdStr) : 1;
          
            
            String laggTill = "INSERT INTO lagerprodukt (lagerid, farg, material, dekoration, storlek, bild) VALUES ('" + senasteId + "', '" + farg + "', '" + material + "', '" + dekoration + "', '" + storlek + "', '" + bild + "')";
            Databaskoppling.idb.insert(laggTill);
            
        }catch(InfException e){
            JOptionPane.showMessageDialog(null, "fel i databasen");
            System.out.println("Fel i databasen" + e.getMessage());}
        }

}


