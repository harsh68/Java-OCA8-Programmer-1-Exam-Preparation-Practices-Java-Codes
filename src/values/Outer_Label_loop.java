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
//Labeled continue and break statements must be inside the loop that has the same label name;
//otherwise, the code will not compile.
public class Outer_Label_loop {
    public static void main(String[] args) {
        
        int age = 1;
        outer:
        while(age<21)
        {
            while(age==16)
            {
                System.out.println("Get Driver License");
                age++;
                continue outer;
            }
            System.out.println("Another Year");
            age++;
        }
        
        
        
    }
}
