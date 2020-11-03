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
abstract class Abs1
{
    protected abstract Number fly();
}
public class Abstract extends Abs1{

    /**
     * @return 
     */
   /* Long fly()
    {
        long a = 5;
     return a;   
    }*/
    
   
    public static void main(String[] args) {
        // TODO code application logic here
    }

    @Override
     public Long fly() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
