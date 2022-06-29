public class Figures7A {
    public static void main(String[] args) {
        int num =8;
        int stepeniNaDvoikata=1;

        //rows
        for(int rows =1; rows <=num ; rows++){

            // spaces
            for(int spaces =rows; spaces < num; spaces++){
                System.out.print("    ");
            }
            //  left nums
            for(int startNum = stepeniNaDvoikata; startNum <= rows; startNum++){
                System.out.print(stepeniNaDvoikata);
                if (stepeniNaDvoikata*2 >10 && stepeniNaDvoikata* 2 <100 && startNum +1<=rows){
                    System.out.print("  ");
                }else {
                    if(stepeniNaDvoikata * 2 >100 && startNum +1 <=rows){
                        System.out.print(" ");
                    }else{
                        if (stepeniNaDvoikata /2 >10&& startNum+1 >rows){
                            System.out.print("  ");
                        }else{
                            System.out.print("   ");
                        }

                    }
                }

                stepeniNaDvoikata *=2;
            }
            for(int rightNum = stepeniNaDvoikata/4; rightNum >0 ; rightNum /=2){
                System.out.print(rightNum);
                if(rightNum/2 > 10){
                    System.out.print("  ");
                }else{
                    System.out.print("   ");
                }

            }

            System.out.println();
            stepeniNaDvoikata=1;

        }
    }
}
