package values;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Harsh
 */
public class TestVal {
    public static void main(String[] args) {
        int a = 100;
       System.out.println(-++a);
        System.out.println(a);
        System.out.println(-a++);
        System.out.println(a);
       
        System.out.println(-a--);
        System.out.println(a);
        System.out.println(---a);
    }
}
