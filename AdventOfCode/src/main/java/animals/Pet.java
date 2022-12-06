package animals;

import tasks.Next;

import java.util.*;

public class Pet extends Mammal{

    int x =3;
    static int y = 3;

    public static void main(String[] args) {
        int a = 0;
        do{
            System.out.println("opa opa");
            a++;
        }while( a < 3);

        String word ="qblanica";
//        Collections.unmodifiableList(new ArrayList<>());
//        word.eq
//        Comparable;
//        Comparator
        System.out.println(word.substring(0,3));
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        TreeMap<Integer,String> tree = new TreeMap<>();
        Queue<Integer> queue = new LinkedList<>();
        Pet petko = new Pet();
        Pet metko = new Pet();
        System.out.println(petko.equals(metko));
//        Pet[] pets = new Pet[1231];
//        Pet[] pets = {new Pet(), new Pet(), new Pet()};
//        System.out.println(pets[2].x);
        switch (a){
            case 0: System.out.println("exe");
            case 3:
                System.out.println("taka li be");
        }
    }
}
