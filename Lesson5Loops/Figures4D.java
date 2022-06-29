public class Figures4D {
    public static void main(String[] args) {
        int i = 8;
        int star=1;
        for (int row = 0; row < i; row++) {
            for (int spaces = i; spaces > row +1 ; spaces--) {
                System.out.print("  ");
            }for (int stars = 0; stars <star; stars++){
                System.out.print("#");
                System.out.print(" ");

            }
            System.out.println();
            star++;
//            i--;

        }
        }
    }
