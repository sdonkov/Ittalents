import java.util.Arrays;
import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] namesArray = sc.nextLine().split(", ");

        biggerAsciiName(namesArray);
    }

    static void biggerAsciiName(String[] namesArray){
        int sumFirst = 0;
        for(int i =0; i <namesArray[0].length(); i++){
            sumFirst += namesArray[0].charAt(i);
        }
        System.out.println(sumFirst);
        int sumSecond = 0;
        for(int i =0; i<namesArray[1].length();i++){
            sumSecond+= namesArray[1].charAt(i);
        }
        System.out.println(sumSecond);
        if(sumFirst > sumSecond){
            System.out.println(namesArray[0]);
        }else{
            System.out.println(namesArray[1]);
        }
    }
}
