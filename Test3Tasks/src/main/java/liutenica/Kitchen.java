package liutenica;

import liutenica.vegetables.Pepper;

import java.util.concurrent.CopyOnWriteArrayList;

public class Kitchen {

    private CopyOnWriteArrayList<String> tavaZaDomati = new CopyOnWriteArrayList<>();
    private CopyOnWriteArrayList<String> tavaZaChushki = new CopyOnWriteArrayList<>();
    private CopyOnWriteArrayList<String> tavaZaPatladjani = new CopyOnWriteArrayList();
    private int capacity = 30;
    private Pisar pisar;


    synchronized void sipi(String currentVeg) {
        switch (currentVeg) {
            case "Tomato" -> {
                if (tavaZaDomati.size() >= capacity) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        System.out.println("opa");
                    }
                } else {
                    tavaZaDomati.add(currentVeg);
                    System.out.println("V tavata za domati ima " + tavaZaDomati.size());
                    notifyAll();
                }
            }
            case "Eggplant" -> {
                if (tavaZaPatladjani.size() >= capacity) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        System.out.println("opaa");
                    }
                } else {
                    tavaZaPatladjani.add(currentVeg);
                    System.out.println("V tavata za patladjani ima " + tavaZaPatladjani.size());
                    notifyAll();
                }
            }
            case "Pepper" -> {
                if (tavaZaChushki.size() >= 30) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        System.out.println("opa");
                    }
                } else {
                    tavaZaChushki.add(currentVeg);
                    System.out.println("V tavata za chushki ima " + tavaZaChushki.size());
                    notifyAll();
                }
            }
        }
    }

    synchronized void zemiProdukit(){
        // ЗАБРАВИХ СТАРТА НА БАБАТА....
        while (tavaZaChushki.size()<5){
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Greshka");
            }
        }
        for (int i = 0; i < 5; i++) {
            tavaZaChushki.remove(0);
            System.out.println("Babata vze chushka");
        }
        while (tavaZaPatladjani.size()<5){
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Greshka");
            }
        }
        for (int i = 0; i < 5; i++) {
            tavaZaPatladjani.remove(0);
            System.out.println("Babata vze patladjan");
        }
        while (tavaZaDomati.size()<5){
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Greshka");
            }
        }
        for (int i = 0; i < 5; i++) {
            tavaZaDomati.remove(0);
            System.out.println("Babata vze domat");
        }
        notifyAll();
    }

    public void partidaIsReady(Partida partida){
        Pisar.addToDB(partida);
    }
//    synchronized void zemiChushki(){
//        // ЗАБРАВИХ СТАРТА НА БАБАТА....
//        while (tavaZaChushki.size()<5){
//            try {
//                wait();
//            } catch (InterruptedException e) {
//                System.out.println("Greshka");
//            }
//        }
//
//    }
//    synchronized void zemiPatladjani(){
//       // ЗАБРАВИХ СТАРТА НА БАБАТА....
//        while (tavaZaPatladjani.size()<5){
//            try {
//                wait();
//            } catch (InterruptedException e) {
//                System.out.println("Greshka");
//            }
//        }
//        for (int i = 0; i < 5; i++) {
//            tavaZaPatladjani.remove(0);
//            System.out.println("Babata vze patladjan");
//        }
//        notifyAll();
//    }
//    synchronized void zemiDomati(){
//        // ЗАБРАВИХ СТАРТА НА БАБАТА....
//        while (tavaZaDomati.size()<5){
//            try {
//                wait();
//            } catch (InterruptedException e) {
//                System.out.println("Greshka");
//            }
//        }
//        for (int i = 0; i < 5; i++) {
//            tavaZaDomati.remove(0);
//            System.out.println("Babata vze domat");
//        }
//        notifyAll();
//    }
}
