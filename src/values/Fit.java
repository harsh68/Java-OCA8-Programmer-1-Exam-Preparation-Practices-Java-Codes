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
public class Fit {
    public static void main(String[] args) {
        float value1 = 102.0; //need literal f or F
        float value2 = (int)102.0; // double to int and auto int to flaot
        float value3 = 1f * 0.0; // double cast
        float value4 = 1f * (short)0.0; // larger cast float
        float value5 = 1f * (boolean)0; //bool invalid
        float value7 = 102; //auto int to float
    }
}
