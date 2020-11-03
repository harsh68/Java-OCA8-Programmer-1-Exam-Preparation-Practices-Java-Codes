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
class Super1
{
    int sup;
    String nsup;
    Super1(){}
    Super1(int sup,String nsup)
    {
        this.sup = sup;
        this.nsup = nsup;
    }
}
class Sub11 extends Super1
{
    int sub;
     String n;
     Sub11(){}
    Sub11(int s,String n)
    {
        super(s,n);
    }
}
public class NewClass {
    public static void main(String a[])
    {
        
    }
}
