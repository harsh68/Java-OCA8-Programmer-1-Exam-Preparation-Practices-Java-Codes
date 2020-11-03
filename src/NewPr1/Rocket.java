/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NewPr1;

/**
 *
 * @author Harsh
 */
class Ship {
protected int weight = 3;
 int height = 5;
public int getWeight() { return weight; }
public int getHeight() { return height; }
}
public class Rocket extends Ship {
public int weight = 2;
public int height = 4;
public void printDetails() {
System.out.println(super.getWeight()+","+super.height);
System.out.println(weight+","+height);
}
public static final void main(String[] fuel) {
new Rocket().printDetails();
Ship s =new Rocket();
    System.out.println(s.weight+"**"+s.height);
    //System.out.println(new Rocket().super.height);
}
}
