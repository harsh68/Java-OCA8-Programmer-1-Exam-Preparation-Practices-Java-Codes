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
public class Operator {
    boolean set;
    boolean isTrue()
    {
        System.out.println("isTrue()");
        return true;
    }
     boolean isfalse()
    {
        System.out.println("isFalse()");
        return false;
    }
    public static void main(String[] args) {
        Operator op = new Operator();
        //Generally we use & and | with bitwise operator
        if(op.isTrue() & op.isfalse())
        {
            System.out.println("*");
        }
         if(  op.isfalse() & op.isTrue())
        {
            System.out.println("**");
        }
          if(op.isTrue() | op.isfalse())
        {
            System.out.println("***");
        }
         if(  op.isfalse() | op.isTrue())
        {
            System.out.println("****");
        }
         
           //Generally we use & and | with bitwise operator
         //if first condition false followed by and&& operator it will not check second .
         //if first condition true followed by or|| operator it will not check second .
         System.out.println("Logical Operations");
        if(op.isTrue() && op.isfalse())
        {
            System.out.println("*");
        }
         if(  op.isfalse() && op.isTrue())
        {
            System.out.println("**");
        }
          if(op.isTrue() || op.isfalse())
        {
            System.out.println("***");
        }
         if(  op.isfalse() || op.isTrue())
        {
            System.out.println("****");
        }
         
         
         String s = null;
         
         //if(s.trim().length()>0){} Null pointer exception
         
         if(s!=null && s.trim().length()>0)
         {
             System.out.println("Magic");
         }
         
         boolean courseInSession = true;
         int lectureCount = 150;
         if( !courseInSession ) {
            System.out.println("Course is not in session.");
            }
         System.out.println(courseInSession);
         courseInSession = !courseInSession;
         System.out.println(courseInSession);
         
    }
}
