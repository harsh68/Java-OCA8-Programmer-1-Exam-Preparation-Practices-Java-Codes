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
interface Side 
{
    String getSide();
}
class Head implements Side
{
        public String getSide() { return "Head "; }
}

class Tail implements Side
{
        public String getSide() { return "Tail "; }
}
class Coin
 {
        public static void overload(Head side) { System.out.print(side.getSide()); }
        public static void overload(Tail side) { System.out.print(side.getSide()); }
        public static void overload(Side side) { System.out.print("Side "); }
        public static void overload(Object side) { System.out.print("Object "); }

        public static void main(String []args) {
        Side firstAttempt = new Head();

        overload(firstAttempt); // Match Actual :Side
        overload((Head)firstAttempt); // Head
        Tail secondAttempt = new Tail(); 
        overload((Object)firstAttempt);//Object
        overload(secondAttempt);//Tail
        overload((Side)secondAttempt);//Side
}}