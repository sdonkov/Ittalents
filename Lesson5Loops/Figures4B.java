public class Figures4B {

    public static void main(String[] args) {
        int a = 8;
        for(int row =0; row<a; row++){
            System.out.print("#");
            for(int column =a; column-1>row; column--){
                System.out.print(" ");
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
