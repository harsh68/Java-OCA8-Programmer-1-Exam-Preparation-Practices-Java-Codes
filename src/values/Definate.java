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
class Six
{
    String name = "val1";
    void what()
    {
        String name = "val2";
        if(true)
        {
            //String name = "val3";
            System.out.println("name: "+name);
        }
        
    }
}
public class Definate {
   
    public static void main(String[] args) {
        Six s = new Six();
        s.what();
    }
}