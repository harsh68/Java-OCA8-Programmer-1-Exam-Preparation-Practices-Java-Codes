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
class SpecialException extends Exception {
public SpecialException(String message) {
super(message);
System.out.println(message);
}
}
public class ExceptionTest {
public static void main(String[] args) {
try {
doSomething();
}
catch(SpecialException e) {
System.out.println(e);
}
}
static void doSomething() throws SpecialException {
int[] ages = new int[4];
ages[4] = 17;
doSomethingElse();
}
static void doSomethingElse() throws SpecialException {
throw new SpecialException("Thrown at end of doSomething() method");
}
}