package urko;


public class HariaTicTac extends Thread {
    String mezua;

    public HariaTicTac(int i) {
        if (i == 1) {
            mezua = "Tic";
        } else {
            mezua = "Tac";
        }
        setName(mezua);
    }

    public void run() {
        while (true) {
            System.out.println(mezua);
            try {
                sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
