/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package values;

/**
 *
 * @author Harsh
 */
public class Moretest {
    public static void main(String a[])
    {
        String s1 = new String("Geek");
        String s2 = new String("Geek");
        
        if(s1==s2){
            System.out.println("== Execute 1");
        }
        
         if(s1.equals(s2)){
            System.out.println(".equal Execute 2");
        }
         s1=s2;
           if(s1==s2){
            System.out.println("== Execute 3");
        }
          if(s1.equals(s2)){
            System.out.println(".equal Execute 4");
        }  
        s2 = new String("Geek");
           if(s1==s2){
            System.out.println("== Execute 5");
        }
          if(s1.equals(s2)){
            System.out.println(".equal Execute 6");
        } 
    }
    
}
