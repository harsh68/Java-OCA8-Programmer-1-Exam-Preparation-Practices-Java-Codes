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
class Alpha
{
    static String s = " ";
    protected Alpha(){s += " Alpha "; }
}
class SubAlpha extends Alpha
{
    private SubAlpha(){
        s += " subalpha "; 
    }
}
public class SubSubAlpha extends Alpha{
    private SubSubAlpha(){
        super();
        s+=" subsubalpha ";
    }
    public static void main(String[] args) {
        new SubSubAlpha();
        System.out.println(s);
    }
    
}
