import java.util.Scanner;

public class ExamTask1Stefka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalCount = 0;
        int count =0;
        int biggestNum = 9;
        int[] result = new int[4];
        int idx=0;
        while (true) {
            int currentNum;
            do{
                System.out.println("Enter two digit number");
                currentNum = sc.nextInt();
                totalCount++;
            }while(currentNum <10 || currentNum > 100);

                count++;
                if(currentNum > biggestNum) {
                    biggestNum = currentNum;
                    result[idx] = currentNum;
                    idx++;
                }else{
                    count=1;
                    biggestNum = currentNum;
                    result = new int[4];
                    idx =0;
                    result[idx] = currentNum;
                    idx =1;
                }
                if(count ==4){
                    for(int i =0; i<result.length; i++){
                        System.out.print(result[i] + " ");
                    }
                    System.out.println();
                    System.out.println("Total checked nums " + totalCount);
                    break;
                }
        }
    }
}
