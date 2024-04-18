/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hattmakarsystem;

import static Hattmakarsystem.Databaskoppling.koppling;
import java.util.HashMap;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author osman
 */
public class Fraktsedel {
    
    public Fraktsedel(){
        koppling();
    }
    
    public static void kundInformation(String[] selectedOrder, JTable kundTabell){
        try {
            // Hämta kundinformation baserat på den valda ordern
            String selectedOrderId = selectedOrder[0]; // Anta att orderid är den första delen av vald order
            String kundInfoFraga = "SELECT k.namn AS namn, k.adress AS address, k.email AS email, k.telefon AS telf, " +
                "o.datum AS orderdatum, CASE WHEN l.lagfordID IS NOT NULL THEN 'Lagerförda' ELSE 'Special' END AS typ, " +
                "CASE WHEN l.lagfordID IS NOT NULL THEN lok.antal * l.pris ELSE sok.antal * s.pris END AS pris, " +
                "o.totalpris AS totalpris " +
                "FROM kund k " +
                "INNER JOIN ordrar o ON k.kundID = o.kund " +
                "LEFT JOIN LagerOrderKoppling lok ON o.orderID = lok.orderID " +
                "LEFT JOIN lagerforda l ON lok.lagfordID = l.lagfordID " +
                "LEFT JOIN SpecialOrderKoppling sok ON o.orderID = sok.orderID " +
                "LEFT JOIN special s ON sok.specialID = s.specialID " +
                "WHERE o.orderID = " + selectedOrderId;
            HashMap<String, String> kundInfo = Databaskoppling.idb.fetchRow(kundInfoFraga);

            // Fyll jTable med kundinformation
            DefaultTableModel model = (DefaultTableModel) kundTabell.getModel();
            model.setRowCount(0); // Rensa jTable

            // Lägg till kundinformation i jTable
            model.addRow(new Object[]{
                kundInfo.get("namn"),
                kundInfo.get("adress"),
                kundInfo.get("email"),
                kundInfo.get("telefon"),
                kundInfo.get("typ"),
                kundInfo.get("datum"),
                kundInfo.get("pris"),
                kundInfo.get("totalpris")
                    
            });
            
            
        } catch (InfException ex) {
            ex.printStackTrace();
        }
        
        
    }
    
}
