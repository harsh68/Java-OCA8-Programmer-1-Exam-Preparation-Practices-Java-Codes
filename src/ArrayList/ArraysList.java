/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Harsh
 */
abstract class Animal {}
class Dog extends Animal{}
public class ArraysList {
    public static void main(String[] args) {
         List<Animal> list = new ArrayList<Dog>(); //generics is not polymorphic
         List<String> list29 = new ArrayList();
         List list19 = new ArrayList<String>();
    }
}
