/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjectCast;

/**
 *
 * @author Harsh
 */
public class Redwood extends Tree {
    public static void main(String[] args) {
       /* Redwood r = new Redwood();
        Tree t = (Tree)r;
        Tree t1 = new Tree();
        Redwood rd = (Redwood)t1;
        Tree t2 = (Redwood)r;*/
       new Redwood().go();
    }
void go()
{
    go2(new Tree(),new Redwood());
    go2((Redwood)new Tree(),new Redwood());
}
    void go2(Tree t1,Redwood r1)
    {
     Redwood r2 = (Redwood)t1;
     Tree t2 = (Tree)r1;
    }
    
}
class Tree
{
    
}
