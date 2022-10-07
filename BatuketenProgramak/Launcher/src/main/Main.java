package main;

public class Main {
    public static void main(String[] args) {
        if(args.length != 2) {
            System.out.println("Bad syntax, please insert two numbers.");
            System.exit(1);
        }
        Runtime r = Runtime.getRuntime();
        String comando = "dir";
        Process p = null;
        try {
            p = r.exec(comando);
        } catch(Exception e) {
            System.out.println("error");
        }
    }
}
