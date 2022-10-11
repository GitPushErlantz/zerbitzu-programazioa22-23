public class Main {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        String command = "java -jar .../Ariketa16/out/artifacts/garceta_ariketak_jar/garceta-ariketak.jar"; //TODO: Ruta konpondu
        Process p = null; //TODO: process erabili
        try {
            p = r.exec(command);
        } catch(Exception e) {
            System.out.println("error");
        }
    }
}