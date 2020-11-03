/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NewPr1;

/**
 *
 * @author Harsh
 */
class Abc
{
    String x = "abc";
    public void show()
    {
        System.out.println(this.x);
    }
}
public class NewPr extends Abc {
  String x = "pqr";
  public void show()
  {
      System.out.println(x);
  }
  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Abc a = new NewPr();
       a.show();
        System.out.println(a.x);
    }
    
}
