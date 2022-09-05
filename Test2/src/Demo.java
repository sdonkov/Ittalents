import archers.*;
import archers.bows.Aluminium;
import archers.bows.Carbon;
import archers.bows.SeniorBow;
import archers.bows.Wooden;
import util.Utility;

import java.util.Random;
// add some comment here 
public class Demo {
    public static void main(String[] args) {

        Club club = new Club("IT Archer","Sofia","Pepo Beta");
        Archer archer;
        for (int i = 0; i < 40; i++) {
            int rand = new Random().nextInt(100);
            if(rand<33){
                archer = new Junior(
                        Utility.getRandomName()+(i+1),
                        Utility.getRandomGender(),
                        Utility.getRandomNum(12,52),
                        new Wooden("Durvo OOD",3.3));
            }else{
                if(rand<66){
                    archer = new Senior(
                            Utility.getRandomName()+(i+1),
                            Utility.getRandomGender(),
                            Utility.getRandomNum(12,52),
                            getRandomBow());
                } else {
                archer = new Veteran(
                        Utility.getRandomName()+(i+1),
                        Utility.getRandomGender(),
                        Utility.getRandomNum(12,52),
                        new Carbon("Vuglen OOD",2.8));
            }
        }
            club.add(archer);
        }
        club.startTournament();
    }

    private static SeniorBow getRandomBow() {
        return new Random().nextBoolean() ?
         new Carbon("Vuglen OOD",2.8) :
         new Aluminium("Alumin OOD",3.8);

    }
}
