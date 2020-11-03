/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lambda;

/**
 *
 * @author Harsh
 */
interface Demo
{
   //No return value
    void calculate();
}
interface NoPara
{
    String ReturnStr();
}
interface Sayable
{
    void name(String name);
}
interface Adable
{
    int add(int a,int b);
}
public class JavaLambda {
    public static void main(String[] args) {
        int width = 10;
        Demo d = ()->System.out.print("Width is "+width); 
        d.calculate();
        int x=98;
       //No parameter 
        //NoPara np =()->return "Noparameter return string";
        NoPara np =()->{System.out.println(x);return "Noparameter return string";};
        System.out.println("Value return: "+np.ReturnStr());
        
        
        //One Parameter 
        Sayable say = (n)->{
            System.out.println(n);  
        };
        say.name("Harsh");
        
        //Multiple parameters
        Adable ad = (a,b)->(a+b);
        System.out.println("sum of two num"+ad.add(4, 5));
        
        Adable ad2=(int a,int b)->(a+b);  
        System.out.println(ad2.add(100,200));
        
        Adable ad3 = (a,b)->{
            return (a+b);
        };
        System.out.println("Sum: "+ad3.add(50, 51));
    }
}
