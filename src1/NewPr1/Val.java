/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NewPr1;

/**
 *
 * @author Harsh
 */
public class Val {
    public static void main(String[] args) {
int counter = 0;
l1:
for (int i = 0; i < 10; i++) {

  int j = 0;
l2:
  while (j++ < 10) {
if (j > i) break l2;
if (j == i) {
counter++;
continue l1;
}
}
}
System.out.println(counter);
}
}

