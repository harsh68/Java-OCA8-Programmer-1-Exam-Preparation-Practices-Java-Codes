/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package values;

/**
 *
 * @author Harsh
 */
class Frt
{
    int id;
    String n="u";
}
public class NewClass3 {
    public static void main(String[] args) {
        Frt f = new Frt();
        //System.out.println(f.id.equals(f.id));
        System.out.println(f.n.equals(f.id));
        //System.out.println(f.id.equals(f.n));
        System.out.println(f.n.equals(f.n));
        System.out.println(f.n.equals(null));
        System.out.println(null==null);
        
       
    }
}
