//public class Demo1 {
//
//    public class Figures4E {
//        public static void main(String[] args) {
//            int a = 7;
//            int space = 0;
//            for (int row = 0;row <a;row++){
//
//                if(row==0 || row == a -1){
//                    for(int stars =0; stars<a-1; stars++){
//                        System.out.print("#");
//                        System.out.print(" ");
//                    }
//                }
//
//                for(int spaces =0; spaces < space;spaces++){
//                    System.out.print("  ");
//                }
//                System.out.print("#");
//                space++;
//                System.out.println();
//            }
//        }
//    }
//
//}


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