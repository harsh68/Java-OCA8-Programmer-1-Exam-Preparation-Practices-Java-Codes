/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package values;

/**
 *
 * @author Harsh
 */class Base {

     protected int i;

     Base() { add(1); }

     void add(int v) { i += v; System.out.println("qwqw"+i);}

     void print() { System.out.println(i); }
}

class Extension extends Base {
Extension() { add(2); System.out.println("hi"+i);}
void add(int v) { i += v*2; }
}
public class Natak {
    public static void main(String[] args) {
bogo(new Extension());
}
static void bogo(Base b) {
b.add(8);
b.print();
}
}
