public class Task2SledUroka {
    public static void main(String[] args) {
        int[][] masiv = {{16,12,12,16}, {16,10,8,12},{4,7,1,4},{5,6,2,3}};
        int sumFirstDiagonal = 0;
        int sumSecondDiagonal =0;

        for (int row = 0; row < masiv.length; row++) {
            for(int col = 0; col< masiv[row].length; col++){
                if(col == row){
                    sumFirstDiagonal += masiv[row][col];
                }else {
                    if(col + row == masiv.length-1){
                        sumSecondDiagonal += masiv[row][col];
                    }
                }
            }
        }
//        int n = masiv.length;
//        for(int row =0; row <masiv.length; row++){
//           sumSecondDiagonal += masiv[row][masiv.length -  (row + 1)];
//        }
        System.out.println(sumFirstDiagonal);
        System.out.println(sumSecondDiagonal);
    }
}
