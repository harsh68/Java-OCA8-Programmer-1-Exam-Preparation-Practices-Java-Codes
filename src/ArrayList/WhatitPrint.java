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
public class WhatitPrint {
    public static void main(String[] args) {
        List<String> l1 = new ArrayList<>();
        System.out.println(l1);
        System.out.println(l1.size());
        String[] arr = new String[2];
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[0] + arr[1]);
        System.out.println((arr[0] + arr[1]));
        //System.out.println(null+null);
        System.out.println(5+""+null);
        System.out.println(null+"");
    }
}
