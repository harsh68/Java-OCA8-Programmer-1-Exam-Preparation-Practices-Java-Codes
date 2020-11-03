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
public class Chapter_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str[] = {"mon","tue","sun","fri","thu"};
        for(String s:str)
        {
            switch(s)
            {
                case "mon":
                     System.out.println("Monday");
                case "tue":
                      break;
                case "fri":
                     System.out.println("Hello");
            }
        }
        int i =0;
        while(i<122)
        {
            if(i==5)
            {
                break;
            }
            System.out.print(""+i);
            i++;
        }
    }
    
}
