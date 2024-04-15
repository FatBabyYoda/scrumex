/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hattmakarsystem;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import oru.inf.InfException;

/**
 *
 * @author filip
 */
public class seSpecBest {
    
    public void seSpecBestallningar(JTextArea textArea){
        try{
        Databaskoppling.koppling();
        String fraga = "SELECT * FROM ordrar WHERE typ = 'Special'";
        ArrayList<HashMap<String, String>> resultat = Databaskoppling.idb.fetchRows(fraga);
        
        textArea.setText("");
        
        for (HashMap<String, String> rad : resultat) {
            for (String kolumn : rad.keySet()) {
                textArea.append(kolumn + ": " + rad.get(kolumn) + "\t");
            }
            textArea.append("\n");
            
        }
        
        
        }catch(InfException e){
            JOptionPane.showMessageDialog(null, "fel i databasen");
            System.out.println("Fel i databasen" + e.getMessage());}
}
    
    
}
    