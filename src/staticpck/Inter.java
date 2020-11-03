package staticpck;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Harsh
 */
interface statin
{
    static void fgh()
    {
        System.out.println("gh");
    }
}
public class Inter implements statin {
    void fgh()
    {
        System.out.println("jk");
    }
    public static void main(String[] args) {
        statin.fgh();
        statin ob = new Inter();
        ob.fgh();
    }
}
