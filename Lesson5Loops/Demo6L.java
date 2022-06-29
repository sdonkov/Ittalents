public class Demo6L {
        public static void main(String[] args) {
            int num = 5;
            int startRight = 0;
            int last = 1;

            for (int rows = 1; rows <= num; rows++) {

                //spaces
                for (int spaces = 0; spaces < num - rows; spaces++) {
                    System.out.print("  ");
                }
                //digits left side
                for (int leftDigit = rows; leftDigit <= 2 * rows - 1; leftDigit++) {
                    if(leftDigit==last){
                        for(int right = leftDigit -1; right >rows -1; right--){
                            System.out.print(right);
                            System.out.print(" ");
                        }
                    }
                    System.out.print(leftDigit);
                    System.out.print(" ");
                    }
                System.out.println();
                startRight += 2;
                last+=2;


                }
//                // digits right side
//                for (int rightSide = startRight; rightSide > rows - 1; rightSide--) {
//                    System.out.print(rightSide);
//                    System.out.print(" ");

                }
        }
