/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lambda;

import java.util.function.Predicate;

/**
 *
 * @author Harsh
 */
public class Lambda3 {
    void go(Predicate<Lambda3> e)
    {
        //Lambda3 m2 = new Lambda3();
        System.out.println(e.test(this) ? "ternary true":"ternary false");
    }
    
    static int add(int x,int y){ return x+y;}
    
    public static void main(String[] args) {
        Lambda3 m1 = new Lambda3();
        
        //if it has not block and single expression have not return statement
        m1.go((Lambda3 x) -> 7<5);
        m1.go(x-> 7>5);
        
        //block must contain return statement
        m1.go(x-> {return add(20,21)>52;});
        m1.go((Lambda3 x) -> {
         int ans =4;
         return add(ans,3) > 8;
        
        });
       
        //No argument type
         m1.go(x -> {
         int ans =4;
         return add(ans,3) > 8;
        
        });
         
        int a=5,b=10;
        m1.go(x -> {return add(a,b)>8;});
        m1.go((Lambda3 x) -> {return add(a,b)>8;});
       
    }
}
