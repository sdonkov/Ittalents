import java.util.Scanner;

public class ExamTask3Stefka {
    /*
    Write a method that accepts a string variable that holds some text.
    The method returns true if there are more lowercase than uppercase
    otherwise return false. Use recursion
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text");
        String text = sc.nextLine();

        System.out.println(moreChars(text,0,0,0));
    }

    static boolean moreChars(String text, int low, int upper, int i ){
        if(i == text.length()){
            if(low>upper){
                return true;
            }else{
                return false;
            }
        }
        if(text.charAt(i) >= 'a' && text.charAt(i) <= 'z'){
            low +=1;
        }else{
            if(text.charAt(i) >='A' && text.charAt(i) <='Z'){
                upper +=1;
            }
        }
        return moreChars(text,low,upper, i +1);
    }
}
