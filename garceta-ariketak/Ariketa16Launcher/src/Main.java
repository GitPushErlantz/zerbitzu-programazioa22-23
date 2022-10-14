import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Runtime r = Runtime.getRuntime(); //TODO: runtime erabili
        System.out.println(System.getProperty("user.dir"));
        int no1;
        try {
            no1 = Integer.parseInt(String.valueOf(br.read()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String command = "cmd /c java -jar ../Ariketa16/out/artifacts/garceta_ariketak_jar/garceta-ariketak.jar " + no1 + " " + no1; //TODO: Ruta konpondu
        try {
            r.exec(command);
        } catch (Exception e) {
            System.out.println("error");
        }
    }
}