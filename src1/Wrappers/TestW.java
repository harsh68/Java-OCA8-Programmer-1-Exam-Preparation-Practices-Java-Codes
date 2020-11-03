/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Wrappers;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Harsh
 */
public class TestW {
    public static void main(String[] args) {
        Boolean[] arr = new Boolean[2];
        List<Boolean> list = new ArrayList<>();
        //list.add(arr[0]);
        list.add(true);
        list.add(arr[1]);
        //System.out.println(null.equals(null));
        if(list.remove(0)) //Boolean type so no compilation error  
        {
            System.out.println("Execute");
        }
    }
 
}
