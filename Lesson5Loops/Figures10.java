public class Figures10 {
    public static void main(String[] args) {
        int num =5;
        int startingNum=1;

        for(int row=1; row<=num; row++) {

            // columns
            startingNum=row;
            for(int columns = 1; columns<=10; columns++) {
                System.out.print(startingNum);
                System.out.print(" ");
                startingNum=startingNum +row;
            }
            System.out.println();
        }
    }
}
