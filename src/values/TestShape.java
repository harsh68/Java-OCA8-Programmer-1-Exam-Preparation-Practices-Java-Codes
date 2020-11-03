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
class GameShpae
{
    public void shaper()
    {
        System.out.println("Display Shape");
    }        
}
class Demo extends GameShpae
{
    public void Demoshaper()
    {
        System.out.println("Display Demo Shape");
    }
}

class Tile extends GameShpae
{
    public void Tileshaper()
    {
        System.out.println("Display Tile Shape");
    }
}
public class TestShape {
    public static void main(String a[])
    {
        Demo d =new Demo();
        Tile t = new Tile();
        GameShpae g =new GameShpae(); // reference variable type will never change once its declared
        g = new Tile(); //  reassign with other object 
        
        
        doshape(d);
        doshape(t);
    }

    private static void doshape(GameShpae d) {
       d.shaper();
    }
    
}
