import java.util.Scanner;

public class Task1SledUroka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] masiv =new float [10];
        float totalSum = 0;
        for(int i=0; i<masiv.length; i++){
            masiv[i] = sc.nextFloat();
            totalSum+= masiv[i];
        }
        System.out.println(totalSum);
    }
}

