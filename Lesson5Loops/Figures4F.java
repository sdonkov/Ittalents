public class Figures4F {
    public static void main(String[] args) {
        int a = 7;
        int space = 1;
        for (int row = 0;row < a;row++){

            if(row==0 || row == a -1){
                for(int stars =0; stars<a; stars++){
                    System.out.print("#");
                    System.out.print(" ");
                }
            }else {

                for (int spaces = 0; spaces < space; spaces++) {
                    System.out.print("  ");
                }
                System.out.print("#");
                space++;

            } System.out.println();
        }
    }
}
