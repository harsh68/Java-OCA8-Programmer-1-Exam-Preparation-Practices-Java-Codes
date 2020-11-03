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
public class CharStr
{
    int dis()
    {
        return 2;
    }
    public static void main(String[] args) 
    {
        char[] ch = {'a','b','c','d','e','f','g'};
        String s = new String(ch);
        System.out.println(ch);
        String sub = s.substring(3, 4);
        System.out.println(sub);
        CharStr cs = new CharStr();
        cs.dis();
    }
}
