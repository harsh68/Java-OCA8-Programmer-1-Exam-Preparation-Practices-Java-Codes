/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SuperClass_Not_Having_Exception;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Harsh
 */

/*
 superclass method having no Exception ---> override Method only allow Unchecked
superclass method having no Exception ---> override Method having checked Exception (compile time error)
superclass method having either checked or unchecked Exception---->No Excption with override  method---->its compile fine.
superclass method having with Exception(checked) ---> override Method only same Exception or subclass of Exception which declared in Superclass Method
superclass method having with Exception(unchecked) ---> override Method can have same Exception or subclass of Exception or superclass of exception which declared in Superclass Method
SuperClass(ArithmeticException)---> subclass override method(RuntimeException)
superclass method having checked Excpetion ----> valid to have unchecked exception with Override method
superclass method having unchecked Excpetion ----> invalid to have checked exception with Override method

    
*/
class SperclassNothaveException
{
    void method() throws ArithmeticException
    {
        
    }
}
public class SubclassDeclareException_thatisChecked_Exception extends SperclassNothaveException {
    
    @Override
    void method() throws RuntimeException
    {
        
    }
    
    void method(int a) throws Exception
    {
        
    }
}
