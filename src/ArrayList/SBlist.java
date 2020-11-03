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
public class SBlist {
    public static void main(String[] args) {
         List<StringBuilder> days = new ArrayList<>();
         days.add(new StringBuilder("Sunday"));
         days.add(new StringBuilder("Monday"));
         days.add(new StringBuilder("Tuesday"));
         boolean b = days.contains(new StringBuilder("Sunday"));  //sb !=sbn   sb.equals(sb1) false
         System.out.println(b);
          boolean b1 = days.contains("Sunday");
         System.out.println("b1"+b1);
         if(days.contains(new StringBuilder("Sunday"))) {
             days.add(new StringBuilder("Wednesday"));
         }
         System.out.println(days);
         System.out.println(days.size());
         StringBuilder sb = new StringBuilder("jks");
         StringBuilder sb1 = sb.append("lkj");  //sb.equals(sb1) and sb ==sb1 true
         System.out.println("=="+ (sb1==sb));
         System.out.println(".equals()"+ (sb.equals(sb1)));
         
         days.add(sb);
          if(days.contains(sb1))
          {
              days.add(new StringBuilder("New Strng"));
          }
          System.out.println(days);
         
         StringBuilder s4 = new StringBuilder("self");
         System.out.println("==self"+(s4==s4));
         System.out.println(".equals"+(s4.equals(s4)));
     }
}
