package liutenica;

import liutenica.vegetables.Vegetable;

import java.util.Random;

public class Moma extends Brigadnik implements Runnable{


    private String currentVegie;
    private int veggiesNumber;
    public static Baraka baraka;
    private int veggiesNabrani;

    Moma(String name) {
        super(name, getRandomAge());
    }



    private static int getRandomAge() {
        return new Random().nextInt(14,20);
    }

    @Override
    void doBrigadaTask() {
        //бере
        try {
            Thread.sleep(5000);
            currentVegie = getRandomVeggie();
            veggiesNumber = getRandomNumberOfVeggies();
            baraka.sipi(currentVegie,veggiesNumber);
            System.out.println("Momata sipa " + currentVegie + " " + veggiesNumber + " broq");
            Baraka.momaReport(this.getName(), currentVegie, veggiesNumber,getAge());
            veggiesNabrani += veggiesNumber;
        } catch (InterruptedException e) {
            System.out.println("opa");
        }
    }

    private int getRandomNumberOfVeggies() {
        return new Random().nextInt(3,7);
    }

    private String getRandomVeggie() {
        return Vegetable.VEG[new Random().nextInt(Vegetable.VEG.length)];
    }

    @Override
    public void run() {
        while(true){
            doBrigadaTask();
        }
    }
}
