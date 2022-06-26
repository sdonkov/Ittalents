import java.util.Scanner;

public class DopulnitelniTask9 {
    /*
    9. Да се напише програма. която проверява дали числата a, b и c могат да бъдат дължини на
страни на триъгълник.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int c;
        do {
            System.out.println("Input a:");
            a = sc.nextInt();
            System.out.println("Input b:");
            b = sc.nextInt();
            System.out.println("Input c:");
            c = sc.nextInt();
        }while(a<1 || b<1 || c <1);
        if((a+b) >c && (a+c) > b && (b+c) >a){
            System.out.println("Yes, these values are valid for a triangle");
        }else {
            System.out.println("Noo, these values are not valid for a triangle.");
        }
    }
}
