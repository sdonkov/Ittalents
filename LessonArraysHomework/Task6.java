import java.util.Scanner;

public class Task6 {
    /*
    Задача 6:
Напишете програма, която първо чете 2 масива и после извежда
съобщение дали са еднакви, и дали са с еднакъв размер.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstLen;
        int secondLen;
        do {
            System.out.println("Enter length for first array:");
            firstLen = sc.nextInt();
            System.out.println("Enter length for second array:");
            secondLen = sc.nextInt();
        }while (firstLen<1 || secondLen<1);

        int[] firstArray = new int[firstLen];
        int[] secondArray = new int[secondLen];

        for (int i = 0; i < firstArray.length; i++) {
            System.out.println("Enter values for first array");
            firstArray[i] = sc.nextInt();
        }
        for(int i =0; i <secondArray.length; i++){
            System.out.println("Enter values for second array");
            secondArray[i] = sc.nextInt();
        }

        boolean areSame = true;
        if(firstArray.length != secondArray.length){
            areSame = false;
            System.out.println("Arrays length is different. First array length is" + " " + firstArray.length
            + " " +"second array length is: " + secondArray.length);
        }else{
            for(int i =0; i<secondArray.length; i++){
                if(firstArray[i] != secondArray[i]){
                    areSame = false;
                    break;
                }
            }
        }
        if(areSame){
            System.out.println("Arrays are the same");
        }else{
            System.out.println("Arrays are not the same");
        }
    }
}
