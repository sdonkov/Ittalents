public class NP8 {
    public static void main(String[] args) {

        for(int row =1; row<=5; row++){

            for(int column =1; column<=5; column++){

                if(((row == 1 || row==5) && (column ==1 || column == 5)) || (row==column)
                        || ((row !=3) && (row /2==column || column/2 == row))) {
                    System.out.print("1");
                    System.out.print(" ");
                }else{
                    System.out.print("0");
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
