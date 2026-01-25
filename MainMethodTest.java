class Hello {
    static void main(String[] args) {
        System.out.println("main from Hello class");
    }
}

public class MainMethodTest {
    public static void main(String[] args) {
        System.out.println("Hello main 1");

        Hello.main(args);
        main("Chinmoy");
    }

    static void main(String s) {
        System.out.println("main 2: " + s);
    }
}
