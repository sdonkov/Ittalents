package inherit;

public class Dog extends Animal implements Drinkly, Walky{

    private int y;

    void h() {
        Drinkly.super.drink();
        Walky.super.drinking();
    }

    class Dogo{
        static int x = 3;

        Dogo(){
            y = 15;
        }

        void f(){
            System.out.println(y);
        }
    }

}
