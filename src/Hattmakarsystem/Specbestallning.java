/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hattmakarsystem;

import java.awt.Image;
import java.io.File;
import java.util.*;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.*;

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
    static int specindex = 0;
    
    
    
    public static void laggtillmaterial(JTextField Mangdtextbox, JTextField MaterialTB, JTextField FargTB, JList MaterialList, JComboBox<String> Enhet){
        if(!Valideringsklass.emptyTextFields(Mangdtextbox, MaterialTB, FargTB)){
            
            materialNamn.add(MaterialTB.getText());
            materialMangd.add(Mangdtextbox.getText());
            materialFarg.add(FargTB.getText());
            material.add(new ArrayList<String>());
           
            
            listModel.addElement(MaterialTB.getText() +" "+FargTB.getText() +" "+ Mangdtextbox.getText() +Enhet.getSelectedItem().toString());
            
            
                
            
            
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
        varden.put("pris",Pris.getText());
        varden.put("storlek",Storlek.getText());
        varden.put("antal",Antal.getText());
        spechattar.add(varden);
        lista.setModel(orderlista);
        specindex++;
        listModel.clear();
        
    }
}
