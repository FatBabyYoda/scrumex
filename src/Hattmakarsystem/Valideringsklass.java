/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hattmakarsystem;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import oru.inf.InfException;
import oru.inf.InfDB;


public class Valideringsklass {
    public static String Start;
    public static String idb;
    
    
    // kollar om eposten redan finns i database
    public static Boolean finnsEpostenRedan(String Epost)
    {
        try {
            ArrayList<String> EpostAgnt = Start.idb.fetchColumn("Select epost from agent");
             ArrayList<String> EpostAlien = Start.idb.fetchColumn("Select epost from alien");
             for (String x:EpostAlien) {
            if (Epost.toLowerCase().equals(x)) {
               JOptionPane.showMessageDialog(null, "Eposten finns redan"); 
                return true;
            }
        }
        for (String x: EpostAgnt) {
            if (Epost.toLowerCase().equals(x)) {
                JOptionPane.showMessageDialog(null, "Eposten finns redan");
                return true;
            }
        }
        } catch (InfException ex) {
            Logger.getLogger(Valideringsklass.class.getName()).log(Level.SEVERE, null, ex);
        }
                

       return false;
    }
    //kollar om lösenordet är för långt 
    public static Boolean rattLangd(javax.swing.JPasswordField pfNytt, int maxlangdd)
    {
        String losenordStr = new String(pfNytt.getPassword());

        //Databasen tillåter endast ett lösenord med 6 tecken
        int maxLangd = maxlangdd;
        if (losenordStr.length() <= maxLangd) {
            return true;
        }
        else{        
            JOptionPane.showMessageDialog(null, "Lösenord är för långt max 6 symboler");
            return false;
    }}
    public static Boolean rattLangdUtanMess(javax.swing.JPasswordField pfNytt, int maxlangdd)
    {
        String losenordStr = new String(pfNytt.getPassword());

        //Databasen tillåter endast ett lösenord med 6 tecken
        int maxLangd = maxlangdd;
        if (losenordStr.length() <= maxLangd) {
            return true;
        }
        else{        
            return false;
    }}
    //finns om man skulle behöva kolla om ett text field är för långt
    public static Boolean rattLangd(JTextField pfNytt, int maxlangdd)
    {
        String losenordStr = pfNytt.getText();

        
        int maxLangd = maxlangdd;
        if (losenordStr.length() <= maxLangd) {
            return true;
        }
                JOptionPane.showMessageDialog(null, "Lösenordet är för långt");

       return false;
    }
    //kollar om ett textfeild är tomt
    public static Boolean finnsText(JTextField tfNytt)
    {
   
        if (tfNytt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Fyll i alla rutor");
            return false;
            
        }
        
       return true;
    }
    //kollar om ett passwordfeild är tomt
    public static Boolean finnsText(javax.swing.JPasswordField tfNytt)
    {
   
        if (tfNytt.getPassword().length == 0) {
                JOptionPane.showMessageDialog(null, "Fyll i alla rutor");
            return false;
        }
      
       return true;
    }
    
    //datum validering
    private boolean valideringDatum(String date) {
        String legitimtDatum = "\\d{4}-\\d{2}-\\d{2}";
        return date.matches(legitimtDatum);
    }
    //kollar om en epost har @ och . i sig för lite simpel koll om den är en faktisk epost inte super bra validering men iallfall lite
    public static boolean epostCheck(JTextField epostTextField)
    {
   if (epostTextField.getText().contains("@") && epostTextField.getText().contains(".")) 
        {
        return true;
        }
        return false;
    }
    
    //kan kolla flera text fields samtidigt i en metod
    public static boolean emptyTextFields(JTextField... textFields) {
        
        for (JTextField textField : textFields) {
            if (textField.getText().isEmpty()) {
               JOptionPane.showMessageDialog(null, "fyll i alla rutor");
              return true;
        }
                

       
        }
     
        return false;

    }
    //samma som ovan koll efter tomt password field men lite simplare och ger inte ut en showmessage
    public static Boolean finnsTextUtanMess(javax.swing.JPasswordField tfNytt)
    {
            return !(tfNytt.getPassword().length == 0);   
    }
    //kan kolla flera textfeild om dom är tomma och även en passwordfield
    public static boolean tomTextPassFields(javax.swing.JPasswordField pfLosen, JTextField... textFields) {
        boolean check = false;
        if (!finnsTextUtanMess(pfLosen)) {
            check = true;
        }
        for (JTextField textField : textFields) {
            if (textField.getText().isEmpty()) {
              
              check = true;
              break;
        }
              
        }
      if (check == true ) {
                JOptionPane.showMessageDialog(null, "fyll i alla rutor");
            }
        return check;

    }
}

