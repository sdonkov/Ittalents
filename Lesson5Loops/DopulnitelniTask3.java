import java.util.Scanner;

public class DopulnitelniTask3 {
    /*
    3. Да се състави програма, която проверява дали въведено четирицифрено число съдържа
цифрата 0.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        boolean thereIsZero = false;
        do {
            System.out.println("Input a number between 1000 and 9999");
            num = sc.nextInt();
        }while (num<1000 || num >=10000);
        int hilqdi = num /1000;
        int stotici = (num %1000) / 100;
        int desetici = (num % 100) / 10;
        int edinici = num % 10;
        if(stotici ==0 || desetici == 0 || edinici == 0){
            thereIsZero = true;
        }
        if(thereIsZero){
            System.out.println("There is zero in the number");
        }else {
            System.out.println("There is no zero in the number");
        }
    }
}
