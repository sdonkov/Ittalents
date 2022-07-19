import java.util.Scanner;

public class ExamTask2Again {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text");
        String text = sc.nextLine();
        char[] arr = sortingAlphabetically(text);
        for(int i =0; i <arr.length; i ++){
            System.out.print(arr[i] +" ");
        }
    }

    static char[] sortingAlphabetically(String text){
        char[] array = new char[text.length()];
        for(int i =0; i <array.length; i++){
            array[i] = text.charAt(i);
        }
        char temp;
        for(int i =0; i<array.length; i++){
            for(int j = i+1; j<array.length; j++){
                if(array[i] > array[j]){
                  temp = array[i];
                  array[i] = array[j];
                  array[j] = temp;
                }
            }
        }
        return array;
    }
}
