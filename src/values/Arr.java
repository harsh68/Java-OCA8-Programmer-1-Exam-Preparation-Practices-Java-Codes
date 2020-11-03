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
public class Arr {
    public static void main(String[] args) {
        int[][] A = {{5,2,1,3,4,5,6,3},{3,9,8,9},{5,7,12,7}};
        System.out.println("A[2][3]="+A[2][3]);
        // System.out.println("A[2][3]="+A[2][4]);//Exception
         int[][] myComplexArray = {{5,2,1,3},{3,9,8,9},{5,7,12,7}};
      OUTER_LOOP:
        for(int[] mySimpleArray : myComplexArray)
        {
            INNER_LOOP:
            for(int i=0; i<mySimpleArray.length; i++)
            {
                System.out.printf(mySimpleArray[i]+"\t");
            }
                System.out.println();
        }
        System.out.println(4*5/3);
        System.out.println(14/5*3);
        int x = 4;
        long y = x*4 - x++ + (x*2);
        System.out.println("x: "+x+" y: "+y);
        int z = 2;
        x=1;
        y=3;
        long s = z++ +y-- + ++x + --y + --z + x + y;//2+2+3+1+1+2+2
        System.out.println("s: "+s);
        z = 2;
        x=1;
        y=3;
        long s1 = z++ +y-- + ++x + --y + --z + (x + y);
        System.out.println("s1:"+ s1);
        byte d =4;
        byte e = 6;
        double f =d+e;
        System.out.println("f: "+f);
        
    }
}
