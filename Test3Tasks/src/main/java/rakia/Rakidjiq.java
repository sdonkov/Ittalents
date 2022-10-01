package rakia;

public class Rakidjiq  extends Human implements Runnable{

    private Fruit fruit;
    public static Village village;
    Rakidjiq(String name, int age) {
        super(name, age);
    }

    @Override
    public void run() {
        while(true){
            if(Thread.currentThread().isInterrupted()){
                System.out.println("KRAI-------------------------------------");
                break;
            }
            try {
                village.makeRakia();
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("FINITO");
                break;
            }
        }
    }
}
