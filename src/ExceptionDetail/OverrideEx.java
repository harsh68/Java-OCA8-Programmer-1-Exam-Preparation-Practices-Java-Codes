/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionDetail;

/**
 *
 * @author Harsh
 */
class Bird
{
    Bird m1() throws Exception
    {
        System.out.println("bird");
        return new Bird();
    }
}

class Cock extends Bird
{
    @Override
    Cock m1()
    {
        System.out.println("cock");
        return new Cock();
    }
}
public class OverrideEx {
    public static void main(String[] args) throws Exception
    {
        Bird b = new Cock();
        b.m1();
    }
}
