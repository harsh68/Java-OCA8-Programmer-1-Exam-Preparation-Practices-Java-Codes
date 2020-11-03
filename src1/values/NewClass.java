/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package values;

/**
 *
 * @author Harsh
 */
public class NewClass {
    public static void main(String[] args) {
        String s = "Hello";
        int i = 56;
        float f = 5.55f;
        double d = 2.22;
        
        System.out.println(s+f);//Hello5.55
        System.out.println(s+s);//HelloHello
        System.out.println(i+f+s);//61.55Hello
        System.out.println(s+i+f);//Hello565.55
        System.out.println(s+d);//Hello2.22
        System.out.println(d+s);//2.22Hello
        System.out.println(s+" " +5+ " "+4);//Hello 5 4
        System.out.println(s+" "+5+4);//
    }
}
