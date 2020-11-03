/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casting;

/**
 *
 * @author Harsh
 */
class Abc
{
    void News(double f)
    {
        System.out.println("double :" +f);
    }
}
class Pqr extends Abc
{
    void News(int a)
    {
        System.out.println("int "+ a);
    }
   void News(float f)
    {
        System.out.println("float "+f);
    }
}
public class TypeCasting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pqr ob = new Pqr();
        ob.News(5.55);
        ob.News(20);
        ob.News(5.5f);
    }
    
}
