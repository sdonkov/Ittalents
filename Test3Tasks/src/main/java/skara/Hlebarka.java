package skara;

public class Hlebarka implements Runnable {
    public static Barbeque barbeque;

    @Override
    public void run() {
        while (true){
            barbeque.addBread();
        }
    }
}
