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
interface u
{
    
}
interface v
{
    
}
class Nj implements u{}
class Jk extends Nj implements v{}
        
public class InstanceOp {
    public static void main(String[] args) {
        Jk j = new Jk();
        if(j instanceof Nj){System.out.println("1.jk");}
        if(j instanceof u){System.out.println("2.jku");}
        if(j instanceof v){System.out.println("3.jkv");}
        
        Nj n = new Nj();
        if(n instanceof Nj){System.out.println("4.nj");}
        if(n instanceof u){System.out.println("5.nju");}
        if(n instanceof v){System.out.println("6.jkv");}//false
        
        u in = new Nj();
        if(in instanceof Nj){System.out.println("7.nj-in");}
        if(in instanceof u){System.out.println("8.nju-in");}
        if(in instanceof v){System.out.println("9.jkv-in");}//false
        if(in instanceof Jk){System.out.println("10.jkJK-in");}//false
        
        u inu = new Jk();
        if(inu instanceof Nj){System.out.println("11.nj-inu");}
        if(inu instanceof u){System.out.println("12.nju-inu");}
        if(inu instanceof v){System.out.println("13.jkv-inu*");}
        if(inu instanceof Jk){System.out.println("14.jkJK-inu");}
        
        
        v inv = new Jk();
        if(inv instanceof Nj){System.out.println("15.nj-inv");}
        if(inv instanceof u){System.out.println("16.nju-inv");}
        if(inv instanceof v){System.out.println("17.jkv-inv*");}
        if(inv instanceof Jk){System.out.println("18.jkJK-inv");}
        
        //v iv = new Nj();
        
        
    }
}
