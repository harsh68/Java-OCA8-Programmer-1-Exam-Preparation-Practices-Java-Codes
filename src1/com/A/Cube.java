/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.A;

/**
 *
 * @author Harsh
 */
class Urd
{
  void recCti()
  {
      System.out.println("FR");
  }
   void oerridePri() throws Exception
  {
      
  }
}
class Brt extends Urd
{
    void recCti()
  {
      System.out.println("F(R");
  }
    void oerridePri() throws RuntimeException
  {
      
  }
    Brt()
    {
        super();
        super.recCti();
    }
    
}
public class Cube {
    Cube()
    {
        System.out.println("call this");
    }
    public static void main(String[] args) {
        new Brt();
    }
}


