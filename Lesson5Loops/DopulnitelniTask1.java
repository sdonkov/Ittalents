import java.util.Scanner;

public class DopulnitelniTask1 {
    /*
    1. Да се състави програма, която по предварително създадени променливи – страни на
триъгълник, отпечатва лицето на този триъгълник, както и неговия периметър.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a;
        double b;
        double c;
        do {
            System.out.println("Insert a positive number for a:");
            a = sc.nextDouble();
            System.out.println("Insert a positive number for b:");
            b = sc.nextDouble();
            System.out.println("Insert a positive number for c:");
            c = sc.nextDouble();
        }while(a<=0 || b<=0 || c<=0);

        if((a+b>c) && (a+c >b) && (b+c >a)){
            double s =(a+b+c)/ 2;
            double area = Math.sqrt(s* (s-a) * (s-b) * (s-c));
            System.out.format("%.2f\n",area);
        }else {
            System.out.println("Not valid values for a triangle");
        }
        double perimter = a + b + c;
//        int area = a *b / 2;
        System.out.println(perimter);
//        System.out.println(area);
        }
}
