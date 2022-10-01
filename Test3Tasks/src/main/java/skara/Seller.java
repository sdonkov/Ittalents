package skara;

public class Seller {
    public static Barbeque barbeque;

    public void takeOrder(String bread,String meat, String salad){
         barbeque.getRandomBread(bread);
         barbeque.getRandomMeat(meat);
         barbeque.getRandomSalad(salad);
    }
}
