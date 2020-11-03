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
public class Attendance {
private Boolean[] list; // value omitted
public int printTodaysCount() 
{
    System.out.println(list);
    int count=0;
    for(int i=0; i<10; i++) {
        if(list[i]) ++count;
        }
    return count;
}
public static void main(String[] roster) {
new Attendance().printTodaysCount();
}
}
