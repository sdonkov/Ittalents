package test;

import lombok.Data;

import java.util.Objects;
import static java.lang.Math.*;

@Data
public final class Person extends Human implements Test, Testov {

    private int age;
    private final int num;
    private String text;

    Person(int age){
        this("texxt");
//        super();
        this.age = age;
        System.out.println(getNumber());
        int aa = 31;
        aa++;
//        num = 33;
        System.out.println(aa);
//        System.gc
    }
    Person(String text){
        System.out.println("otherConstructor");
        num = 35;
    }

    @Override
    int getNumber() {
        return 123;
    }

    @Override
    protected int getRow() {
        return 0;
    }


    @Override
    int aa() {
        return 0;
    }

    static void staticMethod(){
        System.out.println("static method");
        Math.pow(2,2);
        pow(2,2);
//        notStaticMethod();
    }

    void notStaticMethod(){
        staticMethod();
    }


    @Override
    public int test2() {
        return 0;
    }

    @Override
    public Person human() {
        return new Person(31);
    }

    private int getNarcos(){
        synchronized (this){ // block of code
            return 3;
        }
    }

    private synchronized static int getPablo(){
        return 3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age);
    }

    @Override
    public int test2(int x) {
        return 0;
    }
}
