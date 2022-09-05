package util;

import archers.bows.Bow;

import java.util.Random;

public class Utility extends Bow {

    public static final String[] NAMES = {"Pepi","Niki","Viki","Miti","Stefi"};

    public Utility(String manufacturer, double weight, int tensileStrength) {
        super(manufacturer, weight, tensileStrength);
    }

    public static int getRandomNum(int min, int max){
        return new Random().nextInt(min,max+1);
    }
    public static String getRandomName(){
        return NAMES[new Random().nextInt(NAMES.length)];
    }

    public static char getRandomGender(){
         if(new Random().nextBoolean()){
             return 'm';
         }
         return 'f';
    }

    @Override
    public int getBonus() {
        return 0;
    }

    public void sth(){
        this.
    }
}
