package archers.bows;

import util.Utility;

public class Carbon extends SeniorBow{
    private int bonus = 3;

    public Carbon(String manufacturer, double weight) {
        super(manufacturer, weight, Utility.getRandomNum(28,48));
    }

    public int getBonus() {
        return bonus;
    }
}
