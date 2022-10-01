package rakia;

import java.util.Random;

public enum Fruit {
    APRICOT,GRAPE,PLUM;

   public static Fruit getRandomFruit(){
        int rand = new Random().nextInt(100);
        if(rand<33){
            return APRICOT;
        }else if(rand < 66){
            return GRAPE;
        }
        return PLUM;
    }
}
