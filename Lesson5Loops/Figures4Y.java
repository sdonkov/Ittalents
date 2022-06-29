public class Figures4Y {
    public static void main(String[] args) {
        int a = 7;
        int outSpace = 0;
        int innerSpace = 7;
        int secondSpaces = 3;
        int secondPlus = 3;
        int lastSpaces = 1;
        int secondLastSpaces =3;

        for (int row = 0; row < a; row++) {
            if (row == 0 || row == a - 1) {
                for (int stars = 0; stars < a; stars++) {
                    System.out.print("#");
                    System.out.print(" ");
                }
            } else {
                if (row < a / 2) {
                    System.out.print("#");
                    for (int outerSpaces = 0; outerSpaces < outSpace; outerSpaces++) {
                        System.out.print(" ");

                    }
                    System.out.print("#");
                    outSpace++;
                    for (int innerSpaces = 0; innerSpaces < innerSpace; innerSpaces++) {
                        System.out.print(" ");

                    }
                    innerSpace -= 4;
                    System.out.print("#");
                    for (int lastSpace =0; lastSpace<lastSpaces; lastSpace++) {
                        System.out.print(" ");
                    }
                    System.out.print("#");
                    lastSpaces+=2;
                } else {
                    if (row == a / 2) {
                        System.out.print("#");
                        for (int spaces = 0; spaces < a - 2; spaces++) {
                            System.out.print(" ");
                        }
                        innerSpace -= 3;
                        System.out.print("#");
                        for (int lastSpace =0; lastSpace < lastSpaces; lastSpace++){
                            System.out.print(" ");
                        }
                        System.out.print("#");
                    } else {
                        System.out.print("#");
                        for (int i = 0; i < secondSpaces; i++) {
                            System.out.print(" ");
                        }
                        System.out.print("#");
                        secondSpaces -= 2;
                        for (int k = 0; k < secondPlus; k++) {
                            System.out.print(" ");
                        }
                        System.out.print("#");
                        secondPlus += 4;
                        for (int lastSpace =0; lastSpace<secondLastSpaces; lastSpace++){
                            System.out.print(" ");
                        }
                        System.out.print("#");
                        secondLastSpaces -=2;
                    }
                }
            }
            System.out.println();
            outSpace++;

        }
    }
}
