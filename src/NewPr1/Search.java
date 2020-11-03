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
public class Search
{
        public static void main(String[] args) {
         String s = "Contentment!";
          int middle = s.length()/2;

         String nt = s.substring(middle-1, middle+1);
         System.out.println(middle+nt);
         System.out.println(s.lastIndexOf(nt, middle));
}
}