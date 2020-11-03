public class ExamExp {
    public static void main(String[] args) {
        int i1 = Integer.parseInt(args[0]);
		 System.out.println(i1);
        boolean b1 = Boolean.parseBoolean(args[0]);
        System.out.println(b1);
        int i2 = Integer.valueOf(args[0]);
		System.out.println(i2);
        boolean b2 = Boolean.valueOf(args[0]);
        System.out.println(b2);
    }
}