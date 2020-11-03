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
class A
{
    
}
class B extends A
{
    
}
public class For_Enhance extends B {
    public static void main(String[] args) {
        int x;
        long x2;
        long[] la = {9L,8L,10L};
        int[][] twoDee = {{1,2,3,4},{5,6,7},{8,9,10,11,12,13}};
        String[] str = {"one","two","three"};
        A[] fe = {new For_Enhance(),new B()};
        //print long array
        System.out.println("print long array");
        for(long val:la)
        {
            System.out.println(val);
        }
        System.out.println("2D Arrray each row index 2(for every iteration");
        for(int[] val:twoDee) //entire array is selected
        {
            //here it select index entire row for eacg iteration 
            System.out.println(val[2]);
        }
        
        
        System.out.println("Print index 2 entire row");
        for(int val:twoDee[2])//2nd row select //dont use twoDee[]
        {
            
            System.out.println(val);
        }
        
        System.out.println("Same as previous");
        for(Object v:twoDee[2])
        {
            
            System.out.print(v);
        }
        
        
        for(String val:str)
        {
            
            System.out.println(val);
        }
        for(Object val:str)
        {
            
            System.out.println(val);
        }
        
        System.out.println("[object]2D Arrray each row index 2(for every iteration");
        for(int a[]:twoDee) //entire array is selected //int[] cant convert Object[]
        {
            //here it select index entire row for eacg iteration 
          //  System.out.println(val[2]);
        }
        
        //for(int x4:la) //type is mismatch
        
       
        for(long x4 : la) // its compulsory to declare variable with data type
        {
            
        }
        
        //for(int x4:twoDee){}// cant stuff array into int
        
      //  for(B ob:fe) // incompatible types A to B
        {}
            
        
        
        
        
    }
}
