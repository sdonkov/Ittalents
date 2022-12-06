package bar;

import java.util.ArrayList;

public class Cage <T>{
    T[] animal;
    int size;

//    public void addAnimal(Object obj, int index){
//        animal[index] = (T) obj;
//    }

    public static void main(String[] args) {
        Dog dog = new Dog("Name", 123);
        Cage<Dog> dogCage = new Cage<Dog>();
//        dogCage.addAnimal(dog,0);

        ArrayList<Integer> integers = new ArrayList<>(8);
        integers.add(3,1);
        System.out.println(integers);
    }
}
