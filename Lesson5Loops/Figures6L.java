import java.util.Scanner;

public class Figures6L {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        int startRight =0;
        int countLeft=1;
        for(int rows = 1; rows<=num; rows++){

            //spaces
            for(int spaces = 0; spaces< num -rows; spaces++){
                System.out.print("  ");
            }
            //digits left side
            for(int leftDigit = countLeft; leftDigit<=2*rows -1; leftDigit++){
                if(leftDigit>9){
                    System.out.print(leftDigit % 10);
                    System.out.print(" ");
                    continue;
                }
                System.out.print(leftDigit);
                System.out.print(" ");
                }
            // digits right side
            for (int rightSide = startRight; rightSide>rows-1;rightSide--) {
                    if(rightSide>9){
                        System.out.print(rightSide %10);
                        System.out.print(" ");
                        continue;
                    }
                System.out.print(rightSide);
                System.out.print(" ");

            }
            countLeft++;
            System.out.println();
            startRight+=2;



            }

        }
    }

