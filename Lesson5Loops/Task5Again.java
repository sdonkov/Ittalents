import java.util.Scanner;

public class Task5Again {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows;
        int columns;
        int rowsStart = 11;
        int columnStart=11;

        do{
            System.out.println("Insert number of rows between 1 and 9");
            rows = sc.nextInt();
            System.out.println("Insert number of columns between 1 and 9");
            columns = sc.nextInt();
        }while((rows<=0|| rows>9) || (columns<=0 || columns>9) );

        for(int i =0; i < rows; i++){
//            System.out.print(rowsStart);
            for(int column = 0; column <columns; column++){
                System.out.print(columnStart);
                System.out.print(" ");
                columnStart++;

            }
            System.out.println();
            rowsStart +=10;
            columnStart = rowsStart;
        }

    }
}
