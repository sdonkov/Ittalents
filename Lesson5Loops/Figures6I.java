public class Figures6I {
    public static void main(String[] args) {
        int num =8;
        int lastNum= num;
        // row
        for (int row =1; row<= num; row++) {

            // spaces
            for(int spaces = 0; spaces < row - 1; spaces++){
                System.out.print("  ");
            }

            // num
            for (int numStart = 1; numStart <= lastNum; numStart++) {
                System.out.print(numStart);
                System.out.print(" ");
            }
            // right side
            for(int rightSide = lastNum-1; rightSide>0; rightSide--){
                System.out.print(rightSide);
                System.out.print(" ");
            }

            System.out.println();
            lastNum--;
        }
    }
}
