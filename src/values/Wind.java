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
public class Wind {
    int id;
    Wind(int i){ id=i;}
    
    public static void main(String[] args) {
        new Wind(10).go();
    }

    void go() {
       Wind w1 = new Wind(1);
       Wind w2 = new Wind(2);
        System.out.println(w1.id+ "   "+w2.id+" "+id);
    }
    
}
