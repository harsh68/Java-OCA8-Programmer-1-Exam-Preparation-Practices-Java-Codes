/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constructor_values;

class India
{
    int a;
    India(int a){this.a = a;}
}
class Gujarat extends India
{
    Gujarat()
    {
        super(getA());   
    }
    static int getA(){return 5;}
}
public class ConstructorF {

    public static void main(String[] args) {
       Gujarat gj = new Gujarat();
       System.out.println(gj.a);
    }
}
