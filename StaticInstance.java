class Box {
    int x = 5;
    static int y = 10;

    void update(){
        y = 15;
    }
}

class StaticInstance {
    public static void main(String[] args) {

        // System.out.println(Box.x);   non-static variable x cannot be referenced from a static context
        System.out.println(Box.y);   // static instance can access directly, without creating object

        Box x1 = new Box();     // Object creation
        System.out.println(x1.x);
        System.out.println(x1.y);


        Box y1 = new Box();
        Box y2 = new Box();
        System.out.println(y1.y); // 10 befor update
        System.out.println(y2.y); // 10 befor update
        y1.update();
        System.out.println(y1.y); // 15 after update
        System.out.println(y2.y); // 15  this is also updated becouse "y" is a static instance so it create befor object creation and shered same memory

        
    }
}