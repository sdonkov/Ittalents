package archers;

import archers.bows.SeniorBow;
import util.Utility;

import java.util.Random;

public class Senior extends Archer{

    public Senior(String name, char gender, int age, SeniorBow bow) {
        super(name, gender, age, bow, Utility.getRandomNum(3,9));
    }

    @Override
    public int returnArrowsCount() {
        return 60;
    }

    @Override
    public int getPointsFromShoot() {
        int rand = new Random().nextInt(100);
        if(rand>95){
            return 0;
        }
        return Utility.getRandomNum(6,10);
    }

    @Override
    public String getCategory() {
        return getClass().getSimpleName();
    }
}
