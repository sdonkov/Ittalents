package liutenica;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class Baba extends Brigadnik implements Runnable{
    public static Kitchen kitchen;
    private ArrayList<Partida> listSLutenici = new ArrayList<>();

    Baba(String name, int age) {
        super(name, age);
    }

    @Override
    void doBrigadaTask() {
        // взима по 5 продукта
        kitchen.zemiProdukit();
//        kitchen.zemiChushki();
//        kitchen.zemiDomati();
//        kitchen.zemiPatladjani();
        // направи лютеница
        try {
            Thread.sleep(10000);
            System.out.println("Napravihme lutenicata ------------------------------------------");
        } catch (InterruptedException e) {
            System.out.println("opaaa");
        }
        Partida partida = new Partida(new Random().nextInt(3,13), LocalDate.now(),this.getName());
        kitchen.partidaIsReady(partida);
        listSLutenici.add(partida);
    }

    @Override
    public void run() {
        while(true){
            doBrigadaTask();
        }
    }
}
