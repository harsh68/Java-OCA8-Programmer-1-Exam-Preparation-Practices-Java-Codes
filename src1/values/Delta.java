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
interface Foo {} 
class Alpha implements Foo {} 
class Beta extends Alpha {} 
class Delta extends Beta {
public static void main( String[] args ) {
Beta x = new Beta(); 
 Beta b = (Beta)(Alpha)x; //insert code here 16
} } 