/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author Harsh
 */
/*
if the method name and input parameters are the same but the return
types are different between the two methods, the class or interface attempting to inherit
both interfaces will not compile.
*/
interface i9
{
    int display();
}
interface i11
{
    void display();
}
public class NotCompile implements i9,i11 {

    @Override
    public int display() {
     }
    
    
}
