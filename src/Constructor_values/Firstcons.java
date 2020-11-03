/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constructor_values;

/**
 *
 * @author Harsh
 */
class Sys
{
    int age;
    String name;
 
   Sys(String name,int age)
    {
        this.name = name;
        this.age = age;
    }

}
public class Firstcons {
    String n="d";
    int s=2;
    public static void main(String a[])
    {
       // Sys ob = new Sys(n,s);
        Sys ob = new Sys("India",34);
    }
}
