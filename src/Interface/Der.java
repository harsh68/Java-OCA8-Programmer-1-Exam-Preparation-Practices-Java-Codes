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
interface Sert
{
    static void dis()
    {
        System.out.println("hungry");
    }
}
public class Der {
    public static void main(String[] args) {
        Sert.dis();
    }
}
class fgt implements Sert
{
    void ert()
    {
        Sert su = new fgt();
        su.dis(); //only call with interface name
        Sert.dis();
    }
    
    void crazyLoop(){
  
  int c = 0;
  
  if(c!=0){}
  JACK:while (c < 8){
     System.out.println(c);
    JILL:
    if (c > 3) 
        break JACK;
    else
        c++;
  }
}
}
