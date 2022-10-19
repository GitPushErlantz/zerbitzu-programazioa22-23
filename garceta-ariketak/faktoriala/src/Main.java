import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] zenbakiak = new int[6];
        System.out.print("Sartu 6 zenbaki: ");
        try (Scanner in = new Scanner(System.in)) { //Scannerra ireki
            String strZbk = in.nextLine();
            String[] arrZbk = strZbk.split(" "); //Jasotakoaren zatiak String gisa gorde
            if (arrZbk.length != 6) { //Baieztatu 6 zenbaki sartu direla
                System.out.println("Sartu beharreko zenbaki kopurua ez da zuzena.");
            } else {
                for (int i = 0; i < arrZbk.length; i++) {
                    zenbakiak[i] = Integer.parseInt(arrZbk[i]); //String gisa gorde diren zenbakiak int gisa gorde
                    new Kalkulatu(zenbakiak[i]).start(); //Kalkulatu klaseko thread-ak hasi
                }
            }
        }catch (NumberFormatException nfe) {
            System.out.println("Sartu zenbakiak, ez testuak.");
        }
        catch (Exception e) {
            System.out.println("Errorea: " + e.getMessage());
        }

    }
}
