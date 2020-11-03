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
public class StringBuilderCap {
    public static void main(String[] args) {
        //Default Capacity
        StringBuilder x = new StringBuilder();
        System.out.println("Default capacity: "+ x.capacity());
        
        x.append("Be Positive");
        System.out.println("Capacity after append: "+x.capacity());
        
        x.append(12345324444876L);
        System.out.println("append will automatically update capacity: "+x.capacity());
        
        
        
        //now check
        StringBuilder x1 = new StringBuilder("Count from 16");
        System.out.println("Capacity is default 16+ argument passed in x1 :"+ x1.capacity());
        
        //appendCodePoint
        x1.appendCodePoint(67);
        System.out.println("67 has ascii character 'C' so: "+x1);
        
    }
}
