import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Въведете трицифрено число без да съдържа нула");

        int num = sc.nextInt();

        int firstDigit = num / 100;
        int secondDigit = (num % 100) / 10;
        int thirdDigit = num %10;

        if(firstDigit != 0 && secondDigit != 0 && thirdDigit != 0 && num >=100 && num <1000){
            if(num % firstDigit ==0 && num % secondDigit ==0 && num % thirdDigit ==0){
                System.out.println("Дели се на всяка своя цифра");
            }else{
                System.out.println("Не се дели на всяка своя цифра");
            }
        }else{
            System.out.println("Въведното число не отговаря на изискванията, опитай пак");
        }
    }
}
