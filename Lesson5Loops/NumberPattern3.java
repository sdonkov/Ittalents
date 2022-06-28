public class NumberPattern3 {
    public static void main(String[] args) {

        for(int rows=1; rows <=5; rows++){

            for (int column =1; column <=5; column++){
                if(column % 2 !=0){
                    System.out.print("0");
                    System.out.print(" ");
                }else {
                    System.out.print("1");
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
