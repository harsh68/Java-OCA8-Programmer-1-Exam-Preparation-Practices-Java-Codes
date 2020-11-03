/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjectCast;

/**
 *
 * @author Harsh
 */
interface Z{}
public class X1 implements Z 
{
        public String toString()
        {
                return "X1";
        }
    public static void main(String[] args)
    {
            Y myY = new Y();
            X1 myX1 = myY;
            Z myZ = myX1;
            System.out.print(myX1);
            System.out.print((X1)myX1);
            System.out.print(myZ);
    }
}
class Y extends X1
    {
        public String toString() 
        {
            return "Y";
        }
    }
