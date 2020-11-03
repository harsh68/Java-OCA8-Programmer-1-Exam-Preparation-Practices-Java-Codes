/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringFun;

/**
 *
 * @author Harsh
 */
public class Test {
public static void main(String[] args) {
try {
String[] arr =new String[4];
arr[1] = "Unix";
arr[2] = "Linux";
arr[3] = "Solarios";
for (String var : arr) {
System.out.print(var + " ");
}
} catch(Exception e) {
System.out.print (e.getClass());
}
}
}