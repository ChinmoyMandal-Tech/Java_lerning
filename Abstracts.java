abstract class Demo {
    Demo() {
        System.out.println("constractor of parent");
    }

    int a;

    abstract void f1();
}

class Demo2 extends Demo {
    Demo2() {
        System.out.println("constractor of child");
    }

    void f1() {
        System.out.println("Hello form demo2");
    }
}

public class Abstracts {
    public static void main(String[] args) {
        Demo d = new Demo2();
        d.f1();
    }
}
