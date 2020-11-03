/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringFun;

import java.io.IOException;

/**
 *
 * @author Harsh
 */
class As
{
    void b() throws Exception
    {
        
    }
}
class Bs extends As
{
    @Override
    void b() throws IOException
    {
        
    }
}

public class NullCompare {
    public static void main(String[] args) {
        String s = "hello";
        String s2 = null;
        System.out.println(s.equals(s2)); //return false
        String[] s3 = new String[0];
        System.out.println(""+s3[0]);
    }
}
