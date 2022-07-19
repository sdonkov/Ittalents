import java.util.Scanner;

public class OtUchebnikaTask10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first num");
        int x = sc.nextInt();
        System.out.println("Enter second num");
        int y= sc.nextInt();

        System.out.println((power(x,y)));

    }

    static int power(int num, int power){
        if (power==0){
            return 1;
        }
        if(power==1){
            return num;
        }
        return multiRecursion(power(num, power-1), num);
    }

    static int multiRecursion(int num, int times){
        if(num==0 || times ==0){
            return 0;
        }
        if(times ==1){
            return num;
        }

        return num + multiRecursion(num, times -1);
    }
}
