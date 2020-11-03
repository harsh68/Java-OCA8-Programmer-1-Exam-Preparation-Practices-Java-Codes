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
public class ComorNot
{
    public static void main(String[] args) {
        boolean flag = false;
        final boolean b = false;
        while(b) // (1) //while then comple time error
            flag = !flag;
System.out.println(flag);
//String h = new String(0);
}

}
