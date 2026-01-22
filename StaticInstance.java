class Box {
    int x = 5; //instance
    static int y = 10;

    void update() {
        y = 15;
    }
}

class Box2 {
    int a;
    private static int b;

    void update() {
        a = 11;
        b = 22;
    }

    void display() {
        System.out.println(a);
        System.out.println(b);
    }

    void update2() {
        b = 33;
    }
}

class StaticInstance {
    public static void main(String[] args) {

        // System.out.println(Box.x);   non-static variable x cannot be referenced from a static context
        System.out.println(Box.y);   // static variable can access directly, without creating object

        Box x1 = new Box();     // Object creation
        System.out.println(x1.x);
        System.out.println(x1.y);


        Box y1 = new Box();
        Box y2 = new Box();
        System.out.println(y1.y); // 10 befor update
        System.out.println(y2.y); // 10 befor update
        y1.update();
        System.out.println(y1.y); // 15 after update
        System.out.println(y2.y); // 15  this is also updated becouse "y" is a static variable so it create befor object creation and shered same memory


        System.out.println(" ");
        Box2 b1 = new Box2();
        Box2 b2 = new Box2();
        b1.display();  // a:0  b:0
        b1.update();   
        b2.update2();
        b1.display();  // a:11  b:33

    }
}