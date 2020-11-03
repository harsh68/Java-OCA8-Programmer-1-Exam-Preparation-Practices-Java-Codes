/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casting;

/**
 *
 * @author Harsh
 */
public class UnderScore {
    static int i =100000;
    static int j = 1_00_000;
    //1_00_00_0 legal but can not understand
    public static void main(String[] args) {
           if(i==j){System.out.println("same");
    }
}
}
