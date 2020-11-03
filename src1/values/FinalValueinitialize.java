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
//final variable declare with no value and if you initialize final variable in coonstructor, 
//you must assign final variable value to all constructor
class A12
{
    final int a; //must initialize variable otherwise it will compile time error
  /* you can initialize in initializer block*/   
    /*{
      a =12; 
    }*/
    
    //static final variable can be initialize in static block
    A12()
    {
        a=12;
    }
    A12(int t)
    {
        a=t;  //for all constructor you must assign value to final variable (if u assign in single constructor)
    }
}
public class FinalValueinitialize {
    public static void main(String[] args) {
        A12 ob = new A12(13);
    }
}
