/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package values;

/**
 *
 * @author Harsh
 */
public class Msg {
public static String doMsg(char x) {
    System.out.println(x);
return "Good Day!";
}
public static String doMsg(int y) {
    System.out.println(y);
return "Good Luck!";
}
public static void main(String[] args) {
char x = 8;
int z = '8';
System.out.println(doMsg(x));
System.out.print(doMsg(z));
}
}
