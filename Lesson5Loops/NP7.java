public class NP7 {
    public static void main(String[] args) {

        for(int row=1; row<=5; row++){

            for(int column =1; column <=5; column++){
                if(column==3 || row==3){
                    System.out.print("0");
                    System.out.print(" ");
                }else{
                    System.out.print("1");
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
