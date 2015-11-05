/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programofstudy;

/**
 *
 * @author Travis
 */
public class course {
    
    int semester;
    String prefix;
    int number;
    String courseTitle;
    int creditHours;
    char grade;
    
    public course(){
        
    }
    
    public int getNumber(){
        return this.number;
    }
    
    public String getPrefix(){
        return this.prefix;
    }
    
}
