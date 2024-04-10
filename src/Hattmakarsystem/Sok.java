/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hattmakarsystem;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import oru.inf.InfException;

/**
 *
 * @author Lucas
 */
public class Sok {
    
    public static DefaultListModel<String> sok(String text, String table, String column){
        Databaskoppling.koppling();  
        DefaultListModel<String> listModel = new DefaultListModel<>(); 
        try {
    ArrayList<String> sokresultat = Databaskoppling.idb.fetchColumn("select "+column+" from "+table+" where "+column+" like '%" + text + "%'");
      
    for (String sokande : sokresultat) {
        listModel.addElement(sokande);
    }
 
} catch (InfException ex) {
    System.out.println(ex);
}
        return listModel;
    }
    
    
}
