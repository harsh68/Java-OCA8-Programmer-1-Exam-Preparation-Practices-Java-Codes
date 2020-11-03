public class JavaVal1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(100);
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        
        sb.append(new char[]{'1',2,'3'});
        System.out.println(sb);
        
    }
}
