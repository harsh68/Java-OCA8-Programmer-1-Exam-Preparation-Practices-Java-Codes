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
public class DataCheck {
    public static void main(String[] args) {
        List<Character> ch = new ArrayList<>();
        ch.add(0, 'A');
        ch.add(0, 'A');
        ch.add(0, 'A');
        ch.add(0, 'A');
        ch.add(0, 'A');//5 times
        //ch.remove('A');//exception
        //ch.remove(65);//exception
        ch.remove(new Character('A'));
        System.out.println(ch);
    }
}
