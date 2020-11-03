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
class India
{
    int a;
    India(int a)
    {
        this.a =a;
    }
    India()
    {
        System.out.println("No arguments"); 
    }
}
class Gujarat extends India
{
    int ac = 32;
    static int b;
    Gujarat()
    {
         super(getA());
        //super(ac);
          getA();
    }
    Gujarat(int ab)
    {
        this();
        System.out.println("value is"+ab);
        System.out.println(this.a);
    }
    static int getA()
    {
        return 3;
    }
}
public class Constructor {
    
    public static void main(String[] args) {
        Gujarat n = new Gujarat(4);
    }
}