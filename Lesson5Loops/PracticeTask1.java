import java.util.Scanner;

public class PracticeTask1 {
    /*
    Напишете програма, която чете безброй двучислени числа. Програмата спира когато прочете 4
    последователни числа в нарастващ ред. Накрая програмата да принитера четирите числа
    и общия брой прочетени числа.
     */
    public static void main(String[] args) {
        int num;
        int previousNum = 1;
        int totalNums =0;
        int increasingNums = 0;
        String nums ="";
        Scanner sc = new Scanner(System.in);
        while(true){

            do{
                System.out.println("Enter a two digit number");
                num = sc.nextInt();
            }while(num<10 || num>99);


            if(num>previousNum){
                increasingNums +=1;
                totalNums+=1;
                nums = nums + num +" ";
                if(increasingNums==4){
                    break;
                }

                }else{
                increasingNums=1;
                totalNums+=1;
                nums = num + " ";
            }
            previousNum = num;
        }
        System.out.println(nums);
        System.out.println(totalNums);


    }
}
