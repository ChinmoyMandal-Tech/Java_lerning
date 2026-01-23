class Demo {
    int x;
    int y;

    Demo() {
    }
    
    Demo(int a) {
        x = a;
    }
    
    Demo(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    void display() {
        System.out.println("x: " + x);
        System.out.println("y: " + y);

    }
}

class Construct {
    public static void main(String[] arg) {
        Demo d1 = new Demo(2,6);
        d1.display();
    }
}
