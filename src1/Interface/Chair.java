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
interface jum
{
    int h= 1;
    default void wr()
    {
        System.out.print("hello");
        System.out.println(h);
    }
}
interface mov
{
    
    int h=2;
    static void wr()
    {
        System.out.print("hi");
        System.out.println(h);
    }
}
public class Chair implements jum,mov {
    Chair()
    {
        wr();
    }
    public static void main(String[] args) {
        jum j = new Chair();
        mov m = new Chair();
        mov.wr();
        m.mov();
        Chair c = new Chair();
    }
}
