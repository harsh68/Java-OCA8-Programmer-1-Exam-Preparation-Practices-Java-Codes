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
public class DogName implements Cloneable {

   private String dname;

	
   public String getDname() {
      return dname;
   }

   public void setDname(String dname) {
      this.dname = dname;
   }

   // Overriding clone() method of Object class
   @Override
   public Object clone() throws CloneNotSupportedException
   {  
      return (DogName)super.clone();  
   }
	
   public static void main(String[] args) {
      DogName obj1 = new DogName();
      try {
	obj1.setDname("Dog1");
	//Cloning obj1 into obj2
	DogName obj2 = (DogName) obj1.clone();
			
	//Displaying both the objects content
	System.out.println(obj1.getDname());
	System.out.println(obj2.getDname());
			
	//Setting up name in obj2
	obj1.setDname("Dog2");
			
	//Displaying both the objects content
	System.out.println(obj1.getDname());
	System.out.println(obj2.getDname());
      } catch (CloneNotSupportedException e) {
	   e.printStackTrace();
	}
   }
}
