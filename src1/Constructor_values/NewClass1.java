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
class Super11
{
    int sup;
    String nsup;
    Super11(){}
    Super11(int sup,String nsup)
    {
        this.sup = sup;
        this.nsup = nsup;
    }
}
class Sub111 extends Super11
{
    int sub;
     String n;
    Sub111(){}
    Sub111(int s,String n)
    {
        super(s,n);
    }
}
class Sub211 extends Sub111
{
    int sub;
     String n;
    Sub211(){}
    Sub211(int s,String n)
    {
        super(s,n);
    }
}
class Sub311 extends Sub211
{
    //int a = 10;
    static int a = 10;
    
    Sub311()
    {
        super(a,"Hello"); //you can use local variable not instance variable
    }
    Sub311(int g,String s){}
}
class Sub411 extends Sub311
{
    int b;
    //int a = 10;
    static int a = 10;
    
    Sub411()
    {
        super(display1(),"Hello");
   //     super(display(),"Hello"); //can't use non static variable (except local) and method 
        int intva = display();
        b = 420;
    }
    
    int display(){ return 10;}
    static int display1(){ return 10;}
    
}
public class NewClass1 {
    public static void main(String a[])
    {
        
    }
}
