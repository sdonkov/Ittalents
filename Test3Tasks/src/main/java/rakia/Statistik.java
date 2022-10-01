package rakia;

public class Statistik extends Thread {

    public  static Village village;

    @Override
    public void run() {
        while(true){
            if(village.getRakiaMade() > 10){
                break;
            }
            try {
                Thread.sleep(3000);
                System.out.println("NAPRAVENA RAKIA ZA 3 SEKUNDI ");
                System.out.println(" ------------------------------ ");
                System.out.println(village.getRakiaMade());
            } catch (InterruptedException e) {
                if(village.getRakiaMade() > 10){
                    break;
                }
                System.out.println("opa");
            }
        }
    }
}
