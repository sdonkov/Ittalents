public class Demo1 {
        public static void main(String[] args) {
            int x = 7;
            for (int row = 1; row <=x ; row++) {
                if (row == 1 || row == x) {
                    for (int allSymbols = 0; allSymbols < x; allSymbols++) {
                        System.out.print("#");
                        System.out.print(" ");
                    }
                } else {
//                System.out.println();
                    System.out.print("#");
                    for (int spaces = 1; spaces < x - 1; spaces++) {
                        System.out.print("  ");
                    }
                    System.out.print(" ");
                    System.out.print("#");
                }
                System.out.println();
            }
        }
    }