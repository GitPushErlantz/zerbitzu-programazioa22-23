public class Main {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        System.out.println(System.getProperty("user.dir"));
        String command = "java -jar .../Ariketa16/out/artifacts/garceta_ariketak_jar/garceta-ariketak.jar"; //TODO: Ruta konpondu

        try {
            Process p = new ProcessBuilder(command, "2").start(); //TODO: process erabili
            p = r.exec(command);

        } catch(Exception e) {
            System.out.println("error");
        }
    }
}