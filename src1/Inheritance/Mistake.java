/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author Harsh
 */
 class Employee 
{
    public void setSalary(double salary)
    {
        System.out.println("Employee.setSalary():" + salary);
    }
}
 class Manager extends Employee
{
// Override setSalary() in the Employee class
     //if i properly not override then it call superclass method
     // example int salary ,so its not properly override
     //
     
     
    @Override
    public void setSalary(double salary)
    {
    System.out.println("Manager.setSalary():" + salary);
    }
    
    public void display()
    {
    System.out.println("We cant call this method using object of dynamic dispatch");
    }
}

public class Mistake
{
    public static void main(String args[])
    {
        //Employee ken = new Manager();
        //Manager m1 = new Manager();
       // Employee e1 = new Employee();
        Employee ken = new Manager();
        // At compile time ken reference type of Employee
        // At run type it Object type of class Manager  run the method that belongs to that particular object.
        /*In dynamic method dispatch the object can call the overriding methods of child class and all 
        the non-overridden methods of base class but it cannot call the methods
        which are newly declared in the child class.*/
        
        int salary = 200;
        ken.setSalary(salary);
       //ken.display();
        //m1.setSalary(100);
        //e1.setSalary(50);
    }
}
