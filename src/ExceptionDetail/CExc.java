/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionDetail;

import java.util.ArrayList;

/**
 *
 * @author Harsh
 */
public class CExc {
    public static void main(String[] args) {
        ArrayList mt = new ArrayList();
        try
        {
            while(true)
            {
                mt.add("yu");
            }
          
        }
        catch(RuntimeException | OutOfMemoryError r)
        {
            System.out.println("A");
        }
        catch(Exception r)
        {
            System.out.println("B");
        }
          System.out.println("");
    }
}
