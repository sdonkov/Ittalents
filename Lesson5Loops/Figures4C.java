public class Figures4C {
    public static void main(String[] args) {
        int a = 8;
        for (int row = 0; row < a; row++) {
//            System.out.print("#");
            for (int spaces = 0; spaces < row; spaces++) {
                System.out.print("  ");
            }
            for (int column = a; column > row; column--) {
                System.out.print("#");
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}