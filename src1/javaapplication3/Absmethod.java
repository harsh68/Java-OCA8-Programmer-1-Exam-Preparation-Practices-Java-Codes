/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author Harsh
 */
 abstract class  Version1
        {
          int ab = 10;
          abstract void display();
        }
 abstract class Version2 extends Version1
 {
      public void display()
      {
          System.out.println("Hello");
      }
      abstract void display2();
 }
public class Absmethod extends Version2 {

    @Override
    void display2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
}
