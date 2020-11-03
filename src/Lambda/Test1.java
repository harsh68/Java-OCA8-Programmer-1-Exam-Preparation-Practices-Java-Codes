/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lambda;

/**
 *
 * @author Harsh
 */
 
import java.util.function.Predicate;
 
public class Test1 {
     public static void main(String[] args) {
         String [] arr = {"*", "**", "***", "****", "*****"};
         Predicate<String> pr1 = s -> s.length() < 4; //Predicate is object type and object type dont have length method
         print(arr, pr1);
     }
 
     private static void print(String [] arr, Predicate<String> predicate) {
         for(String str : arr) {
             if(predicate.test(str)) {
                 System.out.println(str);
             }
         }
     }
}
