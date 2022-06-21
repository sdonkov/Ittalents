import java.util.Scanner;

public class Task5SledUroka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows;
        int collumns;
        int startRow=11;
        int startCollumn =11;
        do{
            System.out.println("Insert a positive number for rows:");
            rows = sc.nextInt();
            System.out.println("Insert a positive number for collumns");
            collumns = sc.nextInt();
        }while((rows <=0 || rows>9) || (collumns <=0 || collumns >9));

        for (int i =0; i<rows; i++){
//            System.out.print(startRow);
            for(int j =0; j<collumns; j++){
                System.out.print(startCollumn);
                System.out.print(" ");
                startCollumn++;
            }
            System.out.println();
            startRow +=10;
            startCollumn = startRow;
        }
    }
}
