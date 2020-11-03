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
interface i
{
    void dis();
}
abstract class A
{
    abstract void dis();
}
public class OcaA extends A implements i {

    @Override
    void dis() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
