/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;

import java.util.*;

/**
 *
 * @author Harsh
 */
public class Cities {
    public static void main(String[] args) {
        
        List<String> c = new ArrayList<String>();
        List<String> c1 = new ArrayList<>();
      //  List<> c2 = new ArrayList<String>();
      //List<> c4 = new ArrayList<>();
        
        
        c.add("Anand");
        c.add("Baroda");
        c.add("Surat");
        System.out.println("Normal List: "+ c);
        System.out.println("indexof Baroda"+ c.indexOf("broda")); //display  index -1 if object is not found
        System.out.println("indexof Baroda: "+ c.indexOf("Baoda"));
        c.add(1,"Vasad");
        System.out.println("Updated c :"+c);
        c.add(3,"Bharuch");
        
        //c.add(10,"Mumbai"); //java.lang.IndexOutOfBoundsException
        System.out.println("See the c: "+c);
        System.out.println("Get at index 1"+ c.get(1));
        System.out.println("Remove  at index 2: "+c.remove(2));
        System.out.println("Updated List c: "+c);
        c.remove(1);
        System.out.println("Again after removing at index 1 arraylist is: "+c);
        System.out.println("Total Size of ArrayList is: "+c.size());
        
        //contains() method returns boolean value
        System.out.println("baroada?"+c.contains("baroda"));
        System.out.println("Anand?"+c.contains("Anand"));
        System.out.println("surat?"+c.contains("surat"));
        System.out.println("Surat?"+c.contains("Surat"));
        System.out.println("Remove Object:Surat not using index"+ c.remove("Surat"));
        System.out.println("Updated c: "+c);
        System.out.println("Clear arraylist c");
        c.clear();
        System.out.println("Elements after clear c ArrayList: "+c);
    }
}
