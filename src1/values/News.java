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
class Aa
{
    int a = 5;
    void ind(){
        System.out.println("ind1");
    }
}
public class News extends Aa {
    int a = 15;
    @Override
    void ind(){
        System.out.println("ind4");
    }
    public static void main(String[] args) {
    Aa ob = new News();
   // News n1 = new News();
   // Aa ob2 = new Aa();
  /*  if(ob instanceof News)
    {
        ob = (News)(ob);// reference change Aa to News
        System.out.println(ob.a);
    }*/
    
    ob.ind();
        System.out.println("Check value"+ob.a); //5
        System.out.println("Downcasting "+((News)ob).a);//15
        System.out.println("Check value"+ob.a); //5
        ob = ((News)ob);
         System.out.println("Final Check value"+ob.a);//5
    }
}
