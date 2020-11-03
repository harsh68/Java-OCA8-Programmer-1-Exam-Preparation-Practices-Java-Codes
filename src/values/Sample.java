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
public class Sample {
    private String str;
    private int i;
    public Sample()
    {
        this("sd",56);
    }
    public Sample(String str,int i)
    {
        str=str;
        i=i;
    }
    public static void main(String[] args) {
        Sample s = new Sample();
        System.out.println("COlor "+s.str);
        System.out.println("Value of i :"+s.i);
    }
    
}
