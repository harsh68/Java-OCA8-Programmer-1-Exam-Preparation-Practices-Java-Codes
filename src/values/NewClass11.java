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

//Explicit: double->float->long->int->short->byte
// Implicit: byte->short->int->long->float->double
  //int <- char
  //char <- (char) int (lossy)
 //float <- char
  //char <- (char) float (lossy)
//Java automatically promotes each byte, short, or char operand to int when evaluating an expression.
class Abc
{
    public int cRet()
    {
        char c = 'c';
        return c;  //implicit type conversion
    }
  
    public char cRet1()
    {
        int a = 97;
        // return a;
        return (char)a;
    }
     public char cRet2()
    {
        float a = 97.22f;
        // return a;
        return (char)a;
    }
     
      public float cRet3()
    {
        char a = 'A' ;
        // return a;
        return a;
    }
    
    public int foo()
    {
        float f = 35.4f;
        //return f;
        return (int)f;
    }
    
    public float foo1()
    {
        int f =35;
        //return f;
        return f;
    }
    //float <- int
    //int <- (int) float        
    
}
public class NewClass11 {
    public static void main(String a[])
    {
        
    }
}
