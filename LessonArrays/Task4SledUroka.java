import java.util.Scanner;

public class Task4SledUroka {
    public static void main(String[] args) {
        //char[] array = {'A', '1', 'S', '4', ',', '.','~','0'};
        Scanner sc = new Scanner(System.in);
        char[] array = new char[15];

        for (int i = 0; i < array.length ; i++) {
            array[i] = sc.next().charAt(0);
        }
        boolean lowerCase = false;
        for (int i = 0; i < array.length; i++) {
            if(array[i]>'a' && array[i] <'z'){
                lowerCase = true;
                break;
            }
        }
        System.out.println(lowerCase ? "There is a lowercase char" : "There is no lowercase char");
    }
}
