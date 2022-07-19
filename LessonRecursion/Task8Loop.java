import java.util.Scanner;

public class Task8Loop {
    /*
    3
222
444
666
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int startNum = num-1;

        for(int i = 0; i <num; i++){
            for(int timesPrinted =0; timesPrinted<num; timesPrinted++){
                System.out.print(startNum);
            }
            System.out.println();
            startNum+=2;
        }
    }
}
