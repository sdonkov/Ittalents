import java.util.Arrays;
import java.util.Scanner;

public class OtUchebnikaTask10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int arrayLen = sc.nextInt();
        String[] arr = new String[arrayLen];
        for(int word=0; word<arr.length; word++){
            System.out.println("Enter word");
            arr[word] = sc.next();
        }
        String usingJoin = String.join(", ", arr);
        System.out.println(usingJoin);
        int max = 0;
        for(int i =0; i < arr.length; i++){
            if(arr[i].length() > max){
                max = arr[i].length();
            }
        }
        for(int row = 0; row <= arr.length + 1; row++){
            if(row == 0 || row == arr.length + 1){
                for(int firstAndLast =0; firstAndLast < max +2; firstAndLast++){
                    System.out.print("*");
                }
            }else{
                System.out.print("*");
                System.out.print(arr[row - 1]);
                int spaces = max - arr[row - 1].length();
                for(int x =0; x<spaces; x++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
