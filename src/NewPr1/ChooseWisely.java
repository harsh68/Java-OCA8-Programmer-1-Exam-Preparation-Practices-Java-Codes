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
public class ChooseWisely {
        public ChooseWisely()
        {
            super();
        }
/*
        public int choose(int choice)
        {
            return 5;
        }
*/
        public int choose(short choice)
        {
            return 2; 
        }
        public int choose(byte choice)
        {
            return 7; 
        }
        public int choose(long choice)
        {
            return 11;
        }

        public static void main(String[] path)
        {
            System.out.println(new ChooseWisely().choose((short)2+1));//11
            System.out.println(new ChooseWisely().choose((byte)2+1));//11
            System.out.println(new ChooseWisely().choose((byte)(2+1)));//7
            System.out.println(new ChooseWisely().choose((short)(2+1)));//2
        }
}
