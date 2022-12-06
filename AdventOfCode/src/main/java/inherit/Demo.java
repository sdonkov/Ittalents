package inherit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Demo {

    static private class Nemo{

        void x(){
            System.out.println("Nemo pluvka");
        }
    }

    public static void main(String[] args) {
        Object[] arr = new Object[5];
        arr[0] = new Object();
        arr[1] = new Nemo();
        arr[2] = new Dog();
        HashSet<Object> set = new HashSet<>();
        String word = "word";
        System.out.println(word);
        System.out.println(word.hashCode());
        word = "axaxa";
        System.out.println(word);
        System.out.println(word.hashCode());
//        Integer
        Nemo nemo = new Nemo();
        nemo.x();
        ArrayList<Object> arrayList = new ArrayList<>();
        arrayList.add(nemo);
        arrayList.add(new Animal());
        arrayList.add(new Dog());
        arrayList.add(new Dog());
        arrayList.add(new Dog());
        arrayList.add(new Dog());
        arrayList.add(new Dog());
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.remove(i);
        }
        System.out.println("Arraylist size is " + arrayList.size());
        for (Iterator<Object> it  = arrayList.iterator(); it.hasNext();) {
            it.next();
            it.remove();
        }
        System.out.println("Arraylist size is " + arrayList.size());
        Dog dog = new Dog();
        Animal a2 = new Animal();
        Animal a1 = new Dog();
        a1.f();
        a2.f();
        a1 = a2;
        a1 = dog;
        a2 = dog;
//        dog = a1;
        dog.h();
        Animal.Animalche animalche = new Animal.Animalche();
        Dog.Dogo dogo = dog.new Dogo();
//        Dog.Dogo.x;
        System.out.println(Dog.Dogo.x);

    }
}
