import java.util.Scanner;

public class Task7 {
    /*
    Задача 7:
Да се състави програма, която чете набор от думи разделени с
интервал.
Като резултат да се извеждат броя на въведените думи, както и броя
знаци в най-дългата дума.
Пример: asd fg hjkl
Изход: 3 думи, най-дългата е с 4 символа.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your words");
        String[] array = sc.nextLine().split(" ");
        int maxLen = 0;
        int currentLen =0;
        for(int i =0; i <array.length;i++){
            currentLen = array[i].length();
            if(currentLen > maxLen){
                maxLen = currentLen;
            }
        }
        System.out.println(array.length + " думи, най-дългата е с " + maxLen + " символа.");

    }
}

