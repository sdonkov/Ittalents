package demo;

import lombok.SneakyThrows;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintStream;
import java.util.Scanner;

public class Threadsss {

//    @SneakyThrows
    public static void main(String[] args) {
        int sum = 0;
        int maxSum = 0;
        File file = new File("C:\\Users\\Karina\\IdeaProjects\\StringTest\\src\\file.txt");
        System.out.println(file.exists());
        try(Scanner sc = new Scanner(file)){
            while (sc.hasNextLine()){
                String currentRow = sc.nextLine();
                System.out.println(currentRow);
                if(currentRow.isBlank()){
                    if(checkIfCurrentSumIsBiggerThanMax(sum,maxSum)){
                        maxSum = sum;
//                        if(maxSum == 70096){
//                            break;
//                        }
                    };
                    sum = 0;
                }
                else{
                    sum += Integer.parseInt(currentRow);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Kvo stana be");
        }
        System.out.println(maxSum);
    }

    private static boolean checkIfCurrentSumIsBiggerThanMax(int sum, int maxSum) {
        if(sum > maxSum){
            return true;
        }
        return false;
    }
}
