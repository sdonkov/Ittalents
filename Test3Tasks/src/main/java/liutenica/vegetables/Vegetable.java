package liutenica.vegetables;

public abstract class Vegetable {

    public final static String[] VEG = {"Tomato","Eggplant","Pepper"};
    private String name;
    private int processingTime;

    Vegetable(String name,int processingTime){
        this.name = name;
        this.processingTime= processingTime;
    }

    public String getName() {
        return name;
    }

    public int getProcessingTime() {
        return processingTime;
    }
}
