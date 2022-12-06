package test;

import java.util.ArrayList;

public class Main {

    public static class Player {
        int points;
    }

    public static void main(String[] args) {

        Player player = new Player();
        ArrayList<Player> players = new ArrayList<>();
        ArrayList<Human> list = new ArrayList<>();

        list.add(new Person(30));
        list.add(new Student(12));
        System.out.println(list);

        for (int i = 0; i < 10; i++) {
            player.points = i;
            players.add(player);
        }

        for(Player igrach : players){
            System.out.println(igrach.points);
        }
    }
}
