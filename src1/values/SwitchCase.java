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
public class SwitchCase {
    public static void main(String[] args) {
        final int x =12;
        final int a=5;
        //a=5; //immediately initialize with literal
        int c =0;
        switch(c)
        {
            case a: System.out.println("yellow"); break;
            default:
                System.out.println("Red");
                
        }
        
        switch('A')
        {
            case 65:
                System.out.println("?HA");
                break;
        }
        
        switch("HA")
        {
            case "HA":
                System.out.println("Print String");
                break;
        }
        
        String s = "Hello";
        String s1 = "hello";
        switch(s1)
        {
            /*
            case s:
                System.out.println("Not execute bcz its not final value");
            */
        }
        
        switch(0)
        {
           /*
            case java.time.DayOfWeek.SUNDAY:
                System.out.println("Sunday");
                break;
            */
            //enum to int not cnvert
        }
        
        int v =5;
        switch(5)
        {
          /*
            case v:
                System.out.println("Print String");
                break;
          */
            //Not compiled bcz final variable
        }
        
        
    }
}
