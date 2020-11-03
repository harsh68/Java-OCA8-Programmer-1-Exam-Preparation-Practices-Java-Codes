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
public class Series
{
    private boolean flag;
    public void displaySeries() 
    {
        int num = 2;
        while(flag)
        {
            if(num%7 == 0)
                flag = false;
            System.out.print(num);
            num += 2;
        }
}
public static void main(String[] args) {
new Series().displaySeries();
}
}
