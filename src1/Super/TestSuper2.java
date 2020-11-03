/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Super;

/**
 *
 * @author Harsh
 */
class Animal1
{  
    void eat(){System.out.println("eating...");}  
}  
 class Dog1 extends Animal1
 {  
    @Override
    void eat(){System.out.println("eating bread...");}  
    void bark(){System.out.println("barking...");}  
    void work()
    {  
        super.eat();
        eat();
        super.eat();
        bark();  
    }  
  }  
class TestSuper2{  
public static void main(String args[]){  
Dog1 d=new Dog1();  
d.work();  
}}  