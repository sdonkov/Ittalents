package liutenica;

import liutenica.vegetables.Vegetable;

import java.sql.SQLException;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;

public class Baraka {
    private CopyOnWriteArrayList<String> koshnicaZaDomati = new CopyOnWriteArrayList<>();
    private CopyOnWriteArrayList<String> koshnicaZaChushki = new CopyOnWriteArrayList<>();
    private CopyOnWriteArrayList<String> koshnicaZaPatladjani = new CopyOnWriteArrayList<>();
    private int capacity = 40;
    private CopyOnWriteArrayList<String> concreteVeg;
    private int currentNumOfVeggies;
    private String vzimanZelenchuk;
    private Pisar pisar;

    public static void momaReport(String name, String currentVeg, int veggiesNumber, int age) {
        try {
            Pisar.addMomaReportTODB(name,currentVeg,veggiesNumber,age);
        } catch (SQLException e) {
            System.out.println("error " + e.getMessage());
        }
    }

    public static void addToOtchet(String name, int processingTime) {
        Pisar.makeOtcherForMomci(name,processingTime);
    }

    synchronized void sipi (String currentVeggie, int value){
    if(currentVeggie.equals("Tomato")){
        concreteVeg = koshnicaZaDomati;
    }else{
        if(currentVeggie.equals("Pepper")){
            concreteVeg = koshnicaZaChushki;
        }else {
            if(currentVeggie.equals("Eggplant")){
                concreteVeg = koshnicaZaPatladjani;
            }
        }
    }
    // дали може да сложи част от зеленчуците ако има място или трябва да има място за всичките си зеленчуци
        // то така или иначе ще чака
        while(concreteVeg.size() + value >= capacity){
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("greshka");
            }
        }
        for (int i = 0; i < value; i++) {
            concreteVeg.add(currentVeggie);
            notifyAll();
        }
        System.out.println("Ima " +currentVeggie +  " " + concreteVeg.size());

    }

    synchronized String zemi(){
        vzimanZelenchuk = Vegetable.VEG[new Random().nextInt(Vegetable.VEG.length)];
        if(vzimanZelenchuk.equals("Tomato")){
            while(koshnicaZaDomati.size()<=0){
                try {
                    wait();
                } catch (InterruptedException e) {
                    System.out.println("Opa");
                }
            }
            koshnicaZaDomati.remove(0);
        }else{
            if(vzimanZelenchuk.equals("Pepper")){
                while(koshnicaZaChushki.size()<=0){
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        System.out.println("Opa");
                    }
                }
                koshnicaZaChushki.remove(0);
            }else {
                if(vzimanZelenchuk.equals("Eggplant")){
                    while(koshnicaZaPatladjani.size()<=0){
                        try {
                            wait();
                        } catch (InterruptedException e) {
                            System.out.println("Opa");
                        }
                    }
                    koshnicaZaPatladjani.remove(0);
                }
            }
        }
        notifyAll();
        return vzimanZelenchuk;
    }


}
