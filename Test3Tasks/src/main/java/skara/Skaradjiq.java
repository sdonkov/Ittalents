package skara;

import java.util.Random;

public class Skaradjiq implements Runnable{
    public static Barbeque barbeque;

    @Override
    public void run() {
        while(true){
            try {
                barbeque.addMeat();
            } catch (InterruptedException e) {
                System.out.println("lalala");
            }
        }
    }
}
