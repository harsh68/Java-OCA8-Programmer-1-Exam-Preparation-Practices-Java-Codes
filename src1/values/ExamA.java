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
public class ExamA {
    //public static final String h;
    final int p;
    static void display(boolean...a)
    {
        System.out.println("length"+a.length);    
    }
    ExamA(){p=23;}
    ExamA(int a){this();}
    
    void good()
    {
       z:    
        for(int i=0; i<4;i++)
        {
        if(i==2) break z;
        }    
    }
    
    public static void main(String[] args) {
        //display({true,true});
        display(true,true);
    }
    
}
