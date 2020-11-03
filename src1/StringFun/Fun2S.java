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
public class Fun2S {
    public static void main(String[] args) {
        String line = new String("-");
        String anotherLine = line.concat("-");
        System.out.println(line+" "+anotherLine);
        System.out.print(line == anotherLine);
        System.out.print(" ");
         System.out.println(line.length());
         System.out.println(anotherLine);
    }
}
