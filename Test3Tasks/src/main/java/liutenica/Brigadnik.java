package liutenica;

import liutenica.vegetables.Vegetable;

import java.util.ArrayList;

public abstract class Brigadnik {
    private String name;
    private int age;
    public static final ArrayList<Vegetable> ll = new ArrayList<>();

    Brigadnik(String name,int age){
        this.name = name;
        this.age = age;
    }

    abstract void doBrigadaTask();

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
