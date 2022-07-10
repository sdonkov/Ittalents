import java.util.Scanner;

public class Task4 {
    /*
    Задача 4:
Да се прочете масив и да се отпечата дали е огледален.
Следните масиви са огледални:
[3 7 7 3]
[4]
[1 55 1]
[6 27 -1 5 7 7 5 -1 27 6]
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrayLen;
        do {
            System.out.println("Enter length ");
            arrayLen = sc.nextInt();
        }while (arrayLen<1);

        int[] firstArray = new int[arrayLen];
        int[] reversedArray = new int[arrayLen];

        for (int i =0; i<firstArray.length; i++){
            System.out.println("Enter value:");
            firstArray[i] = sc.nextInt();
        }
        int a = 0;
        for (int i = firstArray.length-1; i >=0; i--) {
            reversedArray[i] = firstArray[a];
            a++;
        }
        boolean isReversed = true;
        for(int i =0;i<firstArray.length; i++){
            if(firstArray[i] != reversedArray[i]){
                isReversed = false;
                break;
            }
        }
        if(isReversed){
            System.out.println("Original array is:");
            for(int i =0; i <firstArray.length; i++){
                System.out.print(firstArray[i] + " ");
            }
            System.out.println();
            System.out.println("Reversed array is:");
            for (int i = 0; i < reversedArray.length; i++) {
                System.out.print(reversedArray[i] + " ");
            }


        }else{
            System.out.println("Original array is:");
            for(int i =0; i <firstArray.length; i++){
                System.out.print(firstArray[i] + " ");
            }
            System.out.println();
            System.out.println("Not reversed array is:");
            for (int i = 0; i < reversedArray.length; i++) {
                System.out.print(reversedArray[i] + " ");
            }
        }

    }
}
