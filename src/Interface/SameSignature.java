/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author Harsh
 */
interface i2
{
    int a= 66;
    void display();
}
interface i3
{
    int a =45;
    void display();
}
interface i4 extends i3,i2
{
    int a=10;
  void display();
}
public class SameSignature implements i3,i2,i4 {
    
    public static void main(String[] args) {
        //new SameSignature().display();
    }

  
    public void display() {
        //System.out.println("a:"+a);
    }

   
    
}
