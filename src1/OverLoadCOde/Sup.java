/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OverLoadCOde;

/**
 *
 * @author Harsh
 */
class Sup1
{
    protected void m1(int x)
    {
        
    }
}
class Sup2 extends Sup1
{
    public void m1(){}
    private final int m1(int i){return i;}
    //even though its private method it can not overload
    
}
public class Sup {
    
}
