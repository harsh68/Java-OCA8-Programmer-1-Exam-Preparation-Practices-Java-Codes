/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constructor_values;

/**
 *
 * @author Harsh
 */
class Dairy
{
    int a = 30;
    void Exp(int a)
    {
        System.out.println("hello"+a);
    }
}
class Milk extends Dairy
{
    int a =50;
    void Exp()
    {
        super.Exp(super.a);
        super.Exp(a);
    }
}
public class Experiment {
    
    public static void main(String[] args) {
        Milk m = new Milk();
        m.Exp();
    }
}
