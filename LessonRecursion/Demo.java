import java.util.Scanner;

public class Demo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        System.out.println(factoriel(num));

    }

    static int factoriel(int x){
        if(x ==1){
            return 1;
        }
       return x * factoriel(x-1);
    }
}

