public class Figure6G {
    public static void main(String[] args) {
        int num = 8;
        int startingNum = num;
        for (int row = 1; row<=num; row++){
            //starting num
            for(int startNum= startingNum; startNum>0; startNum--){
                System.out.print(startNum);
                System.out.print(" ");
            }
            System.out.println();
            startingNum--;

        }
    }
}
