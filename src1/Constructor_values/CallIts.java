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
//compile time error recursive call
class Market
{
    Market()
    {
        this(5);
    }
    Market(int a)
    {
        this();
    }
}
public class CallIts {
    
}
