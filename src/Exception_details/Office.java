/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception_details;

/**
 *
 * @author Harsh
 */
class Emp  //runt this portion infinite loop
{
    Emp(){
        super();
    }
    Emp e = new Emp();
}
public class Office {
    public static void main(String[] args) {
        Emp a = null;
        a = new Emp();
        a = null;
    }
}
