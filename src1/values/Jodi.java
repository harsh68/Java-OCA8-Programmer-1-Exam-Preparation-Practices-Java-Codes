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
class Super9
{
    private int a;
    protected Super9(int a)
    {
        this.a = a;
    }
}
class Sub9 extends Super9
{
    public Sub9(int a)
    {
        super(a);
    }
    public Sub9()
    {
        this(5);
    }
}
public class Jodi {
    public static void main(String[] args) {
        new Super9(9);
    }
}
