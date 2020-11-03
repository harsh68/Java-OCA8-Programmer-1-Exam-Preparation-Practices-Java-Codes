/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scope;

/**
 *
 * @author Harsh
 */
public class Init {
    
    static char ch='a';
    int a=10;

//Static initialization block of A
static
{
System.out.println("Static block runs");
System.out.println("value of static character = "+ ch);
}

//Instance initialization block of B
    {
        System.out.println("Instance Initialization block runs");
        System.out.println("Value of static character = "+ ch);
        System.out.println("Value of instance variable = "+ a);
    }


public static void main(String... ar)
{
Init ob= new Init();
}

}
//Static block runs
//value of static character = a
//Instance Initialization block runs
//Value of static character = a
//Value of instance variable = 10