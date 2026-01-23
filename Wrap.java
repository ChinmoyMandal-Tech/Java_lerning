public class Wrap {
    public static void main(String[] args) {
        int x = Integer.parseInt("1100");
        System.out.println(x);

        int x1 = Integer.parseInt("1100", 2);
        System.out.println(x1);

        double x2 = Double.parseDouble("12.3");
        System.out.println(x2);

        Integer l1 = Integer.valueOf(25);   // l1 is a object
        int y = l1.intValue();
        System.out.println(y);
        System.out.println(y);
    }
}
