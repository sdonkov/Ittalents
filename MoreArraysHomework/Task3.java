import java.util.Scanner;

public class Task3 {
    /*
    3. Напишете програма, която за даден масив от символи arr и
символ ch, въведен от потребителя, проверява али arr съдържа
ch. Ако се съдържа, отпечатайте индекса на елемента. Ако не,
отпечатайте подходящо избрана от вас стойност.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] array = {'x','b','1','%','^',',',' ','s'};
        System.out.println("Enter char: ");
        char searchedSymbol = sc.next().charAt(0);

        int idx = -1;

        for(int i =0; i< array.length; i++){
            if(array[i] == searchedSymbol){
                idx = i;
            }
        }
        System.out.println(idx);
    }
}
