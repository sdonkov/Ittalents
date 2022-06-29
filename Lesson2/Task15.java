import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Въведете число от 0 до 24:");
        int hour = sc.nextInt();
        if(hour >= 0 && hour < 25){
            if(hour > 18 || hour <=4){
                System.out.println("Добър вечер");
            }else{
                if(hour >4 && hour <=9){
                    System.out.println("Добро утро");
                }else {
                    if(hour>9 || hour <=18){
                        System.out.println("Добър ден");
                    }
                }
            }
        }else {
            System.out.println("невалиден час, опитай пак");
        }
    }
}
