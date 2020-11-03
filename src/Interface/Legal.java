/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author Harsh
 */
interface f3
{
    int A =56;
    static void meThod(){
        System.out.println("Static method");
    }
    default int ret()
    {
        System.out.println("Return default");
        return A;
    }
}
public class Legal implements f3{
    public static void main(String[] args) {
        Legal l1 = new Legal();
        l1.go();
       // meThod();
        System.out.println("l1.ret() in main method"+ l1.ret());
        f3.meThod();
        
    }
    void go()
    {
        System.out.println(ret());
    }
    
}
