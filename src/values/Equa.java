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
class Visa
{
    int a;
}
class Renew extends Visa
{
    int b;
}
public class Equa {
    public static void main(String[] args) {
        Visa v = new Visa();
        Visa v1 = new Visa();
        Renew r = new Renew();
        Renew r1 = new Renew();
        Renew r2 = r1;
        Visa v4 = new Renew();
         Visa v7 = new Renew();
        Visa v5=null;
        System.out.println(v.equals(r));
        System.out.println(r.equals(v));
        System.out.println(v1.equals(v));
        System.out.println(r1.equals(r2)); // behave == for class object
        
        if(r1 instanceof Visa)
        {
            System.out.println("Good");
        }
        
          if(v4 instanceof Visa)
        {
            System.out.println("Good 1");
        }
          
            if(v4 instanceof Renew)
        {
            System.out.println("Good 2");
        }
        if(v5 instanceof Visa)
        {
            System.out.println("Good 3");
        }
        v4 = ((Renew)v4);
          if(v4 instanceof Visa)
        {
            System.out.println("*");
        }
          
            if(v4 instanceof Renew)
        {
            System.out.println("**");
        }
            
            v7 = ((Visa)v7);
          if(v7 instanceof Visa)
        {
            System.out.println("***");
        }
          
            if(v7 instanceof Renew)
        {
            System.out.println("****");
        }
    }
}
