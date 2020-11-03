/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constructor_values;

/**
 *
 * @author Harsh
 */

public class CheckStatus {

    int a;
    public CheckStatus()
    {
        a=5;
    }
    public CheckStatus(int a)
    {
        a = a;
        //a=this.a;
    }
    public static void main(String[] args) {
        new CheckStatus(12).newTon();
        new CheckStatus().newTon();
    }
    private void newTon()
    {
        System.out.println("Value of a"+a);
    }
}
