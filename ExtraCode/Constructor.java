class India
{
    int a;
    India(int a){this.a = a;}
}
class Gujarat extends India
{
    Gujarat()
    {
        super(getA());   
    }
    static int getA(){return 5;}
}
public class Constructor {

    public static void main(String[] args) {
       Gujarat gj = new Gujarat();
       System.out.println(gj.a);
    }
}
