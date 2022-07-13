import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstText;
        do{
            System.out.println("Enter first text");
             firstText = sc.next();
        }while (firstText.length()>40);

        String secondText;
        do{
            System.out.println("Enter second text");
            secondText = sc.next();
        }while (secondText.length()>40);

        System.out.println(firstText.toUpperCase() + " " + firstText.toLowerCase());
        System.out.println(secondText.toUpperCase() + " " +secondText.toLowerCase());

        String text = "soti";
        text.toUpperCase();
        System.out.println(text);
        System.out.println(superBow());
    }

    static int superBow(){
        return 3;
    }
        }
