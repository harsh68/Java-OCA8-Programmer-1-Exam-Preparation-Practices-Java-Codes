/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package values;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author Harsh
 */

//if you concurrently change in collection like in Iteration u remove elements using collection it might be throw concurrent Modification
public class IteratorExce {
    
public static void main(String[] args) {
         List<String> dryFruits = new ArrayList<>();
         dryFruits.add("Walnut");
         dryFruits.add("Apricot");
         dryFruits.add("Almond");
         dryFruits.add("Date");
 
         ListIterator<String> iterator = dryFruits.listIterator();
         while(iterator.hasNext()) {
             String dryFruit = iterator.next();
             if(dryFruit.startsWith("A")) {
                 //dryFruits.remove(dryFruit);
                iterator.set("A?");
             }
         }
        
         System.out.println(dryFruits);
    }
}
