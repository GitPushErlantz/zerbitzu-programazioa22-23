public class Kalkulatu extends Thread {
    private int zenbakia;
    private int faktoriala;

    public Kalkulatu(int zenbakia) {
        this.zenbakia = zenbakia;
    }

    @Override
    public void run() {
        faktoriala = faktorialaKalkulatu(zenbakia);
        System.out.println(zenbakia + "! = " + faktoriala);
    }

    private int faktorialaKalkulatu(int zenbakia) {
        int faktoriala = 1;
        for (int i = 1; i <= zenbakia; i++) {
            faktoriala *= i;
        }
        return faktoriala;
    }
}
