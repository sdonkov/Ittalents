public class Figures4A {
    public static void main(String[] args) {
        int num = 8;
        for(int row =1; row<=num; row++){
            System.out.print("#");
            for(int column =0; column < row-1; column++){
                System.out.print(" ");
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
