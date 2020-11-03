/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

import java.io.IOException;

/**
 *
 * @author Harsh
 */
class Super1
{
    void web() throws Exception
    {
        
    }
    double ret()
    {
        return 4;
    }
}
public class Rules extends Super1  {
    //void web() {} //valid
    
    /*
    @Override
    void web() throws IOException{}

    */
   // void web() throws ArithmeticException{} //valid unchecked exception
    //void web() throws IOException{}
   /*  @Override
     float ret()
    {
        return 4f;
    }
*/
    @Override
    void web()
    {
        
    }
    public static void main(String[] args) {
        Super1 s1 = new Rules();
        s1.web();
    }
}
