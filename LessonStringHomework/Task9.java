import java.util.Scanner;

public class Task9 {
    /*
    Задача 9:
Да се състави програма, чрез която по въведен низ съдържащ букви,
цифри, знак минус '-' се извежда сборът на въведените числа като се
отчита знакът '-' пред съответното число.
Вход: asd-12sdf45-56asdf100
Изход:
-12
45
-56
100
Сума = 77
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String text = sc.next();
        totalSum(text);
    }

    static void totalSum(String text){
        int sum =0;
        int currentNum=0;
        boolean isNegative = false;
        for(int i =0; i<text.length(); i++){
            if(text.charAt(i) =='-'){
                isNegative = true;
                if(currentNum > 0){
                    sum+= currentNum;
                    System.out.println(currentNum);
                    currentNum = 0;
                }
            }else{
                if(text.charAt(i) >= '0' && text.charAt(i) <='9'){
                    if(isNegative) {
                        currentNum = -( -(currentNum * 10) - -(text.charAt(i) - '0'));

                    }else{
                        currentNum = currentNum *10 + text.charAt(i) - '0' ;
                    }

                }else{
                    if(currentNum != 0){
                        System.out.println(currentNum);
                    }
                    sum+= currentNum;
                    currentNum=0;
                    isNegative = false;

                }
            }
        }
        if(currentNum !=0){
            System.out.println(currentNum);
            sum += currentNum;
            System.out.println("Сума = " + sum);
        }
    }
}
