package main;

import java.io.*;

public class UnSaludo {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        String comando = "";
        Process p = null;
        if (args.length < 1) {
            System.out.println("SE NECESITA UN SALUDO...");
            System.exit(1);
        }
        try {
            FileOutputStream fos = new FileOutputStream(args[0]);
            PrintWriter pw = new PrintWriter(fos);
            p = r.exec(comando);
            InputStream is = p.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(args[0] + ">" + linea + "-an sartzen dut");
            }
        } catch(Exception e) {
            System.out.println();
        }
    }
}