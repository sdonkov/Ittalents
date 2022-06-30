import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert number a");
        int a = sc.nextInt();
        System.out.println("Insert number b");
        int b = sc.nextInt();
        int temp;
        if(a>b){
            temp=a;
        }else{
            temp=b;
        }
        System.out.println(temp);
    }
}
