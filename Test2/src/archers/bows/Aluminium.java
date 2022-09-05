package archers.bows;

import util.Utility;

public class Aluminium extends SeniorBow{

    private int bonus = 1;

    public Aluminium(String manufacturer, double weight) {
        super(manufacturer, weight, Utility.getRandomNum(25,40));
    }

    public int getBonus() {
        return bonus;
    }
}
