
public class Test { 
      
    // Normal main() 
    public static void main(String[] args) { 
        System.out.println("Normal main"); 
        Test.main("Harsh_"); 
    } 
    // Overloaded main methods 
   public static void main(String arg1) { 
        System.out.println("Overloaded method has 1 arg. " + arg1); 
        Test.main("P","Patel"); 
    } 
	 
    public static void main(String arg1, String arg2) { 
        System.out.println("Overloaded method has 2 arg. " + arg1 + "_" + arg2); 
    } 
} 