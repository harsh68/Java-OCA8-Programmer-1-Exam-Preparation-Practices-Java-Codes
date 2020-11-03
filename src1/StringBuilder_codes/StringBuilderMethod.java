/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringBuilder_codes;

/**
 *
 * @author Harsh
 */
public class StringBuilderMethod {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Golden Advise");
        sb.append(" Good News");
        //you can append any type of value (double,int,float,string,long)
        
        
       //delete
        sb.delete(2,6); //first index 0 based , second 1 based
        System.out.println("sb after delete: "+sb);
       //  String s = sb;
      
       //insert
       sb.insert(2," You can insert char array,object string int,long,double,float ");
       System.out.println("after insert: "+sb);
       
       //Reverse String
       StringBuilder sb1 = new StringBuilder("Man will be the Man");
       sb1.reverse();
       System.out.println(sb1);
       
       
       //StringBuilder to String
       String s = sb1.toString();
    }
 
}
