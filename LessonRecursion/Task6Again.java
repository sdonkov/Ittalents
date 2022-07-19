import java.util.Scanner;

public class Task6Again {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do{
            System.out.println("Enter positive number");
            num = sc.nextInt();
        }while(num<1);

        System.out.println(totalSum(num));
    }

    static int totalSum(int num){
        if(num ==1){
            return num;
        }

        return num + totalSum(num - 1);
    }
}
