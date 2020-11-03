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
public class Values {

    /**
     * @param args the command line arguments
     */
    float h,w;
    Values(float h,float w)
    {
        this.h = h;
        this.w = w;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Values vs = new Values(5,10);
        Values vs1 = new Values(15, 15);
        System.out.println("before height: "+vs.h);
        vs1.change(vs);
        System.out.println("before height: "+vs.h);
    }
    void change(Values vs2)
    {
        vs2.h = 500;
        vs2 = new Values(2,2);
        System.out.println("vs2 now "+ vs2.h);
    }
    
}
