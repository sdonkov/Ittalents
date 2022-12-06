package inherit;

public interface Drinkly {

    default void drink(){
        System.out.println("drink");
    }
}
