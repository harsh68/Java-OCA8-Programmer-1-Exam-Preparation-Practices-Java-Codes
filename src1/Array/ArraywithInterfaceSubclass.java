/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

/**
 *
 * @author Harsh
 */
class Xima
{
    
}
class Qubec extends Xima
{
    
}
interface I1
{
    
}
class Secure extends Qubec implements I1
{
    
}
class Invite extends Xima implements I1
{
    
}
class GolfClub
{
    
}
interface I2 extends I1
{
    
}
public class ArraywithInterfaceSubclass {
    public static void main(String[] args) {
        
        Xima[] q = new Xima[]{new Qubec(),new Xima()};
        //in interface array you can only assign object of those class who implements that interface    
        
        I1[] i = new I1[]{new Secure(),new Invite()};
        //I1[] i2 = new I1[]{new Secure(),new Invite(),new GolfClub()}; //GolfClub does not implements Interface
        
        //I2[] i1 = new I2[]{new Secure()}; //Compile time error
        Xima[] x;
        Qubec[] qu = null;
        x=new Qubec[4];
        GolfClub[] gc = new GolfClub[4];
        //x=gc; 
        I1[] ii;
        Invite[] guest = new Invite[4];
        ii = guest; //Is-A relationship
        I2 ii2;
        //ii2 = guest;
    }
   
}
