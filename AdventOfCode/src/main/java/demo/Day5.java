package demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class Day5 {

    public static void main(String[] args) {

        File file = new File("C:\\Users\\Karina\\IdeaProjects\\StringTest\\src\\day5.txt");
        try(Scanner sc = new Scanner(file)) {
            Stack<String> stack1 = new Stack<>();
            stack1.push("Q");
            stack1.push("F");
            stack1.push("M");
            stack1.push("R");
            stack1.push("L");
            stack1.push("W");
            stack1.push("C");
            stack1.push("V");
            Stack<String> stack2 = new Stack<>();
            stack2.push("D");
            stack2.push("Q");
            stack2.push("L");
            Stack<String> stack3 = new Stack<>();
            stack3.push("P");
            stack3.push("S");
            stack3.push("R");
            stack3.push("G");
            stack3.push("W");
            stack3.push("C");
            stack3.push("N");
            stack3.push("B");
            Stack<String> stack4 = new Stack<>();
            stack4.push("L");
            stack4.push("C");
            stack4.push("D");
            stack4.push("H");
            stack4.push("B");
            stack4.push("Q");
            stack4.push("G");
            Stack<String> stack5 = new Stack<>();
            stack5.push("V");
            stack5.push("G");
            stack5.push("L");
            stack5.push("F");
            stack5.push("Z");
            stack5.push("S");
            Stack<String> stack6 = new Stack<>();
            stack6.push("D");
            stack6.push("G");
            stack6.push("N");
            stack6.push("P");
            Stack<String> stack7 = new Stack<>();
            stack7.push("D");
            stack7.push("Z");
            stack7.push("P");
            stack7.push("V");
            stack7.push("F");
            stack7.push("C");
            stack7.push("W");
            Stack<String> stack8 = new Stack<>();
            stack8.push("C");
            stack8.push("P");
            stack8.push("D");
            stack8.push("M");
            stack8.push("S");
            Stack<String> stack9 = new Stack<>();
            stack9.push("Z");
            stack9.push("N");
            stack9.push("W");
            stack9.push("T");
            stack9.push("V");
            stack9.push("M");
            stack9.push("P");
            stack9.push("C");
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                String[] separated = line.split(" ");
                int crates = Integer.parseInt(separated[1]);
                System.out.println(crates);
                int from = Integer.parseInt(separated[3]);
                int to = Integer.parseInt(separated[5]);
                Stack<String> fromStack = new Stack<>();
                Stack<String> toStack = new Stack<>();
                switch (from) {
                    case 1 -> fromStack = stack1;
                    case 2 -> fromStack = stack2;
                    case 3 -> fromStack = stack3;
                    case 4 -> fromStack = stack4;
                    case 5 -> fromStack = stack5;
                    case 6 -> fromStack = stack6;
                    case 7 -> fromStack = stack7;
                    case 8 -> fromStack = stack8;
                    case 9 -> fromStack = stack9;
                }
                switch (to) {
                    case 1 -> toStack = stack1;
                    case 2 -> toStack = stack2;
                    case 3 -> toStack = stack3;
                    case 4 -> toStack = stack4;
                    case 5 -> toStack = stack5;
                    case 6 -> toStack = stack6;
                    case 7 -> toStack = stack7;
                    case 8 -> toStack = stack8;
                    case 9 -> toStack = stack9;
                }
                for (int i = 0; i < crates; i++) {
                    String moved = fromStack.pop();
                    toStack.push(moved);
                }
            }
            System.out.println(stack1);
            System.out.println(stack2);
            System.out.println(stack3);
            System.out.println(stack4);
            System.out.println(stack5);
            System.out.println(stack6);
            System.out.println(stack7);
            System.out.println(stack8);
            System.out.println(stack9);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        //VWLCWGSDQ
    }
}
