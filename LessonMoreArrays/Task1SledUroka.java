public class Task1SledUroka {
    public static void main(String[] args) {
        int[][] masiv = {{16,12,12,16}, {16,10,8,12},{16,12,12,16},{10,16,8,10}};
        int max = 0;
        int current;
        int num = 0;

        current = masiv[0][0];

        for (int row = 0; row < masiv.length; row++) {
            for(int col = 0; col< masiv[row].length; col++){
                int count=0;
                for(int rowsAgain =0; rowsAgain<masiv.length; rowsAgain++) {
                    for (int colsAgain = 0; colsAgain < masiv[rowsAgain].length; colsAgain++) {
                        if (masiv[row][col] == masiv[rowsAgain][colsAgain]) {
                            count++;
                        }
                    }

                    }
                if(count > max){
                    max = count;
                    num = masiv[row][col];
                }
            }
        }
        System.out.println(num);
    }
}
