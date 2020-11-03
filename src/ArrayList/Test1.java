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
class Patient
{
    String name;
    public Patient(String name) {
        this.name = name;
    }
}
public class Test1 {
    
    public static void main(String[] args)
    {
    List ps = new ArrayList();
    List fruits = new ArrayList<>();
    List fruits1 = new ArrayList<String>();
 
    fruits.add("we");
    System.out.println(fruits);
 
    Patient p2 = new Patient("Mike");
    ps.add(p2);
 
    int f = ps.indexOf(new Patient("Mike"));
        System.out.println(f);
    if(f >= 0) {
 System.out.print("Mike Found");
 }
 }
 }