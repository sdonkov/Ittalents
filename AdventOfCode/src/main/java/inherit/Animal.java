package inherit;

public class Animal {
    private static int x = 3;
    void f(){

    }

     static  class Animalche{

        Animalche(){
//            x = 15;
        }
        void f(){
            System.out.println(Animal.x);
        }
    }
}
