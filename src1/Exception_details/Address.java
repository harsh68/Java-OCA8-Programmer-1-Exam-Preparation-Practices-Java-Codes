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
public class Address {
public String getAddress(String street, String city) {

    try
    {
       return street.toString() + " : " + city.toString();
} finally 
{
System.out.print("Posted:");
}
}
public static void main(String[] form) {
String street = "Kali";// value omitted
String city = "Anand"; // value omitted
System.out.print(new Address().getAddress(street,city));
}
}
