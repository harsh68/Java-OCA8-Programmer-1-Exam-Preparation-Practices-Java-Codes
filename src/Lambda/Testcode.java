/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lambda;

import java.util.ArrayList;

/**
 *
 * @author Harsh
 */
class Dog
{
    String name;
    int age;
    double weight;
    Dog(String name,int age,double weight)
    {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    double getdogweight()
    {
        return weight;
    }
    String getname()
    {
        return name;
    }
    int getage()
    {
        return age;
    }
    public String toString()
    {
        return name;
    }
    
}
public class Testcode {
    public static void main(String[] args) {
        ArrayList<Dog> al = new ArrayList<>();
        al.add(new Dog("pam",23,34.33));
        al.add(new Dog("brid",45,65.33));
        al.add(new Dog("catie",31,44.33));
        al.add(new Dog("Zebro",20,90.33));
        al.add(new Dog("husky",11,77.33));
        al.add(new Dog("odsd",41,32.33));
        al.add(new Dog("gend",55,89.33));
        al.add(new Dog("indo",73,11.33));
        al.add(new Dog("lalo",22,66.33));
        al.add(new Dog("nes",87,755.33));
        al.add(new Dog("puppy",39,664.33));
        al.add(new Dog("pamorian",23,34.33));
        
        System.out.println("List of dogs name"+al.toString());
        System.out.println("List of dogs whose weight > 50"+ max50weight(al,50).toString());    
        
    }
    static ArrayList<Dog> max50weight(ArrayList<Dog> n,int weight)
    {
         ArrayList<Dog> doglist50g = new ArrayList<Dog>();
         for(Dog d:n)
         {
             if(d.getdogweight()>=weight)
             {
                 doglist50g.add(d);
             }
         }
         return doglist50g;
    }
}
