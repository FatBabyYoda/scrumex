/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hattmakarsystem;

import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.*;
import oru.inf.InfException;

/**
 *
 * @author lokef
 */
public class Specbestallning {
    
    static String filename = null;
    static DefaultListModel<String> listModel = new DefaultListModel<>();
    static ArrayList<String> materialNamn = new ArrayList<>();
    static ArrayList<String> materialMangd = new ArrayList<>();
    static ArrayList<String> materialFarg = new ArrayList<>();
    static ArrayList<ArrayList<String>> material = new ArrayList<>(); 
    static ArrayList<HashMap<String,String>> spechattar = new ArrayList();
    static ArrayList<HashMap<String,String>> lagerhattar = new ArrayList();
    static int specindex = 0;
    static int c;
    static String specid;
    static String matid;
    static String orderid;
    
    
    
    public static void laggtillmaterial(JTextField Mangdtextbox, JTextField MaterialTB, JTextField FargTB, JList MaterialList, JComboBox<String> Enhet){
        if(!Valideringsklass.emptyTextFields(Mangdtextbox, MaterialTB, FargTB)){
            
            materialNamn.add(MaterialTB.getText());
            materialMangd.add(Mangdtextbox.getText());
            materialFarg.add(FargTB.getText());
            material.add(new ArrayList<String>());
           
            listModel.addElement(MaterialTB.getText() +", "+FargTB.getText() +", "+ Mangdtextbox.getText() +Enhet.getSelectedItem().toString());
            
            MaterialList.setModel(listModel);
        }
        
    }
    
 
    
    public static void valjritning(JLabel RitningIcon){
         JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        
        filename = f.getAbsolutePath();
        
        
        RitningIcon.setIcon(new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(215, 130, Image.SCALE_DEFAULT)));
    }
    
    public static void laggtillspecorder(JList lista,JTextField Mangdtextbox, JTextField MaterialTB, JTextField FargTB, JList MaterialList, JComboBox<String> Enhet, DefaultListModel<String> orderlista,JTextField Antal,JTextField Storlek,JTextField Pris,JTextField SpecNamn){
        
        for (int j = 0; j < listModel.getSize(); j++) {
                material.get(specindex).add(j, listModel.getElementAt(j));
            }
        orderlista.addElement("Specbeställning " + SpecNamn.getText());
        HashMap<String, String> varden = new HashMap<>();
        varden.put("namn",SpecNamn.getText());
        varden.put("pris",Pris.getText());
        varden.put("storlek",Storlek.getText());
        varden.put("antal",Antal.getText());
        spechattar.add(varden);
        lista.setModel(orderlista);
        specindex++;
        listModel.clear();
        
    }
    
    public static void registreraorder(JButton regknapp){
        lagerhattar = LaggaLagerHatIBestallning.getHattArray();
        
        
        
        try {
            
            orderid = Databaskoppling.idb.getAutoIncrement("ordrar", "orderID");
            
            Date dagensDatum = new Date();
            
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        
            String datum = format.format(dagensDatum);
            
             
            double totpris = 0;
            
            for (int i = 0; i < spechattar.size(); i++) {
                totpris +=parseDouble(spechattar.get(i).get("pris")) ;
            }
            for (int i = 0; i < lagerhattar.size(); i++) {
                totpris +=parseDouble(lagerhattar.get(i).get("pris")) ;
            }
            
            Databaskoppling.idb.insert("INSERT INTO ordrar VALUES("+orderid+",0,'"+datum+"',"+totpris+",NULL,1);");
            
            for (int i = 0; i < spechattar.size(); i++) {
                
               
                
                
                specid = Databaskoppling.idb.getAutoIncrement("special", "specialID");
                
                FileOutputStream outputdir = new FileOutputStream(".\\src\\Hattmakarsystem\\bilder\\output"+specid+".jpg");
                FileInputStream inputdir = new FileInputStream(filename);
            
            
                while((c = inputdir.read()) != -1){
                outputdir.write(c);
                }
                
                Databaskoppling.idb.insert("INSERT INTO special VALUES("+specid+", '"+ spechattar.get(i).get("namn")+"', "+spechattar.get(i).get("pris")+", "+spechattar.get(i).get("storlek")+", 'output"+specid+".jpg');");
                Databaskoppling.idb.insert("INSERT INTO specialorderkoppling VALUES("+specid+", "+orderid+", "+spechattar.get(i).get("antal")+");");
                
                for (int j = 0; j < material.get(i).size(); j++) {
                    
                    matid = Databaskoppling.idb.getAutoIncrement("material", "materialID");
                    String[] matsql = material.get(i).get(j).split(",");
                    
                    Databaskoppling.idb.insert("INSERT INTO material VALUES("+matid+",'"+matsql[0]+"','"+matsql[1]+"',NULL);");
                    Databaskoppling.idb.insert("INSERT INTO specialproduktmaterial VALUES("+matid+","+specid+",'"+matsql[2]+"');");
                    
                    }
                
                
                
            }
            
            for (int i = 0; i < lagerhattar.size(); i++) {
                Databaskoppling.idb.insert("INSERT INTO lagerorderkoppling VALUES ("+lagerhattar.get(i).get("id")+","+orderid+",NULL,"+lagerhattar.get(i).get("storlek")+");");
            }
            eSender.sendComfirmation("gttgeded@gmail.com");
        
        } catch (Exception ex) {
            Logger.getLogger(Specbestallning.class.getName()).log(Level.SEVERE, null, ex);
        }
               
    }
}
