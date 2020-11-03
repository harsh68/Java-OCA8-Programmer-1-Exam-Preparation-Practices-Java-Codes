/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception_details;



/**
 *
 * @author Harsh
 */

class Winter {
    
    void crazyLoop(){
  int c = 0;
  JACK: while (c < 8)
  {
       JILL: System.out.println(c);
    if (c > 3)
        break JACK;
    else
        c++;
  }
}
    
    
    public void doA(int k) throws java.lang.Exception {  
        for(int i=0; i< 10; i++) {
            if(i == k) throw new java.lang.Exception(); 
        }
    }
    public void doB(boolean f)  {  //required
        if(f) {
            doA(15); 
        }
        else return;
    }
    public static void main(String[] args) {  //required 
        Winter a = new Winter();
        a.doB(args.length>0); 
 }
}

