import java.util.Scanner;

public class Task11Hollow {
    /*
    Кaто допълнително упражнение – нарисувайте същия
триъгълник, но незапълнен.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("Enter a positive number");
            n = sc.nextInt();
        }while (n<1);

        int star=1;
        int spaces = n-1;
        int inSpaces =1;

        for(int row=1; row<=n; row++){
            // spaces
            for(int outSpaces=0; outSpaces < spaces; outSpaces++){
                System.out.print(" ");
            }
            if(row==1 || row ==n){
                for(int stars =0; stars<star; stars++){
                    System.out.print("*");
                }
            }else{
                System.out.print("*");
                for(int innerSpaces=0; innerSpaces<inSpaces; innerSpaces++){
                    System.out.print(" ");
                }
                System.out.print("*");
                inSpaces+=2;
            }
            System.out.println();
            star+=2;
            spaces--;

        }
    }
}
