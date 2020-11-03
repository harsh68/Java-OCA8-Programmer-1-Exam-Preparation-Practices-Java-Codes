/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

/**
 *
 * @author Harsh
 */
public class VaraArray {
    public static void walk(int start, int... nums) {
    System.out.println("walk"+nums.length);
        System.out.println(start);
    }
    
    public static void walkawya(int start, String... nums) {
    System.out.println("waa"+nums.length);
    }
    
    public static void walktogether(int... start) {
    System.out.println("wt"+start.length);
        System.out.println("element start[1]"+start[1]);
    }
    
    public static void main(String[] args) {
   walk(1);//start =1,nums array as length =0
   walk(1,2);//start =1, array as length =1 having element nums[0] = 2
        
   walk(1,2,3);//start =1, array as length =2 having element nums[0] = 2,nums[1]=3
   //walk(1,null);//null is not int so it gives nullpointer exception when access to length method
   
   walkawya(1);//
   walkawya(1,"2");
   walkawya(1,new String[]{"2","3"});
   walkawya(1,null);
  /* 
   walktogether(11,22,33);
   */
   
    }
}
