public class Figures8 {
    public static void main(String[] args) {

        for(int row=1;row<=9; row++){
            // if row 1,5,9
            if(row==1|| row== 5|| row ==9){
                for(int rep=0; rep<2; rep++){
                    System.out.print("+===");
                }
                System.out.print("+");

            }else{
                // row 2,3,4
                for(int dash=0; dash <3; dash++){
                    System.out.print("|");
                    for(int spaces=0; spaces<3; spaces++){
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
