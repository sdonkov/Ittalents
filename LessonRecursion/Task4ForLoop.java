public class Task4ForLoop {
    public static void main(String[] args) {
        int[] array = {6,0,11,16,18,20,20};
        boolean isRepeated = false;
        for(int n = 0; n< array.length; n++){
            for(int allNums =n+1; allNums< array.length; allNums++){
                if(array[n] == array[allNums]){
                    isRepeated=true;
                    break;
                }
            }
        }
        System.out.println(isRepeated? "Ima chisla, koito se povtarqt" : "Nqma povtarqshti se chisla");

    }
}
