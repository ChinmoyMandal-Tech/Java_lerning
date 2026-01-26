import java.util.Scanner;

class Account {
    int balence;
    
    Account(int amo) {
        balence = amo;
    }

    boolean isSufficient(int amo) {
        if (amo > balence)
            return false;
        else
            return true;
    }

    void withdrawl(int amo, String name) {
        balence = balence - amo;
        System.out.println(name + " successfully Withdrawl amount " + amo);
        System.out.println("Remaning balance " + balence);
    }
}

class Customer implements Runnable {
    String c_name;
    Account a;

    Customer(String name, Account a) {
        c_name = name;
        this.a = a;
    }

    public void run() {
        Scanner sc = new Scanner(System.in);

        synchronized (a) {
            System.out.println(c_name + " Enter ammoun you want withdral ");
            int amo = sc.nextInt();
            if (a.isSufficient(amo)) {
                a.withdrawl(amo, c_name);
            } else {
                System.out.println("NOt sufficent amount");
            }
        }
    }
}

public class MultiT2 {
    public static void main(String[] args) {
        Account a = new Account(1000);
        Customer c1 = new Customer("Rohit", a);
        Customer c2 = new Customer("Chinmoy", a);
        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        t1.start();
        t2.start();
    }

}
