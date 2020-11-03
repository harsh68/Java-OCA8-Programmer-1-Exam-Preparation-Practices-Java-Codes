/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstrctClass;

/**
 *
 * @author Harsh
 */
abstract class Pqr
{
    abstract void disney();
    protected abstract void checking();
    final void view()
    {
        System.out.println("VIs");
    }
    
    static void push()
    {
        System.out.println("push");
    }
}
public class Abstr extends Pqr {
    @Override
    void disney()
    {
        
    }
    @Override
    public void checking(){}
    
    public static void main(String[] args) {
        Pqr a = new Abstr();
        a.view();
        Pqr.push();
        a.push();
        Pqr s=null;
        s.push();
    }
}
