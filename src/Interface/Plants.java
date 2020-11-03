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

/*
If two abstract interface methods have identical behaviors—or in this case the same method
signature— creating a class that implements one of the two methods automatically implements
the second method. In this manner, the interface methods are considered duplicates
since they have the same signature.
*/
    interface Herbivore
    {
        public void eatPlants();
    }
    interface Omnivore
    {
        public void eatPlants();
        public void eatMeat();
    }

public class Plants implements Herbivore,Omnivore {
    public void eatMeat()
    {
        System.out.println("Eating meat");
    }
    public void eatPlants()
    {
        System.out.println("Eating plants");
    }
    
    public static void main(String[] args) {
        
    }
}
