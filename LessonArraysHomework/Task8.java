import java.util.Scanner;

public class Task8 {
    /*
    Задача 8:
Напишете програма, която намира и извежда най-дългата редица от
еднакви поредни елементи в даден масив.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrayLen;
        do {
            System.out.println("Enter length of array:");
            arrayLen = sc.nextInt();
        }while (arrayLen<1);

        int[] array = new int[arrayLen];
        int count =1;
        int max =count;
        int[] sameElementsInArray = new int[count];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter value");
            array[i] = sc.nextInt();
        }

        for (int i =1; i<array.length; i++){
            if (array[i] == array[i-1]){
                count++;
                if (max<count){
                    max = count;
                    sameElementsInArray = new int[max];
                    for(int j =0; j<sameElementsInArray.length; j++){
                        sameElementsInArray[j] = array[i];
                    }
                }
            }else {
                count=1;
            }
        }

        System.out.println("Number of consecutive times " + max);
        System.out.println();
        System.out.println("Array is:");
       if(sameElementsInArray.length>1){
           for (int i = 0; i < sameElementsInArray.length; i++) {
               System.out.print(sameElementsInArray[i] + " ");
           }

        }else{
           System.out.println(array[0]);
       }
    }
}