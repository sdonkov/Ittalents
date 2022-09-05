package archers;

import archers.bows.Bow;

public abstract class Archer {
    private String name;
    private char gender;
    private int age;
    private Bow bow;
    private int yearsExp;
    private int tournaments;
    private int tens;
    private int misses;
    private int totalPoints;

    public Archer(String name, char gender, int age, Bow bow, int yearsExp) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.bow = bow;
        this.yearsExp = yearsExp;
    }

    public abstract int returnArrowsCount();
    public abstract int getPointsFromShoot();

    public void shoot(){
        for (int i = 0; i < returnArrowsCount(); i++) {
            int pointsFromShoot = getPointsFromShoot() + bow.getBonus();
            if(pointsFromShoot>10){
                pointsFromShoot=10;
            }
            if(pointsFromShoot ==0){
                this.misses++;
            }
            if(pointsFromShoot==10){
                this.tens++;
            }
            this.totalPoints+=pointsFromShoot;
        }
    }

    public abstract String getCategory();

    public int getTens() {
        return tens;
    }

    public int getMisses() {
        return misses;
    }

    public char getGender() {
        return gender;
    }

    public int getYearsExp() {
        return yearsExp;
    }

    public Bow getBow() {
        return bow;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public String getName() {
        return name;
    }

    public void incrementTournaments(){
        this.tournaments++;
    }
    @Override
    public String toString() {
        return name + " (" + age + "yo) with "
                + yearsExp + " years in the field. Points = "
                + totalPoints +
                " ( misses = " + misses + " and bullseye = "+tens+")" +
                "Gender - " + gender + " Bow " + bow.getClass().getSimpleName();
    }
}
