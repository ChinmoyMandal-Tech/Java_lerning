interface Bank {
    int x = 5; // public static final

    void roi(); // public abstract

    static void hello() {
        System.out.println("Bank x: " + x);
    }
    
    static void staticHello() {
        System.out.println("static methods");
    }
    
    default void defaultHello() {
        System.out.println("default methods");
    }
}

interface Saving extends Bank {
    // int x=3;   // static veriables are inherited
    static void hello() {
        System.out.println("saving x: " + x);
    }
    void roi();
}

class Account implements Saving {
    public void roi() {
        System.out.println("rate of interest");
    }
}

public class Interface {
    public static void main(String[] args) {
        
        System.out.println(Bank.x);
        Bank.hello();
        Saving.hello();
        // Saving.staticHello();   // static methods are not inherited
        Account a1 = new Account();
        a1.roi();

        Bank b = new Account();
        b.roi();
    }
}
