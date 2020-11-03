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
public class Encap {
 private int size;
 private String name;
 private String color;
    public void setSize(int s)
    {
      size = s;
    }
    
    public int getSize()
    {
      return size;
    }
    
    public void setName(String Name)
    {
      name = Name;
    }
    
    public String getName()
    {
      return name;
    }
    
    public void setColor(String s)
    {
        color = s;
    }
    public Encap getColor()
    {
        return this;
    }
}
