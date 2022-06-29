public class Figures7B {
    public static void main(String[] args) {

        int num = 7;
        // rows
        int startNum=1;
        for (int rows = 0; rows<num; rows++){

            // left nums
            startNum =1;
            for(int columns =0; columns<= rows; columns++){
                System.out.print(startNum);
                System.out.print(" ");
                startNum = startNum * ( rows - columns) / (columns +1);
            }
            System.out.println();
//            startNum=rows -1;
        }
    }
}
