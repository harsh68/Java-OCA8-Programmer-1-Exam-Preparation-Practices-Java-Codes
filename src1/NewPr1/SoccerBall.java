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
abstract class Ball 
{

    protected final int size;

    public Ball(int size) {

        this.size = size;

    }
}
interface Equipment {}

public class SoccerBall extends Ball implements Equipment {

    public SoccerBall() {

        super(5);

    }

    public Ball get() { return this; }

    public static void main(String[] passes)
    {
        Equipment equipment = (Equipment)(Ball)new SoccerBall().get();
        System.out.println(((SoccerBall)equipment).size);
    }
}