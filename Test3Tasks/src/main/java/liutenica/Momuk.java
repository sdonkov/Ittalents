package liutenica;

import java.io.*;
import java.util.ArrayList;

public class Momuk extends Brigadnik implements Runnable{
    public static Baraka baraka;
    private String currentVeg;
    private int processingTime;
    public static Kitchen kitchen;
    private int spendTime;

    Momuk(String name, int age) {
        super(name, age);
    }


    @Override
    void doBrigadaTask() {
        // вземи 1 зеленчук и го обработи
        currentVeg = baraka.zemi();
        if (currentVeg.equals("Tomato")) {
            processingTime = 3000;
            spendTime += processingTime;
        } else {
            if (currentVeg.equals("Eggplant")) {
                processingTime = 9000;
                spendTime += processingTime;
            } else {
                if (currentVeg.equals("Pepper")) {
                    processingTime = 6000;
                    spendTime += processingTime;
                }
            }
        }
        try {
            Thread.sleep(processingTime);
            System.out.println("Momuka obraboti " + currentVeg);
            Baraka.addToOtchet(this.getName(), processingTime);
        } catch (InterruptedException e) {
            System.out.println("Opa");
        }
        // сложи го в кухнята
        kitchen.sipi(currentVeg);
    }


    @Override
    public void run() {
        while(true){
            doBrigadaTask();
        }
    }
}
