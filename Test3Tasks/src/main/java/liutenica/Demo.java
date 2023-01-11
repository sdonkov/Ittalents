package liutenica;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Random;

public class Demo {

    public static void main(String[] args) {
        Kitchen kitchen = new Kitchen();
        Baraka baraka = new Baraka();
        Moma.baraka = baraka;
        Momuk.baraka = baraka;
        Momuk.kitchen = kitchen;
        Baba.kitchen = kitchen;
        Thread pisar = new Pisar();
        pisar.setDaemon(true);
        pisar.start();
        for (int i = 0; i < 15; i++) {
            new Thread(new Moma("Penelopi"+i)).start();
            new Thread(new Momuk("Antonio"+i,40+i)).start();
            new Thread(new Baba("Cola"+i,85+i)).start();

        }

    }
}
