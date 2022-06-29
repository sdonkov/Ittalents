import java.util.Scanner;

public class Lesson3Task4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int bits = 0;

        while(a>0){
            if(a%2 ==1){
                a /= 2;
                bits+=1;
                if(bits==5){
                    System.out.println("Petiq bit e edinica");
                }
            }else{
                a /=2;
                bits +=1;
                if(bits==5){
                    System.out.println("petiq bit e 0");

            }


            }
        }

    }
}
