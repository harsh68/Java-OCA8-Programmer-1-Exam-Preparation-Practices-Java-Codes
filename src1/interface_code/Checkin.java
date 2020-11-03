/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interface_code;

/**
 *
 * @author Harsh
 */
interface a
{
    default int ap(){
        return 1;
    }
}
interface b
{
    default int ap(){
        return 1;
    } 
}
public  abstract class Checkin implements a,b {
    public int ap()
    {
        return 1;
    }
}
