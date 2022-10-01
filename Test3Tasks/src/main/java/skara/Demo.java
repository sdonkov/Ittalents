package skara;

public class Demo {

    public static void main(String[] args) {

        Barbeque barbeque = new Barbeque();
        Barbeque.seller = new Seller();
        Client.barbeque = barbeque;
        Seller.barbeque = barbeque;
        Salatchik.barbeque = barbeque;
        Skaradjiq.barbeque = barbeque;
        Hlebarka.barbeque = barbeque;
        new Thread(new Salatchik()).start();
        new Thread(new Skaradjiq()).start();
        new Thread(new Hlebarka()).start();
        for (int i = 0; i < 20; i++) {
            new Client().makeOrder();
        }
    }
}
