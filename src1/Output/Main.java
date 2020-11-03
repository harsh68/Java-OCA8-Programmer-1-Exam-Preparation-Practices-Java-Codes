/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Output;

/**
 *
 * @author Harsh
 */
class Vehicle
{
    String s = "4W";
    int maxs = 100;
    Vehicle(){}
    Vehicle(String s,int maxs)
    {
        this.s = s;
        this.maxs = maxs;
    }
}
class Car extends Vehicle
{
String trans;
Car(String trans)
{
    super();
    this.trans = trans;
}
    public Car(String s, int maxs, String trans) {

        super(s, maxs);

    }

}
public class Main {
    
    public static void main(String a[])
    {     
    Car c1 = new Car("harsh");
    Car c2 = new Car("4h",58,"hp");
        System.out.println(c1.s+"  "+c1.maxs+"    "+c1.trans);
        System.out.println(c2.s+"  "+c2.maxs+"    "+c2.trans);
    }
}
