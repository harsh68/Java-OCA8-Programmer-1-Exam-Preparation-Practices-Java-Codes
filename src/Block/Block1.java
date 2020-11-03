/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Block;

/**
 *
 * @author Harsh
 */
public class Block1 {
  int a=5;
  String s="hello";
  
  {
      a =10;
  }
  Block1()
  {
      System.out.println("no-arg");
  }
 
    public static void main(String[] args) {
        Block1 ob = new Block1();
        System.out.println("Value of a for ob: "+ob.a);
    }
}
