/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hattmakarsystem;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author lucasandersson
 */
public class Databaskoppling {
      public static InfDB idb;
   
      public static void koppling()
      {
          try 
        {
              idb = new InfDB("scrumex", "3306", "scrumex","losen");
              try {
            // TODO add your handling code here:
            ArrayList<String> hej = Databaskoppling.idb.fetchColumn("Select matid from material");
        } catch (InfException ex) {
            System.out.println(ex);
        }
        }
        catch(InfException undatag)
                {
                    JOptionPane.showMessageDialog(null, "nåt gick fel");
                    System.out.println(undatag);
                }
      }
 
    public static void main(String args[])
  {
    //skapar uppkopplingen till databasen i variablen idb
   
}

    static String idb(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
