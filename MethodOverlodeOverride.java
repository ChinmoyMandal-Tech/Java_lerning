class Demo {
    void fun1() {
        System.out.println("no veriable");
    }

    void fun1(int a) {
        System.out.println("A is: " + a);           /// method overload
    }
}

class Demo2 extends Demo {

    @Override
    void fun1() {
        System.out.println("no verable in child");  /// method override
    }
}



// polymorphism -> same methods deffernt uses based on object calling
class MethodOverlodeOverride {
    public static void main(String[] args) {
        Demo2 d = new Demo2();
        d.fun1();
    }
}