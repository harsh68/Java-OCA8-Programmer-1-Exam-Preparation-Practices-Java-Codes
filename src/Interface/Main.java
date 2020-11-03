/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author Harsh
 */
interface Foo
{
   public default int foo(int i)
   {
      return 999;
   }
}
class Bigbar
{
  public int foo(int i)
   {
      return i * 420;
   }  
}
class Bar extends Bigbar
{
    @Override
    public int foo(int i)
   {
      return i * 2;
   }
}
class Baz extends Bar implements Foo
{
    @Override
    public int foo(int i)
    {
       //return Foo.super.foo(i) * i;
       return super.foo(i) * i;
    }
 }
public class Main {
    public static void main(String[] args) {
        Baz bz = new Baz();
        System.out.println(bz.foo(1));
        
    }
}
