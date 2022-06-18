import java.util.Scanner;

public class Lesson3Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int total=0;
        while(a>=1){
            if(a % 2 ==1){
                total += 1;
                a /= 2;
        }else{
                a /=2;
            }

        }
        System.out.println(total);
    }
}
