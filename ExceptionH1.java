public class ExceptionH1 {
    public static void main(String[] args) {
        int a = 10;
        try {
            if (a > 5) {
                throw new ArithmeticException("must be less then 5");
            }
            System.out.println("a is : "+a);
        } catch (ArithmeticException a1) {
            System.out.println(a1.getMessage());
        } finally {
            System.out.println("Program finished");
        }


        int[] b = new int[5];
        try {
            if (a > 5) {
                throw new ArrayIndexOutOfBoundsException();
            }
            b[5] = 5;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("index must be less then length");
        }

        // String s = "jk";
        // System.out.println(s.length());

        // int arr[] = { 4, 6, 9, 2 };
        // System.out.println(arr.length);
    }
}
