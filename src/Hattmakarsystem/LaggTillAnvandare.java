/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hattmakarsystem;

/**
 *
 * @author Simon
 */
public class LaggTillAnvandare {
    
    String anvandarNamn;
    String losenOrd;
    int anvID;
    String email;    
    
    
  public LaggTillAnvandare(String LaggTillAnvandare, String losenOrd, int anvID, String email){
    this.anvandarNamn = anvandarNamn;
    this.losenOrd = losenOrd;
    this.anvID = anvID;
    this.email = email;
  }
    
    public String getAnvandarNamn(){
        return anvandarNamn;
    }
    
    public void setAnvandarNamn(String anvandarNamn){
        this.anvandarNamn = anvandarNamn;
    }
    
    public String getLosenOrd(){
        return losenOrd;
    }
    
    public void setLosenOrd(String losenOrd){
        this.losenOrd = losenOrd;
    }
    
    public int getAnvID(){
        return anvID;
    }
    
    public void setAnvID(int anvID){
        this.anvID = anvID;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
   
        
    
}
