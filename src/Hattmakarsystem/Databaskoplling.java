/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hattmakarsystem;

import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author lucasandersson
 */
public class Databaskoplling {
      public static InfDB idb;
    
 
    public static void main(String args[])
  {
    //skapar uppkopplingen till databasen i variablen idb
    try 
        {
              idb = new InfDB("scrumex", "3306", "scrumex","losen");
        }
        catch(InfException undatag)
                {
                    JOptionPane.showMessageDialog(null, "nåt gick fel");
                    System.out.println(undatag);
                }
}
}
