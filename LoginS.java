import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.event.*;

// class LoginS {
//     public static void main(String[] args) {
//         JFrame j1 = new JFrame("Welcome to my app");
//         j1.setVisible(true);
//         j1.setSize(400, 400);
//         j1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//     }
// }

// class LoginS extends JFrame {
//     LoginS() {}

//     LoginS(String s) {
//         super(s);
//     }
    
//     void setComponent(){
//         JLabel j1 = new JLabel("Hello");
//         JTextField t1 = new JTextField("Abc");

//         setLayout(null);
//         j1.setBounds(100, 100, 100, 30);
//         t1.setBounds(100, 400, 100, 30);
//         add(j1);
//         add(t1);
//     }

//     public static void main(String[] args) {
//         LoginS l1 = new LoginS("Welcome");
//         l1.setVisible(true);
//         l1.setSize(600, 600);
//         l1.setComponent();
//         l1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//     }
// }


class LoginS extends JFrame {
    LoginS() {
    }

    LoginS(String s) {
        super(s);
    }

    JLabel l1, l2, l3, l4, l5;
    JTextField t1;
    JPasswordField t2;
    JButton b1, b2, b3;

    void setComponent() {
        l1 = new JLabel("Welcome to our app");
        l2 = new JLabel("Login Page");
        l3 = new JLabel("UserName");
        l4 = new JLabel("Password");
        l5 = new JLabel();
        t1 = new JTextField();
        t2 = new JPasswordField();
        b1 = new JButton("Login");
        b2 = new JButton("Clear");
        b3 = new JButton("Add");

        setLayout(null);

        l1.setBounds(250, 50, 200, 30);
        l2.setBounds(250, 150, 200, 30);
        l3.setBounds(100, 250, 100, 30);
        l4.setBounds(100, 350, 100, 30);
        l5.setBounds(200, 550, 200, 30);
        t1.setBounds(300, 250, 100, 30);
        t2.setBounds(300, 350, 100, 30);
        b1.setBounds(100, 450, 100, 30);
        b2.setBounds(300, 450, 100, 30);
        b3.setBounds(450, 450, 100, 30);
        b1.addActionListener(new Login());
        b2.addActionListener(new Clear());
        b3.addActionListener(new Add());

        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(l5);
        add(t1);
        add(t2);
        add(b1);
        add(b2);
        add(b3);

    }

    public static void main(String[] args) {
        LoginS l1 = new LoginS("Java App - Chinmoy");
        l1.setSize(700, 700);
        l1.setComponent();
        l1.setVisible(true);
        l1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    class Clear implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            t1.setText("");
            t2.setText("");
            l5.setText("");
        }
    }
    
    class Login implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (t1.getText().equals("admin") && ( new String(t2.getPassword())).equals("321")) {
                l5.setText("Login successfull");
            } else {
                l5.setText("login fail");
            }
        }
    }

    class Add implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(new String(t2.getPassword()));
                System.out.println(b);
                int c = a + b;
                l5.setText("addition is : "+c);
            } catch (Exception e1) {
                l5.setText("Enter number only");
            }
        }
    }
    
}



