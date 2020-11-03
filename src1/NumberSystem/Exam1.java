/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NumberSystem;

/**
 *
 * @author Harsh
 */
class A
{
    
}
class B extends A
{
    
}
interface I
{
    
}

public class Exam1 implements I {
    //for object its uses == {two reference pointing to same object?
    //.equals it uses to refer for object ( same as ==)
    //.equals for string ( it compare string )
    //for enum to check reference variales refer same constant use either == or .equals
    public static void main(String[] args) {
        A ob = new A();
        if(ob instanceof B)
        {
            System.out.println("ob instanceof B");
        }
        A ob1 = new B();
        if(ob1 instanceof B)
        {
            System.out.println("ob1 instanceof B");
        }
         if(ob1 instanceof A)
        {
            System.out.println("ob1 instanceof A");
        }
         A ob2=null;
         //if(ob2 instanceof Object) only allow object not reference variable for comparision
         {
             
         }
         
         Exam1 e1 = new Exam1();
         //if(e1 instanceof A) compile time error because you cant compare object which has differenct class hierarchy
         {
             
         }
         if(e1 instanceof I) //due to implements Exam implements I 
        {
            System.out.println("e1 instanceof I");
        }       
         Exam1 ob3[] = new Exam1[4];
         //if(ob3 instanceof I) //compiletime error [] is only instance of Object
         {
             
         }
        // if(ob3 instanceof Exam1) //compiletime error [] is only instance of Object
         {
             
         }
         //Array is always instance of object
         if(ob3 instanceof Object)
         {
             System.out.println("Array is only instance of Object");   
         }
        //  if(ob3 instanceof Exam1)
         {
             
         }
         System.out.println((true & false == false | true)+ " ");
         System.out.println((true & false) == (false | true));
         int a =5+-7;
         int b = 12;
         int c = 5;
         int d = 7;
         System.out.println(b/c+" "+b/d);
         char ch1 = 43;
         System.out.println(34+ch1);
         
         A ob23 = new A();
         A ob24 = new A();
         if(ob23.equals(ob24)){System.out.println("Hello_India");}
         ob24 = ob23;
         if(ob24.equals(ob23)){System.out.println("India_Hello");}
         String s = new String();
         String s1 = new String();
         System.out.println(""+s.equals(s1));
 
         
         
    }
}
