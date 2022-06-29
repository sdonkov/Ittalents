public class Figures4H {
    public static void main(String[] args) {
        int a=7;
        int outSpace =1;
        int innerSpace=7;
        int secondSpaces =4;
        int secondPlus = 3;

        for (int row =0; row<a; row++) {
            if (row == 0 || row == a - 1) {
                for (int stars = 0; stars < a; stars++) {
                    System.out.print("#");
                    System.out.print(" ");
                }
            } else {
                if (row < a / 2) {
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
                } else {
                    if (row == a / 2) {
                        for (int spaces = 0; spaces < a - 1; spaces++) {
                            System.out.print(" ");
                        }
                        innerSpace -= 3;
                        System.out.print("#");
                    }else{
                        for (int i=0; i<secondSpaces; i++){
                            System.out.print(" ");
                        }
                        System.out.print("#");
                        secondSpaces-=2;
                        for (int k =0; k<secondPlus; k++){
                            System.out.print(" ");
                        }
                        System.out.print("#");
                        secondPlus +=4;
                    }
                }
            }
            System.out.println();
            outSpace++;
        }
            }
        }

