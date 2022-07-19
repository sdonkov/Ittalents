import java.util.Scanner;

public class Task4SledUroka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows");
        int rows = sc.nextInt();
        System.out.println("Enter cols");
        int cols = sc.nextInt();

        int[][] matrix =giveMatrix(rows,cols);
        for(int i =0; i<matrix.length; i++){
            for(int j =0; j<matrix[0].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    static int[][] giveMatrix(int rows, int cols){
        int[][] matrix = new int[rows][cols];
        for(int i=0; i < matrix.length; i++){
            for(int j =0; j<matrix[i].length; j++){
                matrix[i][j] = 0;
            }
        }
        return matrix;
    }

}
