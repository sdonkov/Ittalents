package skara;

public abstract class ProductToMake {
    protected int durationTime;
    protected double price;

    public abstract void setValue();

    public double getPrice() {
        return price;
    }

    public int getDurationTime() {
        return durationTime;
    }
}
