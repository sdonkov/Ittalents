package archers;

import archers.bows.Bow;
import archers.bows.Wooden;
import util.Utility;

import java.util.Random;

public class Junior extends Archer{

//    private int arrows = 30;

    public Junior(String name, char gender, int age, Wooden bow) {
        super(name, gender, age, bow, Utility.getRandomNum(1,3));
    }

    @Override
    public int returnArrowsCount() {
        return 30;
    }

    @Override
    public int getPointsFromShoot() {
        int rand = new Random().nextInt(100);
        if(rand>90){
            return 0;
        }
        return Utility.getRandomNum(1,10);
    }

    @Override
    public String getCategory() {
        return getClass().getSimpleName();
    }
}
