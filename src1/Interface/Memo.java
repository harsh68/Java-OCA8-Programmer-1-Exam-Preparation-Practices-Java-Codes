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
class C2
{
    public void displayC2()
    {
        System.out.println("C2");
    }
}
interface I
{
    public void displayI();
}

class C1 extends C2 implements I
{

    @Override
    public void displayI() {
        System.out.println("C1");
    }
    public void displayC1()
    {
        System.out.println("C11");
    }
    
}
public class Memo {
    public static void main(String[] args) {
        C2 obj1 =new C1();
        I obj2 = new C1();
        
        C2 s = obj1;
    
       // I t = obj1;
        
        //s.displayI();
        //s.displayC2();
    }
}
