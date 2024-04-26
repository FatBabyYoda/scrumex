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
             String fraga = "SELECT MAX(anpassadID) AS senaste_anpassad_id FROM anpassade";
                String senasteIdStr = Databaskoppling.idb.fetchSingle(fraga);
                int senasteId = senasteIdStr != null ? Integer.parseInt(senasteIdStr) + 1 : 1;
                String laggTill = "INSERT INTO anpassade (anpassadId, namn, pris, dekoration, beskrivning) VALUES ('" + senasteId + "', '" + namn + "', '" + pris + "', '" + dekoration + "', '" + beskrivning + "')";
                Databaskoppling.idb.insert(laggTill);

                JOptionPane.showMessageDialog(null, "Ny anpassad hatt tillagd!");
            }

        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "fel i databasen");
            System.out.println("Fel i databasen" + e.getMessage());
        }
    }

    public void laggTillAnpassadOrder(int totalpris, String Epost, int storlek) {

        try {
        Date dagensDatum = new Date();
         //skapar fromat för datumet
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        //fromaterar datumet
        String datum = format.format(dagensDatum);
        String fraga = "SELECT MAX(anpassadID) AS senaste_anpassad_id FROM anpassade";
            String senasteIdStr = Databaskoppling.idb.fetchSingle(fraga);
            int senasteId = Integer.parseInt(senasteIdStr);
            String fraga2 = "SELECT MAX(orderID) AS senaste_order_id FROM ordrar";
            String senasteIdStr2 = Databaskoppling.idb.fetchSingle(fraga2);
            int senasteId2 = senasteIdStr2 != null ? Integer.parseInt(senasteIdStr2) + 1 : 1;
            String kund = "SELECT kundID from kund where email = '" + Epost + "'";
            String kundID = Databaskoppling.idb.fetchSingle(kund);

            String laggTill2 = "INSERT INTO ordrar(orderID, status, datum, totalpris, kund, prio) VALUES ('" + senasteId2 + "', '0', '" + datum + "', '" + totalpris + "', '" + kundID + "', 0)";
            Databaskoppling.idb.insert(laggTill2);
            
            String laggTill3 = "INSERT INTO anpassadorderkoppling(anpassadID, orderID, antal, storlek, anvandare) VALUES('" + senasteId + "', '" + senasteId2 + "', '" + 1 + "', '" + storlek + "', NULL)";
            Databaskoppling.idb.insert(laggTill3);
            JOptionPane.showMessageDialog(null, "Order tillagd!");
            
        } catch (InfException e) {
          JOptionPane.showMessageDialog(null, "fel i databasen");
          System.out.println("Fel i databasen" + e.getMessage());
        }
    }
}
