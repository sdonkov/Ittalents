package demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day3 {

    public static void main(String[] args) {

        File file = new File("C:\\Users\\Karina\\IdeaProjects\\StringTest\\src\\day3.txt");
        try(Scanner sc = new Scanner(file)) {
            int points = 0;
            int counter = 0;
            while(sc.hasNextLine()){
                String oneLine = sc.nextLine();
                String secondLine = sc.nextLine();
                String thirdLine = sc.nextLine();
//                String firstPart = oneLine.substring(0, (oneLine.length() / 2));
//                String secondPart = oneLine.substring((oneLine.length()/ 2), oneLine.length());
                Character same = ' ';
                for (int i = 0; i < oneLine.length(); i++) {
                    char firstPartChar = oneLine.charAt(i);
                    for (int j = 0; j < secondLine.length(); j++) {
                        char secondPartChar = secondLine.charAt(j);
                        for (int k = 0; k < thirdLine.length(); k++) {
                            char thirdPartChar = thirdLine.charAt(k);
                            if(firstPartChar == secondPartChar && secondPartChar == thirdPartChar) {
                                same = firstPartChar;
                            }
                        }
                    }
                }
                System.out.println(same);
//                System.out.println(points);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
