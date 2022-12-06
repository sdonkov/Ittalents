package demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day3Results {

    public static void main(String[] args) {

        int points = 0;
        File file = new File("C:\\Users\\Karina\\IdeaProjects\\StringTest\\src\\day3Result.txt");
        try(Scanner sc = new Scanner(file)) {
            while(sc.hasNextLine()){
                String same = sc.nextLine();
                char a = same.charAt(0);
                if(Character.isLowerCase(a)){
                    points += a - 96;
                    System.out.println(same + points);
                }else{
                    points+= a - 38;
                    System.out.println(same + points);
                }
            }
            System.out.println(points);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
