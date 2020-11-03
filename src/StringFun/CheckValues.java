/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringFun;

/**
 *
 * @author Harsh
 */
public class CheckValues {
    public static void main(String[] args) {
        String s = "Hello";
        int i =5;
        double d = 22.22;
        float f = 55.55f;
        System.out.println(s+s);//HelloHello
        System.out.println(s+" "+i+" "+d);//Hello 5 22.22
        System.out.println(s+i+d);//Hello522.22
        System.out.println(i+d+s);//27.22Hello
        System.out.println(d+f);//77.77
        System.out.println(d+s);//22.22nnnnHello
        System.out.println(s+d);//Hello22.22
        System.out.println(s+" "+4+5);//Hello 45
        System.out.println(4+5+s);//9Hello
        System.out.println(s+d);//Hello22.22
        System.out.println(s+d+f);//Hello22.2255.55
        System.out.println(d+f+s);//77.77Hello
        System.out.println(d+" "+f+" "+s);//22.22 55.55 Hello
        
    }
    
}
