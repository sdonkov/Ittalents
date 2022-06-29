import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Въведете обема на резервоара в диапазона 10-9999:");
        int tank = sc.nextInt();
        int repetitions;
        if(tank >=10 && tank <10000){
            if (tank % 5 ==0) {
                repetitions = tank /5;
                System.out.println(repetitions +" пъти по 2 литра, " + repetitions + " пъти по 3 литра");
            }else{
                if(tank % 5 ==1){
                    repetitions = (tank /5) - 1;
                    System.out.println(repetitions +" пъти по 2 литра, " + repetitions + " пъти по 3 литра, "
                    + "допълнително 2 кофи от 3 литра");
                }else{
                    if(tank % 5 ==2){
                        repetitions = tank / 5;
                        System.out.println(repetitions +" пъти по 2 литра, " + repetitions + " пъти по 3 литра, "
                                + "допълнително кофа от 2 литра");
                    }else{
                        if(tank % 5 ==3){
                            repetitions = tank /5;
                            System.out.println(repetitions +" пъти по 2 литра, " + repetitions + " пъти по 3 литра, "
                                    + "допълнително кофа от 3 литра");
                        }else{
                            repetitions = tank / 5;
                            System.out.println(repetitions +" пъти по 2 литра, " + repetitions + " пъти по 3 литра, "
                                    + "допълнително 2 кофи от 2 литра");
                        }
                    }
                }
            }
        } else{
            System.out.println("Обемът не е в диапоза 10 - 9999, опитай пак");
        }
    }
}
