import java.util.Scanner;

public class Task1 {
    /*
    Задача 1:
Да се прочете масив и да се намери най-малкото число кратно на
3 от масива.

10, 3, 5, 8, 6, -3, 7
Най-малкото число кратно на 3 е -3
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrayLength;
        do{
            System.out.println("Enter number of cells");
            arrayLength = sc.nextInt();
        }while (arrayLength<1);


        int[] array = new int[arrayLength];

        for(int i =0; i<array.length; i++){
            System.out.println("Enter value:");
            array[i] = sc.nextInt();
        }
//        int[] array = {10, 3, 5, 8, 6, -3, 7};
        int minNum = array[0];
        boolean kratnoChislo = false;
        for(int i =0; i<array.length; i++){
            if(array[i] % 3 ==0){
                kratnoChislo = true;
                if(minNum>array[i]){
                    minNum = array[i];
                }
            }
        }
        if(kratnoChislo){
            System.out.println("Най-малкото кратно число на 3 е " + minNum);
        }else{
            System.out.println("Нито едно число не е кратно на 3");
        }
    }

}
