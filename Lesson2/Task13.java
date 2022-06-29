import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Въведете температура между 100 и -100:");
        int temperature = sc.nextInt();
        if(temperature <=100 && temperature >=-100){
            if(temperature<-20){
                System.out.println("ледено студено");
            }else {
                if(temperature >= -20 && temperature <=0){
                    System.out.println("студено");
                }else {
                    if(temperature >0 && temperature<=15){
                        System.out.println("хладно");
                    }else {
                        if(temperature > 15 && temperature <=25){
                            System.out.println("топло");
                        }else{
                            if(temperature >25){
                                System.out.println("горещо");
                            }
                        }
                    }
                }
            }
        }else {
            System.out.println("Въведената температура не е в диапазона");
        }
    }
}
