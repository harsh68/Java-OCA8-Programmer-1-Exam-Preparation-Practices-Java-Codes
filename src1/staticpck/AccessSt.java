/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticpck;
import newpackage.*;
import static newpackage.NewClass.a;
    //static import is not for class its for only static members
/**
 *
 * @author Harsh
 */
public class AccessSt {
    int ab;
    AccessSt(int ab)
    {
        ab= this.ab;
    }
    public static void main(String[] args) {
        NewClass nc = new NewClass();
        a = 12; // cant access
        //NewClass.a =45;
        nc.b = 13;
        int n =6;
        AccessSt st = new AccessSt(5);
        st.reint(n);
        System.out.println("st.ab"+st.ab);
    }
     int reint(int n)
    {
        n++;
        return n; //returning mehod values not parameter
    }
}
