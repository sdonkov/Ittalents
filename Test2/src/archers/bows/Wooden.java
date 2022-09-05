package archers.bows;

import util.Utility;

public class Wooden extends Bow {

    public Wooden(String manufacturer, double weight) {
        super(manufacturer, weight, Utility.getRandomNum(20,30));
    }

    @Override
    public int getBonus() {
        return 0;
    }
}
