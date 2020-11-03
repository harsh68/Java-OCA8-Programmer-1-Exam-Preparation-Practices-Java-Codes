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
public class TryThis {
    public static void main(String[] args) {
        int[] array = {10,20,30};
        List<Integer> l = new ArrayList<>();
        l.add(array[0]);
        l.add(array[2]);
        System.out.println("List after add"+l);
        l.set(1,array[1]);
        System.out.println("List"+l);
        l.remove(0);
        System.out.println("List l"+l);
        
    }
    
}
