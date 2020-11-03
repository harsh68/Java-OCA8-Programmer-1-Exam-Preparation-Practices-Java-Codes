/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;

import java.util.ArrayList;

/**
 *
 * @author Harsh
 */
abstract class Animal1
{
    
}
interface hunter
{
    
}
class catt extends Animal1 implements hunter
{
    
}
class Tiger extends catt
{
    
}
public class Imp {
    public static void main(String[] args) {
        ArrayList<Animal1> l =new ArrayList<>();
        l.add(new catt());
        
        ArrayList<Tiger> l2 =new ArrayList<>();
        l2.add(new catt());
    }
}
