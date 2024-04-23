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
public class Statistik {
    
    
public void seStatistik(JTextArea textArea){ 
    
Databaskoppling.koppling();

try{
String fraga = "SELECT lf.namn, SUM(lk.antal) AS antal_beställningar " +
"FROM lagerforda lf " +
"JOIN LagerOrderKoppling lk ON lf.lagfordID = lk.lagfordID " +
"GROUP BY lf.namn " +
"ORDER BY antal_beställningar DESC";
ArrayList<HashMap<String, String>> resultat = Databaskoppling.idb.fetchRows(fraga);

textArea.setText("");
        
        textArea.append("Hattnamn\tAntal\n");

        // Lägg till resultat
        for (HashMap<String, String> rad : resultat) {
            String hattnamn = rad.get("namn");
            String antalBeställningar = rad.get("antal_beställningar");
            textArea.append(hattnamn + "\t" + antalBeställningar + "\n");
        }

}catch(InfException e){
    JOptionPane.showMessageDialog(null, "fel i databasen");
    System.out.println("Fel i databasen" + e.getMessage());}
}

    
}
