package skara;

import java.util.Random;

public class Client {
    public static Barbeque barbeque;

    public void makeOrder(){
        String bread;
        String meat;
        String salad;
        int randBread = new Random().nextInt(2);
        if(randBread == 0){
            bread = "WhiteBread";
        }else{
            bread = "WholeGrainBread";
        }
        int randSalad = new Random().nextInt(2);
        if(randSalad == 0 ){
            salad = "snejanka";
        }else {
            salad = "liutenica";
        }
        int randMeat = new Random().nextInt(3);
        if(randMeat == 0){
            meat = "Meatball";
        }else if (randMeat == 1){
            meat = "Pleskavica";
        }else{
            meat = "Steak";
        }
        barbeque.getOrder(bread,meat,salad);
    }
}
