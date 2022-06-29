import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Въведете първо число:");
        int a = sc.nextInt();
        System.out.println("Въведете второ число:");
        int b = sc.nextInt();
        System.out.println("Въведете трето число");
        int c = sc.nextInt();

        if(a>b && b>c){
            System.out.println(a + ", " + b + ", " +c);
        }else {
            if(a > c && c > b){
                System.out.println(a +", " + c + ", " + b);
            }else{
                if(b > a && a >c){
                    System.out.println(b + ", " + a + ", " +c);
                }else {
                    if(b >c && c >a){
                        System.out.println(b + ", " + c + ", " +a);
                    }else{
                        if(c>a && a >b){
                            System.out.println(c + ", " + a + ", "+b);
                        }else{
                            if(c >b && b >a){
                                System.out.println(c + ", " + b + ", " + a);
                            }else{
                                System.out.println("Числата не са различни, опитай пак");
                            }
                        }
                    }
                }
            }
        }
    }
}
