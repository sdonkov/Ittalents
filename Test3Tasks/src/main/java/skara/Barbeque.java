package skara;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Barbeque {

    private ArrayList<String> meatBallPot = new ArrayList<>();
    private ArrayList<String> pleskavicaPot = new ArrayList<>();
    private ArrayList<String> steakPot = new ArrayList<>();
    private ArrayList<String> whiteBread = new ArrayList<>();
    private ArrayList<String> wholeGrainBread = new ArrayList<>();
    private HashMap<String, Double> ruskaSalata = new HashMap<>();
    private HashMap<String, Double> liutenica = new HashMap<>();
    private HashMap<String, Double> snejanka = new HashMap<>();
    private HashMap<String, Double> cabbageAndCarrots = new HashMap<>();
    private HashMap<String, Double> tomatoesAndCukes = new HashMap<>();
    public static Seller seller;
    private static final Object lock1 = new Object();
    private static final Object lock2 = new Object();
    private static final Object lock3 = new Object();


    Barbeque() {
        ruskaSalata.put("ruskaSalata", 0.0);
        liutenica.put("liutenica", 0.0);
        snejanka.put("snejanka", 0.0);
        cabbageAndCarrots.put("cabbageAndCarrots", 0.0);
        tomatoesAndCukes.put("tomatoesAndCukes", 0.0);
    }

    public void addSalad() throws InterruptedException {
        int rand = new Random().nextInt(100);
        synchronized (lock1) {
            if (rand < 20) {
                if (ruskaSalata.get("ruskaSalata") > 1) {
                    lock1.wait();
                } else {
                    Thread.sleep(10000);
                    ruskaSalata.put("ruskaSalata", ruskaSalata.get("ruskaSalata") + 0.5);
                    System.out.println("RUSKA SALATA WAS MADE " + ruskaSalata.values() + " IN TOTAL");
                }
            } else if (rand < 40) {
                if (liutenica.get("liutenica") > 1) {
                    lock1.wait();
                } else {
                    Thread.sleep(8000);
                    liutenica.put("liutenica", liutenica.get("liutenica") + 0.5);
                    System.out.println("LIUTENICA WAS MADE " + liutenica.values() + " IN TOTAL");
                }
            } else if (rand < 60) {
                if (snejanka.get("snejanka") > 1) {
                    lock1.wait();
                } else {
                    Thread.sleep(4000);
                    snejanka.put("snejanka", snejanka.get("snejanka") + 0.5);
                    System.out.println("SNEJANKA WAS MADE " + snejanka.values() + " IN TOTAL");
                }
            } else if (rand < 80) {
                if (cabbageAndCarrots.get("cabbageAndCarrots") > 1) {
                    lock1.wait();
                } else {
                    Thread.sleep(2000);
                    cabbageAndCarrots.put("cabbageAndCarrots", cabbageAndCarrots.get("cabbageAndCarrots") + 0.5);
                    System.out.println("cabbageAndCarrots  WAS MADE " + cabbageAndCarrots.values() + " IN TOTAL");
                }
            } else {
                if (tomatoesAndCukes.get("tomatoesAndCukes") > 1) {
                    lock1.wait();
                } else {
                    Thread.sleep(3000);
                    tomatoesAndCukes.put("tomatoesAndCukes", tomatoesAndCukes.get("tomatoesAndCukes") + 0.5);
                    System.out.println("tomatoesAndCukes WAS MADE " + tomatoesAndCukes.values() + " IN TOTAL");
                }
            }
        }
    }


    public void addMeat() throws InterruptedException {
        synchronized (lock2) {
            int rand = new Random().nextInt(100);
            if (rand < 33) {
                if (meatBallPot.size() < 3) {
                    Thread.sleep(2000);
                    meatBallPot.add("Meatball");
                    System.out.println("MEATBALL WAS MADE " + meatBallPot.size() + " IN TOTAL");
                } else {
                    try {
                        lock2.wait();
                    } catch (InterruptedException e) {
                        System.out.println("lalala");
                    }
                }
            } else if (rand < 66) {
                if (pleskavicaPot.size() < 3) {
                    Thread.sleep(3000);
                    pleskavicaPot.add("Pleskavica");
                    System.out.println("PLESKAVICA WAS MADE " + pleskavicaPot.size() + " IN TOTAL");
                } else {
                    try {
                        lock2.wait();
                    } catch (InterruptedException e) {
                        System.out.println("asl pls");
                    }
                }

            } else {
                if (steakPot.size() < 3) {
                    Thread.sleep(4000);
                    steakPot.add("Steak");
                    System.out.println("STEAK WAS MADE " + steakPot.size() + " IN TOTAL");
                } else {
                    try {
                        lock2.wait();
                    } catch (InterruptedException e) {
                        System.out.println("okokok");
                    }
                }
            }
        }
    }

    public void addBread() {
        synchronized (lock3) {
            int rand = new Random().nextInt(100);
            if (rand < 50) {
                if (whiteBread.size() < 3) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        System.out.println("alalla");
                    }
                    whiteBread.add("WhiteBread");
                    System.out.println("WHITE BREAD WAS MADE " + whiteBread.size() + " IN TOTAL");
                } else {
                    try {
                        if(wholeGrainBread.size()<3){
                            try {
                                Thread.sleep(5000);
                            } catch (InterruptedException e) {
                                System.out.println("lalalal");
                            }
                            wholeGrainBread.add("WholeGrainBread");
                            System.out.println("WHOLE GRAIN BREAD WAS MADE " + wholeGrainBread.size() + " IN TOTAL");
                        }
                        lock3.wait();
                    } catch (InterruptedException e) {
                        System.out.println("ONE NENEN");
                    }
                }
            } else {
                if (wholeGrainBread.size() < 3) {
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        System.out.println("lalalal");
                    }
                    wholeGrainBread.add("WholeGrainBread");
                    System.out.println("WHOLE GRAIN BREAD WAS MADE " + wholeGrainBread.size() + " IN TOTAL");
                } else {
                    try {
                        if(whiteBread.size()<3){
                            try {
                                Thread.sleep(2000);
                            } catch (InterruptedException e) {
                                System.out.println("alalla");
                            }
                            whiteBread.add("WhiteBread");
                            System.out.println("WHITE BREAD WAS MADE " + whiteBread.size() + " IN TOTAL");
                        }
                        lock3.wait();
                    } catch (InterruptedException e) {
                        System.out.println("Oenenenenenn");
                    }
                }
            }
        }
    }

    public void getRandomBread(String bread) {
        synchronized (lock3) {
            if(bread.equals("WholeGrainBread")){
                while (wholeGrainBread.size()<=0){
                    try {
                        lock3.wait();
                    } catch (InterruptedException e) {
                        System.out.println("lala");
                    }
                }
                wholeGrainBread.remove(wholeGrainBread.size()-1);
                System.out.println("VZE SE PULNOZURNESTO HLEBCHE I OSTANAXA " + wholeGrainBread.size());
                lock3.notifyAll();
            }else{
                while(whiteBread.size()<=0){
                    try {
                        lock3.wait();
                    } catch (InterruptedException e) {
                        System.out.println("lalala");
                    }
                }
                whiteBread.remove(whiteBread.size()-1);
                System.out.println("VZE SE BQLO HLEBCHE I OSTANAXA " + whiteBread.size());
                lock3.notifyAll();
            }
        }
    }
    public void getRandomMeat(String meat){
        synchronized (lock2){
            if(meat.equals("Pleskavica")){
                while (pleskavicaPot.size()<=0){
                    try {
                        lock2.wait();
                    } catch (InterruptedException e) {
                        System.out.println("lalala");
                    }
                }
                pleskavicaPot.remove(pleskavicaPot.size()-1);
                System.out.println("VZE SE PLESKAVICA I OSTANAXA " + pleskavicaPot.size());
                notifyAll();
            }else if(meat.equals("Meatball")){
                while (meatBallPot.size()<=0){
                    try {
                        lock2.wait();
                    } catch (InterruptedException e) {
                        System.out.println("lalala");
                    }
                }
                meatBallPot.remove(meatBallPot.size()-1);
                System.out.println("VZE SE KIUFTE I OSTANAXA " + meatBallPot.size());
                lock2.notifyAll();
            }else{
                while (steakPot.size()<=0){
                    try {
                        lock2.wait();
                    } catch (InterruptedException e) {
                        System.out.println("lalalal");
                    }
                }
                steakPot.remove(steakPot.size()-1);
                System.out.println("VZE SE STEK I OSTANAXA " + steakPot.size());
                lock2.notifyAll();
            }
        }
    }

    public void getRandomSalad(String salad) {
        synchronized (lock1){
            if(salad.equals("liutenica")){
                while (liutenica.get("liutenica")<200){
                    try {
                        lock1.wait();
                    } catch (InterruptedException e) {
                        System.out.println("lalalal");
                    }
                }
                liutenica.put("liutenica",liutenica.get("liutenica")-200);
                System.out.println("VZEHME 200 GR LIUTENICHKA I OSTANAXA " + liutenica.get("liutenica"));
                lock1.notifyAll();
            }else if(salad.equals("snejanka")){
                while (snejanka.get("snejanka")<200){
                    try {
                        lock1.wait();
                    } catch (InterruptedException e) {
                        System.out.println("lalalal");
                    }
                }
                snejanka.put("snejanka",snejanka.get("snejanka")-200);
                System.out.println("VZEHME 200 GR SNEJANKA I OSTANAXA " + snejanka.get("snejanka"));
                lock1.notifyAll();
            }
        }
    }
    public void getOrder(String bread, String meat, String salad){
        seller.takeOrder(bread,meat,salad);
    }
}
