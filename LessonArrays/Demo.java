import java.util.Scanner;

public class Demo {

    /*
    След като е въведено положително число да се покажат
    всички прости числа от 1 до въведеното число
     */

    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter a positive number:");
            number = sc.nextInt();
        }while (number<1);

        for (int chisla=1; chisla<number; chisla++){
            boolean isPrime = true;
            for(int delitel =2; delitel<chisla; delitel++){
                if(chisla % delitel ==0){
                    isPrime =false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(chisla);
            }
        }
    }
}
