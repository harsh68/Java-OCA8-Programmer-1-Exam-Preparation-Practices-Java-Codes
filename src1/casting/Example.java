/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casting;

/**
 *
 * @author Harsh
 */
/*
When you assign value of one data type to another, 
the two types might not be compatible with each other.
If the data types are compatible, then Java will perform the conversion automatically known as
Automatic Type Conversion and if not then they need to be casted or converted explicitly.
For example, assigning an int value to a long variable.

Widening or Automatic Type Conversion
-2^(n-1) to (2^(n-1))-1 
n: byte
byte= 1 byte 
short = 2 byte
int = 4 byte
long = 8 byte
*/
public class Example {

    public static void main(String[] args)
    {
       char ch = 'A';
       int b = ch;
       System.out.println(b);
       int c = ch;
       System.out.println(b);
    }
    
}
    

