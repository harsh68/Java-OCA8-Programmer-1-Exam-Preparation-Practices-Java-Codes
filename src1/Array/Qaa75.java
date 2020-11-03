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
public class Qaa75 {
public static void main(String[] args) {
String[][][] arr = {
{ {}, null },
{ { "1", "2" }, { "1", null, "3" } },
{},
{ { "1", null } }
};
System.out.println(arr.length + arr[1][2].length);
}
}