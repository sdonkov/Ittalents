import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class DopulnitelniTask7 {
    /*
    7. Да се създаде програма, която по предварително създадени 2 променливи: noun и number,
отпечатва в конзолата следното:
Пример: noun: cat, number = 5; -> 5 cats
Пример: noun: dog, number = 1; -> 1 dog
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert a noun:");
        String noun = sc.nextLine();
        System.out.println("Insert a number:");
        int num = sc.nextInt();
        if(num >1){
            noun = noun +"s";
        }
        System.out.println(num + " " + noun);
    }
}
