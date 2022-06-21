import java.util.Scanner;

public class Task4SledUroka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do{
        System.out.println("Insert number");
        num = sc.nextInt();
        }while(num<2);

        boolean isPrime = true;
        for(int i=2; i<num ;i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }if(isPrime){
            System.out.println("prosto e");
        }else{
            System.out.println("ne e prosto");
        }

    }
}
