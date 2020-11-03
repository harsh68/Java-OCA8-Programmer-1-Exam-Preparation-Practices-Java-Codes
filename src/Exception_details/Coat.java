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
    public class Coat
    {
        public Long zipper() throws java.lang.Exception
        {
            try
            {
                    String checkZipper = (String)new Object();
            }
            catch (java.lang.Exception e)
            {
                    throw new RuntimeException("Broken!");
            }
        return null;
        }
        
        public static void main(String... warmth)
        {
            try
            {
                new Coat().zipper();
                System.out.print("Finished!");
            }
            catch (Throwable t) {}
        }
}