/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Harsh
 */
public class ArrayToList {
    public static void main(String[] args) {
        String[] array = { "hawk", "robin" }; // [hawk, robin]
        List<String> list = Arrays.asList(array); // returns fixed size backed version of list 
         System.out.println(list.size()); // 2
          list.set(1, "test"); // [hawk, test]
         // list.add(1,"Hello"); // not allowed to change
          System.out.println(list.size()); 
          array[0] = "new"; // [new,Hello, test]
          System.out.println("List:"+list);
          for (String b : array) System.out.print(b + " "); // new test
          list.remove(1); // throws UnsupportedOperation // Not allowed to change in list
    }
}
