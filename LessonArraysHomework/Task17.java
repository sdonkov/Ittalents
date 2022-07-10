import java.util.Scanner;

public class Task17 {
    /*
    Задача 17:
Една редица от естествени числа ще наричаме зигзагообразна нагоре,
ако за елементите и са изпълняват условията:
N1 < N2 > N3 < N4 > N5 <..
Съставете програма, която проверява дали въведени в едномерен
масив редица от числа изпълняват горните изисквания.
Пример: 1 3 2 4 3 7
Изход: изпълнява изискванията за зигзагообразна нагоре редица
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrayLen;
        do {
            System.out.println("Enter array length");
            arrayLen =sc.nextInt();
        }while(arrayLen<3);
        int[] array = new int[arrayLen];
        for(int i =0; i<array.length; i++){
            System.out.println("Enter value:");
            array[i] = sc.nextInt();
        }
        boolean isZigZag = true;
        int index =0;
        for(int i =0; i< array.length -1; i++){
            if(index % 2==0 && array[i] >= array[i +1]){
                isZigZag =false;
                break;
            }else{
                if(index % 2==1 && array[i] <= array[i+1]){
                    isZigZag=false;
                    break;
                };
            }
            index++;
        }
        System.out.println(isZigZag ? "Array is zigzag" : "Array is not zigzag");
    }
}
