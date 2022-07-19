import java.util.Scanner;

public class ExamTask2Stefka {
    /*
    write a method that takes a string variable that holds some text.
    The method returns an array of characters containing all the symbols
    from the string, sorted alphabetically

     */
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
        char[] arr = text.toCharArray();
        char temp;

        for(int i =0; i <text.length(); i++){
            for(int j = i+1; j<text.length(); j++){
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
