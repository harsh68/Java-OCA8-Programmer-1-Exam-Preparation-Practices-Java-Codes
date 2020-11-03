/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packagedemo.pants;
//import packagedemo.*;
import static packagedemo.ShirtMain.getColor;
/**
 *
 * @author Harsh
 */
public class PaintMain {
    public void matchShirt()
            {
            String color = getColor();
            //if(color.equals("g"))
            System.out.println("match");
            }
    public static void main(String[] args) {
        PaintMain pm = new PaintMain();
        pm.matchShirt();
        
    }
}
