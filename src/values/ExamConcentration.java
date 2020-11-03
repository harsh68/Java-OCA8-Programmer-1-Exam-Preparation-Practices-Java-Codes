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
public class ExamConcentration {

    /**
     * @param args the command line arguments
     */
    public ExamConcentration(){
        System.out.println("NoArg");
    }
    public ExamConcentration(int arg)
    {
        System.out.println("Arg");
    }
    private boolean ha() //here its privates
    {
        return false;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        ExamConcentration ex = new Best(5);
        System.out.println(","+ex.ha());
    }
    
}

class Best extends ExamConcentration
{
    public Best(int age){
        System.out.println("Best");
    }
    public boolean ha()
    {
        return true;
    }
}
