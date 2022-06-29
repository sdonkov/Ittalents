import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Въведете пари");
        double money = sc.nextDouble();
        System.out.println("Въведете дали сте здрав");
        boolean health = sc.nextBoolean();
        if (health && money >10){
            System.out.println("Здрав съм и имам пари - ще отида на кино с приятели");
        }else if(health && money < 10){
                System.out.println("Здрав съм, но нямам достатъчно пари - ще отида на кафе");
            }else if(!health && money >10){
            System.out.println("Болен съм и имам пари - няма да излизам, но ще дам пари на някого да ми купи лекарства");
        }else if(!health && money < 10){
            System.out.println("Болен съм, но нямам пари - няма да излизам и ще пия чай вкъщи");
        }
        }
    }


