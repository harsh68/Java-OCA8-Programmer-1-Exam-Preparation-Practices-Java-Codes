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
     interface Herbivore1
     {
         interface int a; // must be initialize
        public int eatPlants();
     }

    interface Omnivore1
    {
            public void eatPlants();
    }
    
 interface Supervore extends Herbivore1, Omnivore1 {} // DOES NOT COMPILE
 abstract class AbstractBear implements Herbivore1, Omnivore1 {}
// DOES NOT COMPILE
public class DOesnotCompile {
    
}
