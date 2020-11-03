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
public class Val {
    public static void main(String[] args) {
        if("hello" == "hello"){
            
            System.out.println("true");
        }
        
        String s = "hello";
        System.out.println(s=="hello");
        StringBuilder sb = new StringBuilder("hello");
        String s1 = sb.toString();
        System.out.println(s1==s);
        long y = 45,z=45;
        int x = (int)y+z;
        if(0==null)
        {
            
        }
    }
}
