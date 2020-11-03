/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;
import packageexample.*;

/**
 *
 * @author Harsh
 */
public class D extends Demo{
    void display()
    {
      dis();  
    }
    void display2()
    {
        Demo d = new Demo();
        d.dis();
    }
    void display3()
    {
        D d = new D();
        d.dis();
    }
     void display4()
    {
        Demo d = new D();
        d.dis();
    }
    
    public static void main(String[] args) {
       //C ob = new C(); file have multiple classes but only one public class  
      Demo.main(new String[]{"2","3"});
    }
    
}
