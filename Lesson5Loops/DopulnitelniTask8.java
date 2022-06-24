import java.util.Scanner;

public class DopulnitelniTask8 {
    /*8. Да се създаде програма, която по предварително създадени 2 променливи – xa, ya, да
    определи в кой квадрант лежи точката А с координати – стойностите на променливите.

       */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input value for xa:");
        int x = sc.nextInt();
        System.out.println("Input value for ya:");
        int y = sc.nextInt();
        if(x>0 && y>0){
            System.out.println("1ви квадрант");
        }else{
            if(x<0 && y >0){
                System.out.println("2ри квадрант");
            }else{
                if(x<0 && y<0){
                    System.out.println("3ти квадрант");
                }else{
                    if(x>0 && y <0){
                        System.out.println("4ти квадрант");
                    }else {
                        if(x==0){
                            System.out.println("ордината");
                        }else {
                            System.out.println("абсциса");
                        }
                    }
                }
            }
        }
    }
}
