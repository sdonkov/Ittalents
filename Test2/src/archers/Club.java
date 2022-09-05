package archers;

import java.util.*;

public class Club {
    private String name;
    private String address;
    private String coach;
    private TreeSet<Archer> archers;
    private Map<String, Map<String,Integer>> totalResults;
    private ArrayList<Archer> woman;

    public Club(String name, String address, String coach) {
        this.name = name;
        this.address = address;
        this.coach = coach;
        archers = new TreeSet<>((o1, o2) -> o1.getName().compareTo(o2.getName()));
//        archers = new ArrayList<>();
        totalResults = new HashMap<>();
        woman = new ArrayList<>();
    }


    public void add(Archer archer) {
        archers.add(archer);
        if(!totalResults.containsKey(archer.getClass().getSimpleName())){
            totalResults.put(archer.getClass().getSimpleName(),new TreeMap<>());
        }
    }

    public void startTournament() {
        for(Archer archer :archers){
            archer.incrementTournaments();
        }
        System.out.println("--------------ARCHERS-----------------------");
       printArchers();
        System.out.println("--------------START SHOOTING-------------------");
        archersShoot();
        System.out.println("-------------- END ---------------------------");
        System.out.println("------------STATISTICS------------------------");
        printWinnerByCategory();
        printAverageResultByCategory();
        printMostAccurateArcher();
        printMostNekadurenArcher();
        printOnlyWoman();
        printMenWithCarbonBowsByExperience();
//        System.out.println(totalResults);
//        printArchers();
    }

    private void printMenWithCarbonBowsByExperience() {
        System.out.println("-------------- SAMO MUJE S KARBONI----------------");
        ArrayList<Archer> manwithCarbon = new ArrayList<>();
        for(Archer archer : archers){
            if(archer.getGender() =='m' && archer.getBow().getClass().getSimpleName().equals("Carbon")){
                manwithCarbon.add(archer);
            }
        }
        manwithCarbon.sort((o1, o2) -> {
            if(o2.getYearsExp() - o1.getYearsExp()==0){
                return 1;
            }
            return o2.getYearsExp() - o1.getYearsExp();
        });
        for (Archer archer : manwithCarbon){
            System.out.println(archer);
        }
    }

    private void printOnlyWoman() {
        System.out.println("---------------SAMO JENI -----------------------");
        for(Archer archer : archers){
            if(archer.getGender()=='f'){
                woman.add(archer);
            }
        }
        woman.sort((o1, o2) -> o2.getTotalPoints() - o1.getTotalPoints());
        int max = woman.get(0).getTotalPoints();
        for(Archer archer :woman){
            System.out.println(archer.getName() + " ima " + archer.getTotalPoints() + " koeto e "
            + (double) archer.getTotalPoints()/max * 100 + " % ot maxa" );
        }
    }

    private void printMostNekadurenArcher() {
        System.out.println("-------------------NAI-NETOCHEN---------------");
        System.out.println(archers.stream().sorted((o1, o2) -> o2.getMisses()-o1.getMisses()).findFirst());
    }

    private void printMostAccurateArcher() {
        System.out.println("-----------------NAI-TOCHEN--------------------");
        System.out.println(archers.stream().sorted((o1, o2) -> o2.getTens() - o1.getTens()).findFirst());
    }

    private void printAverageResultByCategory() {
        for (Map.Entry<String, Map<String, Integer>> stringMapEntry : totalResults.entrySet()) {
            System.out.println("Category " + stringMapEntry.getKey());
            int points = 0;
            for(Map.Entry<String,Integer> stringIntegerMap : stringMapEntry.getValue().entrySet()){
                points += stringIntegerMap.getValue();
            }
            System.out.print("\t"+"AVERAGE POINTS: ");
            System.out.println(points/stringMapEntry.getValue().size());
        }
    }

    private void printWinnerByCategory() {
        //сортиране по категории от всяка категория да взема този с най-много точки
        ArrayList<Map.Entry<String, Integer>> ll = new ArrayList<>();
//        ll.addAll(totalResults.values());
//        Collections.sort(ll,(o1, o2) -> );
//        System.out.println(ll);

        for (Map.Entry<String, Map<String, Integer>> stringMapEntry : totalResults.entrySet()) {
            System.out.println("Category: " + stringMapEntry.getKey());
            ll.addAll(stringMapEntry.getValue().entrySet());
            Collections.sort(ll,(o1, o2) -> o2.getValue() - o1.getValue());
            System.out.println("\t" + "POBEDITEL E " + ll.get(0));
//            for(Map.Entry<String,Integer> stringIntegerEntry : stringMapEntry.getValue().entrySet()){
//                System.out.println("\t" + "-" + stringIntegerEntry.getKey() + " IMA "+stringIntegerEntry.getValue());
//                System.out.println("\t" + "POBEDITEL E " + ll.get(0));
//            }
        }
    }

    private void archersShoot() {
        for (Archer archer : archers) {
            archer.shoot();
//            if(!totalResults.containsKey(archer.getClass().getSimpleName())){
//                totalResults.put(archer.getClass().getSimpleName(),new TreeMap<>());
//            }
            totalResults.get(archer.getCategory()).put(archer.getName(),archer.getTotalPoints());
        }
    }

    private void printArchers() {
        for (Archer archer : archers) {
            System.out.println(archer);
        }
    }
}
