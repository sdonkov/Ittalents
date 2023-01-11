import java.util.Scanner;

public class ExamTask3Krasi {
    /*
    Write a method that by given array of integers checks if the average
    value of the array is positive or negative. The method should return
    either "Positive" or "Non-positive" as a result (zero is non-positive).
    Use recursion.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length");
        int[] arr = new int[sc.nextInt()];

        for(int i =0; i <arr.length; i++){
            System.out.println("Enter value");
            arr[i] = sc.nextInt();
        }

        String avg = average(arr,0, 0);
        System.out.println(avg);

    }

    static String average(int[] arr, int sum, int i ){
        if(i == arr.length){
            return sum / arr.length >0 ? "Positive" : "Non-positive";
        }

        sum += arr[i];

        return average(arr, sum, i+1);
    }
}
