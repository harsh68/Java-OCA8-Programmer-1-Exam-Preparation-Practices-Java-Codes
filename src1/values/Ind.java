/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package values;
class Det
{   
}
class Eign extends Det
{
}
public class Ind {
    public static void main(String[] args) {
        Det d = new Det();
        Eign e = new Eign();
        Det d1 = e;
        if(d1==e)
        {
            System.out.println("Good");
        }    
    }
}
