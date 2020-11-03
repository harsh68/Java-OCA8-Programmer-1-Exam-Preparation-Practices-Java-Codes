/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lambda;

import java.util.function.Predicate;

/**
 *
 * @author Harsh
 */
class News
{
    static boolean Checkage(int age)
    {
        if(age>17)
            return true;
        else
            return false;
    }
}
public class Predicate2 {
    public static void main(String[] args) {
        Predicate<Integer> pr = (a) -> (a > 18);
        System.out.println("Result: "+pr.test(10));
        System.out.println("Result: "+pr.test(22));
        
        Predicate<Integer> verify = News::Checkage;
        boolean result = verify.test(50);
        System.out.println("Age > 17 :"+result);
    }
}
