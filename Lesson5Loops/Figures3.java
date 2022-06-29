public class Figures3 {
    public static void main(String[] args) {
        int start =1;
        System.out.print("* | ");
        for(int startingColumn =0; startingColumn<9;startingColumn++){
            System.out.print(start);
            System.out.print(" ");
            start++;
        }
        System.out.println();
        System.out.println("-------------------------------");
        for(int row =1; row<10;row++){
            System.out.print(row + " | " );
            for(int column =1; column<10;column++){
                System.out.print(row * column);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
