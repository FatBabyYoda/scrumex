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
    
    
    
    public static void laggtillmaterial(JTextField Mangdtextbox, JTextField MaterialTB, JTextField FargTB, JList MaterialList, JComboBox<String> Enhet){
        if(!Valideringsklass.emptyTextFields(Mangdtextbox, MaterialTB, FargTB)){
            
            materialNamn.add(MaterialTB.getText());
            materialMangd.add(Mangdtextbox.getText());
            materialFarg.add(FargTB.getText());
            
           
            
            listModel.addElement(MaterialTB.getText() +" "+Mangdtextbox.getText() +Enhet.getSelectedItem().toString() +" "+ FargTB.getText());
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
    
    public static void laggtillspecorder(JList lista){
        
    }
}
