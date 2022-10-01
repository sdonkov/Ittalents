package rakia;

public class Picker extends Human implements Runnable{

    private Fruit fruit;
    public static Village village;


    Picker(String name, int age) {
        super(name, age);
    }


    @Override
    public void run() {
        // бере 1 кг произволен плод и го слага в казан само със същия плод
        //
        while(true){
            if(Thread.currentThread().isInterrupted()){
                System.out.println("KRAI NA BRANETO");
                break;
            }
            fruit = Fruit.getRandomFruit();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("HVANAH TE KRAI NA BRANETO");
                break;
            }
//            System.out.println("Nabrah " + fruit.name());
            village.add(fruit);
            System.out.println("Slojih " + fruit.name());
        }
    }
}
