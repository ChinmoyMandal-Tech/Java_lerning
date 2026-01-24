class Example {
    int x, y;

    void f1(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Example1 extends Example {

    int x, y;

    void f2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void display() {
        System.out.println("child x :" + x);
        System.out.println("child y :" + y);
        System.out.println("parent x :" + super.x);
        System.out.println("parent y :" + super.y);

    }

}

class A1 {
    A1(int x) {
        System.out.println("parent constracter executed " + x);
    }
}

class A2 extends A1 {
    A2() {
        super(5);
        System.out.println("child constracter executed");

    }
}

public class Inherit {
    public static void main(String[] args) {
        Example1 e1 = new Example1();
        e1.f1(1, 2);
        e1.f2(2, 5);
        e1.display();

        A1 a = new A1(1);
        A2 b = new A2();
    }
}
