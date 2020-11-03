/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Harsh
 */
public class Fr {
 public static void main(String[] args) {
         List<String> fruits = new ArrayList<>();
         fruits.add("apple");
         fruits.add("orange");
         fruits.add("grape");
         fruits.add("mango");
         fruits.add("banana");
         fruits.add("grape");
 
         while(fruits.remove("grape"))
             fruits.remove("apple");
 
         System.out.println(fruits);
     }
}
