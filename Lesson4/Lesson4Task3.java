import java.util.Scanner;

public class Lesson4Task3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Въведете пари:");
        double money = sc.nextDouble();
        System.out.println("Въведете дали сте здрав:");
        boolean health = sc.nextBoolean();

        if(!health && money >=10){
            System.out.println("ще си купя лекарства");
        }else {
            if (!health && money < 10) {
                System.out.println("ще пия чай");
            }else{
                if(health && money >= 10){
                    System.out.println("отивам на кино");
                }else{
                    if(health && money <10){
                        System.out.println("ще се разходя");
                    }
                }
            }
        }
        }
    }

