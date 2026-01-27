// class Ac {}

public class ExceptionH2 {
    public static void main(String[] args) throws ClassNotFoundException {
        try {
            Class.forName("Ac");
            System.out.println("Class found");
        } catch (Exception e) {
            System.out.println("Ac class not found");
        }

        try {
            Class.forName("Ac");
            System.out.println("Class found");
        } finally {
            System.out.println("Ac class not found");
        }
    }
}
