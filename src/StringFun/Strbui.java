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
public class Strbui {
    public static void main(String[] args) {
        StringBuilder a = new StringBuilder("abc");
        StringBuilder b = a.append("de");
        b = b.append("f").append("g");
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        
        
        StringBuilder sb = new StringBuilder("animals");
        sb.insert(7, "-"); // sb = animals-
        sb.insert(0, "-"); // sb = -animals-
        sb.insert(4, "-"); // sb = -ani-mals
        sb.insert(10, "-"); // sb = -ani-mals--
        System.out.println(sb);
          //sb.insert(15, "-"); // SIOB Exception
          
          //StringBuilder sb1 = "Hellos"; //Not Valid
          StringBuilder sb2 = new StringBuilder("Hello");
          //String new1 = sb2; //need sb2.toString();
          
    }
}
