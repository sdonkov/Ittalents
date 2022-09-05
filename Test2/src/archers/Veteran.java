package archers;

import archers.bows.Bow;
import archers.bows.Carbon;
import util.Utility;

public class Veteran extends Archer{
    private int arrows =60;

    public Veteran(String name, char gender, int age, Carbon bow) {
        super(name, gender, age, bow, Utility.getRandomNum(10,30));
    }

    @Override
    public int returnArrowsCount() {
        return 60;
    }

    @Override
    public int getPointsFromShoot() {
        return Utility.getRandomNum(6,10);
    }

    @Override
    public String getCategory() {
        return getClass().getSimpleName();
    }
}
