import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Въведете четирицифрено число:");
        int num = sc.nextInt();
        int a;
        int b;
        int c;
        int d;
        int x;
        int firstNum;
        int secondNum;
        if(num>=1000 && num<10000){
            a = num /1000;
//            System.out.println(a);
            x = num % 1000;
            b = x /100;
//            System.out.println(b);
            x = num % 100;
            c = x / 10;
//            System.out.println(c);
            x= num % 10;
            d = x;
//            System.out.println(d);
            firstNum = (a * 10) + d;
            secondNum = (b * 10) +c;
//            System.out.println(firstNum);
//            System.out.println(secondNum);
            if(firstNum>secondNum){
                System.out.println("по-голямо");
            }else{
                if(firstNum == secondNum){
                    System.out.println("равни");
                }else{
                        System.out.println("по-малко");
                    }
                }
            }else{
            System.out.println("Въведеното число не е четирицифрено, опитай пак");
        }
        }
    }
