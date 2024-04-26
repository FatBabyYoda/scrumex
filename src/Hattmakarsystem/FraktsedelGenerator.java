package Hattmakarsystem;

import static Hattmakarsystem.Databaskoppling.koppling;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.util.HashMap;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import net.sourceforge.barbecue.Barcode;
import net.sourceforge.barbecue.BarcodeException;
import net.sourceforge.barbecue.BarcodeFactory;
import net.sourceforge.barbecue.BarcodeImageHandler;
import oru.inf.InfException;

/**
 *
 * @author osman
 */
public class FraktsedelGenerator {

    private String selectedOrder;

    public FraktsedelGenerator(String selectedOrder) {
        this.selectedOrder = selectedOrder;
        koppling();
    }

    public static void createAndShowGui(String selectedOrder, JTable kundTabell) {
        JFrame frame = new JFrame("Fraktsedel");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setResizable(false);

        //ställ in storlek och position
        int screenWidth = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
        int screenHeight = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;

        int frameWidth = 1200;
        int frameHeight = 700;
        int frameX = (screenWidth - frameWidth) / 2;
        int frameY = (screenHeight - frameHeight) / 2;
        frame.setBounds(frameX, frameY, frameWidth, frameHeight);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.WHITE);
                g.fillRect(0, 0, getWidth(), getHeight());

                try {
                    // Hämta kundinformation
                    String[] kundInfo = getKundInformation(selectedOrder);

                    // Rita namn och adress
                    g.setColor(Color.BLACK);
                    Font font = new Font("Arial", Font.BOLD, 16);
                    g.setFont(font);
                    
                    drawCenteredString(g, kundInfo[0], new Rectangle(50, 50, getWidth() - 100, 20)); // Namn
                    drawCenteredString(g, kundInfo[1], new Rectangle(50, 80, getWidth() - 100, 20)); // Adress
                    drawCenteredString(g, kundInfo[2], new Rectangle(50, 110, getWidth() - 100, 20)); // Orderdatum

                    // Generera och visa streckkod
                    String fraktsedelNummer = generateRandomFraktsedelNummer();
                    Barcode barcode = BarcodeFactory.createCode128(fraktsedelNummer);
                    BufferedImage image = BarcodeImageHandler.getImage(barcode);
                    int barcodeX = (getWidth() - image.getWidth()) / 2;
                    int barcodeY = 200;
                    g.drawImage(image, barcodeX, barcodeY, null);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            // Metod för att rita text centrerat i en rektangel
            private void drawCenteredString(Graphics g, String text, Rectangle rect) {
                if (text != null) {
                    FontMetrics metrics = g.getFontMetrics(g.getFont());
                    int x = rect.x + (rect.width - metrics.stringWidth(text)) / 2;
                    int y = rect.y + ((rect.height - metrics.getHeight()) / 2) + metrics.getAscent();
                    g.drawString(text, x, y);
                }
            }
        };

        frame.getContentPane().add(panel);
        frame.setSize(500, 300);
        frame.setVisible(true);
    }

    private static String generateRandomFraktsedelNummer() {
        StringBuilder sb = new StringBuilder();
        java.util.Random random = new java.util.Random();
        for (int i = 0; i < 12; i++) {
            sb.append(random.nextInt(10));
        }
        return sb.toString();
    }

    private static String[] getKundInformation(String selectedOrder) throws BarcodeException {
        try {
            String kundInfoFraga = "SELECT k.namn AS namn, k.adress AS address, o.datum AS datum FROM kund k "
                    + "INNER JOIN ordrar o ON k.kundID = o.kund "
                    + "WHERE o.orderID = " + selectedOrder;
            HashMap<String, String> kundInfo = Databaskoppling.idb.fetchRow(kundInfoFraga);

            String namn = kundInfo.get("namn");
            String adress = kundInfo.get("adress");
            String orderdatum = kundInfo.get("datum");

            return new String[]{namn, adress, orderdatum};
        } catch (InfException ex) {
            throw new BarcodeException("Kunde inte hämta kundinformation från databasen", ex);
        }
    }

}
