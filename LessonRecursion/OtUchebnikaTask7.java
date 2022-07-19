import java.util.Scanner;

public class OtUchebnikaTask7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter start");
        int start = sc.nextInt();
        System.out.println("Enter bound");
        int end = sc.nextInt();

//        for(int i = start; i<=end; i++){
//            for(int j =start; j <=i;j++){
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }


        print(start,end,start,start);
    }

    static void print(int start, int end,int i,int j ){
        if(i>end){
            return;
        }

        printRow(j,i);
        System.out.println();

        print(start,end,i+1,j);

    }

    static void printRow(int j,int i ){
        if(j>i) {
            return;
        }
        System.out.print(j + " ");


        printRow(j+1,i);
    }



    }

