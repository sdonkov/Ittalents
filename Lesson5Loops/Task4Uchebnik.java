import java.util.Scanner;

public class Task4Uchebnik {
/*
да се съствави програма, която прочита число от конзолата и
изписва на екрана всички числа , на които това число се дели без остатък.
 */
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num;
    do {
        System.out.println("Enter a positive number");
        num = sc.nextInt();
    }while(num<1);

    for(int i = num; i>0; i--){
        if(num % i == 0){
            System.out.println(i);
        }
    }
}
}
