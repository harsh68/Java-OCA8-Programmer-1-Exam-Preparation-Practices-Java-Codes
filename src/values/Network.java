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
public class Network {
Network(int x,Network n)
{
    id =x;
    
    p=this;
    System.out.println("p*id"+p.id);
    System.out.println("Value of p is: "+p+" value of id is "+ id);
  //  if(n!=null) p=n;
}
Network p;
int id;

    public static void main(String[] args) {
        Network n1 = new Network(1,null);
        n1.go(n1);
    }

    private void go(Network n1) {
   Network n2 = new Network(2,n1);
   Network n3 = new Network(3,n2);
        System.out.println(n3.p.p.id);
    }
}
