import java.util.Scanner;

public class DopulnitelniTask2 {
    /*
    2. Да се състави програма, която при подадено четирицифрено число отпечатва на екрана на
    отделни редове цифрата на хилядите, стотиците, десетиците и единиците.

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.println("Input a number between 1000 and 9999");
            num = sc.nextInt();
        }while (num<1000 || num >=10000);
        int hilqdi = num /1000;
        int stotici = (num %1000) / 100;
        int desetici = (num % 100) / 10;
        int edinici = num % 10;
        System.out.println("Digit for hilqdi is " + hilqdi);
        System.out.println("Digit for stotici is " + stotici);
        System.out.println("Digit for desetici is " + desetici);
        System.out.println("Digit for edinici is " + edinici);

    }
}
