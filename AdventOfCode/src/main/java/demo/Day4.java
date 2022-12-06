package demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day4 {

    public static void main(String[] args) {

        File file = new File("C:\\Users\\Karina\\IdeaProjects\\StringTest\\src\\day4.txt");
        int counter = 0;
        int lines = 0;
        try(Scanner sc = new Scanner(file)) {
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                lines++;
                String[] pairs = line.split(",");
                String firstPair = pairs[0];
                String secondPair = pairs[1];
                if(checkIfContainsFully(firstPair, secondPair)){
                    counter++;
                    System.out.println(firstPair + " " + secondPair);
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println(counter);
        System.out.println(lines);
    }

    private static boolean checkIfContainsFully(String firstPair, String secondPair) {
        int firstNum = Integer.parseInt(firstPair.split("-")[0]);
        int secondNum = Integer.parseInt(firstPair.split("-")[1]);
        int thirdNum = Integer.parseInt(secondPair.split("-")[0]);
        int fourthNum = Integer.parseInt(secondPair.split("-")[1]);
        if( firstNum <= thirdNum && secondNum >= fourthNum ||
            firstNum >= thirdNum && secondNum <= fourthNum ||
            firstNum <= thirdNum && secondNum >= thirdNum ||
            firstNum >= thirdNum && secondNum >= fourthNum && firstNum <= fourthNum){
            return true;
        }
        return false;
    }
}
