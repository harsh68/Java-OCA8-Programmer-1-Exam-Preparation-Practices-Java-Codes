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
public abstract class AbsBit {
    private void priy(){System.out.println("main");}
    public static void main(String[] args) {
        AbsBit o = new Bbs();
        o.priy();
    }
    // abstract void in();
}

class Bbs extends AbsBit
{
    final char ch='a',g='t';
    protected void priy()
    {
        System.out.println("Outliner");
    }
}
