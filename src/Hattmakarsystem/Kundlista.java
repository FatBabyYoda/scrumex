package Hattmakarsystem;

import java.util.HashMap;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import oru.inf.InfException;

public class Kundlista {

    public Kundlista() {
        Databaskoppling.koppling();
    }

    public static void fyllKundlista(String selectedOrder, JTable kundTabell) {
        try {
            // Hämta kundinformation baserat på den valda ordern
            String kundInfoFraga = "SELECT k.namn AS namn, k.adress AS adress, k.email AS email, k.telefon AS telefon, "
                    + "CASE WHEN l.lagfordID IS NOT NULL THEN 'Lagerförda' ELSE 'Special' END AS typ, "
                    + "o.datum AS orderdatum, "
                    + "CASE WHEN l.lagfordID IS NOT NULL THEN lok.antal * l.pris ELSE sok.antal * s.pris END AS pris, "
                    + "o.totalpris AS totalpris "
                    + "FROM kund k "
                    + "INNER JOIN ordrar o ON k.kundID = o.kund "
                    + "LEFT JOIN LagerOrderKoppling lok ON o.orderID = lok.orderID "
                    + "LEFT JOIN lagerforda l ON lok.lagfordID = l.lagfordID "
                    + "LEFT JOIN SpecialOrderKoppling sok ON o.orderID = sok.orderID "
                    + "LEFT JOIN special s ON sok.specialID = s.specialID "
                    + "WHERE o.orderID = " + selectedOrder;

            HashMap<String, String> kundInfo = Databaskoppling.idb.fetchRow(kundInfoFraga);

            // Fyll JTable med kundinformation
            DefaultTableModel model = (DefaultTableModel) kundTabell.getModel();
            model.setRowCount(0); // Rensa JTable

            // Lägg till kundinformation i JTable
            model.addRow(new Object[]{
                kundInfo.get("namn"),
                kundInfo.get("adress"),
                kundInfo.get("email"),
                kundInfo.get("telefon"),
                kundInfo.get("typ"),
                kundInfo.get("orderdatum"),
                kundInfo.get("pris"),
                kundInfo.get("totalpris")
            });

        } catch (InfException ex) {
            ex.printStackTrace();
        }
    }

}
