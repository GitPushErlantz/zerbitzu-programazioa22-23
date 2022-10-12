public class Main {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime(); //TODO: runtime erabili
        System.out.println(System.getProperty("user.dir"));
        String command = "java -jar ../Ariketa16/out/artifacts/garceta_ariketak_jar/garceta-ariketak.jar 2 4"; //TODO: Ruta konpondu
        try {
            ProcessBuilder pb = new ProcessBuilder(command);
            Process p = pb.start(); //TODO: process erabili
            //p = r.exec(command);
        } catch (Exception e) {
            System.out.println("error");
        }
    }
}