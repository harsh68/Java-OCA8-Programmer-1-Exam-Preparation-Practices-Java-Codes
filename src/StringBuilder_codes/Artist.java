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
class ColourPack
{
    
}
public class Artist {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("HelloPerfrfef");
        String s= null;
        //s=sb;
        s=sb.substring(0, 4);
        System.out.println(" "+s);
        s=sb.substring(5, 5);
        System.out.println(" *"+s);
        s=sb.substring(4, 5);
        System.out.println(" *"+s);
        s=sb.substring(5, 3);//StringIndexOutOfBound
        System.out.println(" *"+s);
    }
}
