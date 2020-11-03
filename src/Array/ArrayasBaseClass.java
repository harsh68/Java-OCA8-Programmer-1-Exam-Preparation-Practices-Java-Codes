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
//ArrayStoreException
class Base {}
class DeriOne extends Base {}
class DeriTwo extends DeriOne {}
class ArrayasBaseClass {
 public static void main(String []args) {
 Base[] baseArr = new DeriOne[30]; //you can only take array element of DeriOne or subclass of Derione
 baseArr[0] = new DeriOne();
 //baseArr[1] = new Base();
 baseArr[2] = new DeriTwo();
 System.out.println(baseArr.length);
 }
}