/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringBuilder_codes;

/**
 *
 * @author Harsh
 */
public class MoreSb {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("HelloWorld");
        sb.insert(1,true);
        sb.insert(4,'f');
        sb.insert(0,sb);
        System.out.println(sb);
        sb.delete(0, 19);
        System.out.println(sb);
        sb.delete(9,-500);
        System.out.println(sb);
    }
}
