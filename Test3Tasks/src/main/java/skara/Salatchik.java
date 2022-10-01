package skara;

public class Salatchik implements Runnable{
    public static Barbeque barbeque;

    @Override
    public void run() {
        while(true){
            try {
                barbeque.addSalad();
            } catch (InterruptedException e) {
                System.out.println("lalalal");
            }
        }
    }
}
