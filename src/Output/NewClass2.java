/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Output;

/**
 *
 * @author Harsh
 */
class A
{
  public A()
  {
    this( false );
  }

  public A(boolean someFlag)
  {
  }
}

class B extends A
{
  public B()
  {
    super();
  }

  public B( boolean someFlag )
  {
    super( someFlag );
  }

  public B ( int someNumber )
  {
    this(); //
  }
}
public class NewClass2 {
    
}
