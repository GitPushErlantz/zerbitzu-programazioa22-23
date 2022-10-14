package ni;

public class Main extends Thread {
    public static void main(String[] args) {
        hiloTic.start();
        hiloTac.start();
    }

    public static Thread hiloTic = new Thread() {
        @Override
        public void run() {
            while (true) {
                System.out.println("Tic");
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    };
    public static Thread hiloTac = new Thread() {
        @Override
        public void run() {
            while (true) {
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Tac");
            }
        }
    };
}
