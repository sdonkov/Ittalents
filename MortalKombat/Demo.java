import java.util.Random;

public class Demo {
    public static void main(String[] args) {

        Fighter player1 = new Fighter("Michael", 100, 5);
        Fighter player2 = new Fighter("Scila", 100, 5);

        int wins1=0;
        int wins2=0;
//        for (int i =1; i <= 100; i++) {
//            System.out.println("ROUND " + i);
//            soti.resetHealth();
//            karoto.resetHealth();
            while (player1.isAlive() && player2.isAlive()) {
                if (new Random().nextBoolean()) {
                    player1.hit(player2);
                    if (!player2.isAlive()) {
                        System.out.println(player1.getName() + " WINS");
                        wins1++;
                        break;
                    }
                    player2.hit(player1);
                    if (!player1.isAlive()) {
                        System.out.println(player2.getName() + " WINS");
                        wins2++;
                        break;
                    }
                } else {
                    player2.hit(player1);
                    if (!player1.isAlive()) {
                        System.out.println(player2.getName() + " WINS");
                        wins2++;
                        break;
                    }
                    player1.hit(player2);
                    if (!player2.isAlive()) {
                        System.out.println(player1.getName() + " WINS");
                        wins1++;
                        break;
                    }
                }
            }
//        }
        System.out.println(player1.getName() + " WINS: " + wins1);
        System.out.println(player2.getName() + " WINS " + wins2);
    }
}
