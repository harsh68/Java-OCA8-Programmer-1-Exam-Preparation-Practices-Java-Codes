/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticpck;

class Extra
{
    int a;
    int b;
    static int c;
    static int count;
    static int counter()
    {
        //a =10; can't use non static member in static method
        return count;
    }
    
}
public class Oracle {

    /**
     * @param args the command line arguments
     */
    void print()
    {
        System.out.println("Hello world");
    }
    static void print1()
    {
        System.out.println("Hello world-1");
    }
    public static void main(String[] args) {
      Extra e = new Extra();
      Oracle p = new Oracle();
      Oracle p1;
      int result = e.counter();
      int result1 = Extra.counter();
      System.out.println("Result variable"+result);
      System.out.println("Result1 variable"+result1);
        //print(); non static method only access by object of that class
        print1();
        Oracle.print1();
        p.print();
        p.print1();
        
        //p1.print1(); not working require reference object
        //Oracle.print(); non static method only access by object of that class
    }
    
}
