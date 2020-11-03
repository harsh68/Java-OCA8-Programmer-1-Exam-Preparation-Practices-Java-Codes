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
    abstract class Book
    {
            protected static String material = "papyrus";

            public Book() {}

            public Book(String material) {this.material = material;}

    }


public class Encyclopedia extends Book
{

    public static String material = "cellulose";

    public Encyclopedia() {super();}

    public String getMaterial() {return super.material;}

    public static void main(String[] pages) {

        System.out.print(new Encyclopedia().getMaterial());
    }
}