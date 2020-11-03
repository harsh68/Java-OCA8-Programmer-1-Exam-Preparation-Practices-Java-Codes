/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author Harsh
 */
interface Plant
{
    default String grow() { return "Grow!"; }
}
interface Living 
{
    public default String grow() { return "Growing!"; }
}
public class Tree implements Plant, Living
{ // m1
    public String grow(){return "ok";}
    public String grow(int height) { return "Super Growing!"; }
    public static void main(String[] leaves) {
    Plant p = new Tree(); // m2
    System.out.print(((Living)p).grow()); // m3
}
}