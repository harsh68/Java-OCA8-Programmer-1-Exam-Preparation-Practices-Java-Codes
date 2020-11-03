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
class C22
{
    public void displayc2()
    {
        System.out.println("c22");
    }
}
interface I
{
    public void displayI();
}
class C11 extends C22 implements I
{

    @Override
    public void displayI() {
        System.out.println("I");
    }
  
}
public class $ca {
    public static void main(String[] args) {
        C22 ob = new C11();
        I i = new C11();
        
        C22 s = i;
        I t =  ob;
        
        
    }
}
