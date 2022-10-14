package urko;

public class TicTac {
    public static void main(String[] args) {
        HariaTicTac hTic = new HariaTicTac(1);
        HariaTicTac hTac = new HariaTicTac(0);

        hTic.start();
        hTac.start();
        try {
            hTic.join();
            hTac.join();
        } catch (InterruptedException e) {
            throw new UnsupportedOperationException("Not supported yet.");
        }
    }
}
