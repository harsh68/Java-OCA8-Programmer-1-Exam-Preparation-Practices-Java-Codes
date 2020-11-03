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
public class Mo extends lo  {
    public String getC(){
        return super.getC();
    }
    public static void main(String[] args) {
        System.out.println(new Kho().getC()+ " "+ new Mo().getC());
    }
    
}

class Kho extends lo
{
    public String getC(){
        return super.cou;
    }
    void f()
    {
        String s = super.getC();
    }
}
class lo
{
    public String cou = "Hello";
    public String getC(){
        return cou;
    }
    
}
