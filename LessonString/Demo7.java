import java.util.Scanner;

public class Demo7 {
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
        System.out.println("Enter text: ");
        String[] wordsArray = sc.nextLine().split(" ");
        String longestWord = wordsArray[0];

        for(int i=0; i < wordsArray.length; i++){
            if(wordsArray[i].length() > longestWord.length()){
                longestWord = wordsArray[i];
            }
        }
        if(longestWord.length()==0){
            System.out.println("No words inputed");
        }else{
            System.out.println(wordsArray.length + " думи, най-дългата е с " + longestWord.length() + " символа." );
        }

    }
}
