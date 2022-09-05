package archers.bows;

public  abstract class Bow {
    protected String manufacturer;
    protected double weight;
    protected int tensileStrength;

    public Bow(String manufacturer, double weight, int tensileStrength) {
        this.manufacturer = manufacturer;
        this.weight = weight;
        this.tensileStrength = tensileStrength;
    }

    public abstract int getBonus();
}
