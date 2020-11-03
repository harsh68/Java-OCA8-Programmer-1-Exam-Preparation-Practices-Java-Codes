/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception_details;

/**
 *
 * @author Harsh
 */
class CastleUnderSiegeException extends java.lang.Exception {}
class KnightAttackingException extends CastleUnderSiegeException {}
public class Citadel 
{
    public void openDrawbridge() throws RuntimeException
    {
        try
        {
                throw new KnightAttackingException();
        } 
        catch (java.lang.Exception e)
        {
            throw new ClassCastException();
        }
        finally 
        {
            throw new CastleUnderSiegeException(); // q2
        }
    }
public static void main(String[] moat) {
new Citadel().openDrawbridge(); // q3
}
}