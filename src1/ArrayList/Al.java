/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;

/**
 *
 * @author Harsh
 */
public class Al {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add(1,"First");
        for(String s:list) //IndexOutOfBound
        {
            System.out.println(""+s);
        }
    }
}
