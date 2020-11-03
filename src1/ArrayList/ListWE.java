/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Harsh
 */
public class ListWE {
    public static void main(String[] args) {
        List<String> exams = Arrays.asList("OCA", "OCP");
for (String e1 : exams)
    for (String e2 : exams)
    System.out.print(e1 + " " + e2);
System.out.println();
    }
}
