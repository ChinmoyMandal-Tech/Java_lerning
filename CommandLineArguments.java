public class CommandLineArguments {
    public static void main(String[] args) {
        int i;
        for (i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}

// javac CommandLineArguments.java

// java CommandLineArguments Hello how are you 1 2 3

// output --->>>

// Hello 
// how
// are 
// you
//  1 
//  2 
//  3