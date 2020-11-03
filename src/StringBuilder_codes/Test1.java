/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringBuilder_codes;

/**
 *
 * @author Harsh
 */
/*
StringBuilder class does not provide an overriden equals() method. 
As such, when that method is called on an instance of StringBuilder ,
the Object class implementation of the method is executed, since StringBuilder extends Object .
Which simply compares reference equality
*/
public class Test1 {
     public static void main(String[] args) {
         String str = "java";
         StringBuilder sb = new StringBuilder("java");
         System.out.println(str.equals(sb) + ":" + sb.equals(str));
         System.out.println(str.equals(sb.toString()) + ":" + sb.equals(str));
         
         StringBuilder sb1 = new StringBuilder("java");
         StringBuilder sb2 = new StringBuilder("java");
         System.out.println("before");
         System.out.println(sb1==sb2);
         System.out.println(sb1.equals(sb2));
         sb1 = sb2.append(" oca");
         System.out.println("after");
         System.out.println(sb1==sb2);
         System.out.println(sb1.equals(sb2)); //same as sb1==sb2
     }
}