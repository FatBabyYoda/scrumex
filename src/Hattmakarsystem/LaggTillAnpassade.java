/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hattmakarsystem;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import oru.inf.InfException;

/**
 *
 * @author filip
 */
public class LaggTillAnpassade {

    public void laggTillAnpassade(String namn, int pris, String dekoration, String beskrivning, int storlek, JCheckBox jCheckBox) {

        try {
            Databaskoppling.koppling();

            if (jCheckBox.isSelected()) {
                String fraga = "SELECT MAX(lagfordID) AS senaste_lagford_id FROM lagerforda";
            String senasteIdStr = Databaskoppling.idb.fetchSingle(fraga);
            
            int senasteId;
            if (senasteIdStr != null) {
                senasteId = Integer.parseInt(senasteIdStr) + 1;
            } else {
                senasteId = 1; // Om det inte finns några rader i lagerforda, sätt senasteId till 1
            }
                String laggTill = "INSERT INTO anpassade (anpassadId, namn, pris, storlek, dekoration, beskrivning) VALUES ('" + senasteId + "', '" + namn + "', '" + pris + "', '" + storlek + "', '" + dekoration + "', '" + beskrivning + "')";
                Databaskoppling.idb.insert(laggTill);

                JOptionPane.showMessageDialog(null, "Ny anpassad hatt tillagd!");
            }

        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "fel i databasen");
            System.out.println("Fel i databasen" + e.getMessage());
        }
    }

    public void laggTillAnpassadOrder(int totalpris, String epost) {

        try {
        Date dagensDatum = new Date();
         //skapar fromat för datumet
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        //fromaterar datumet
        String datum = format.format(dagensDatum);
            String fraga2 = "SELECT MAX(orderID) AS senaste_order_id FROM order";
            String senasteIdStr2 = Databaskoppling.idb.fetchSingle(fraga2);
            int senasteId2 = senasteIdStr2 != null ? Integer.parseInt(senasteIdStr2) + 1 : 1;
            String kund = "SELECT kundID from kund where email = '" + epost + "'";
            Databaskoppling.idb.fetchColumn(kund);
            String laggTill2 = "INSERT INTO order (orderID, status, datum, totalpris, anvandare, kund) VALUES ('" + senasteId2 + "', '" + '0' + "', '" + datum + "', NULL, '" + kund + "')";
            Databaskoppling.idb.insert(laggTill2);
            
            JOptionPane.showMessageDialog(null, "Order tillagd!");
            
        } catch (InfException e) {
          JOptionPane.showMessageDialog(null, "fel i databasen");
          System.out.println("Fel i databasen" + e.getMessage());
        }
    }
}
