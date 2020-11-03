/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Harsh
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lambda;

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 *
 * @author Harsh
 */
class Dogi
{
    String name;
    int age;
    double weight;
    Dogi(String name,int age,double weight)
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
public class Testcode2 {
    public static void main(String[] args) {
        ArrayList<Dogi> al = new ArrayList<>();
        al.add(new Dogi("pam",23,34.33));
        al.add(new Dogi("brid",45,65.33));
        al.add(new Dogi("catie",31,44.33));
        al.add(new Dogi("Zebro",20,90.33));
        al.add(new Dogi("husky",11,77.33));
        al.add(new Dogi("odsd",41,32.33));
        al.add(new Dogi("gend",55,89.33));
        al.add(new Dogi("indo",73,11.33));
        al.add(new Dogi("lalo",22,66.33));
        al.add(new Dogi("nes",87,755.33));
        al.add(new Dogi("puppy",39,664.33));
        al.add(new Dogi("pamorian",23,34.33));
        
        System.out.println("List of dogs name"+al.toString());
        System.out.println("List of dogs whose weight > 50"+ max50weight(al, d -> d.weight>50));    
        
    }
    static ArrayList<Dogi> max50weight(ArrayList<Dogi> n,Predicate<Dogi> expr)
    {
         ArrayList<Dogi> doglist50g = new ArrayList<>();
         for(Dogi d:n)
         {
             if(expr.test(d))
             {
                 doglist50g.add(d);
             }
         }
         return doglist50g;
    }
}

