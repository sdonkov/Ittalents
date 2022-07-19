public class Task3Uchebnik {
    /*
    дали даден масив е монотонно нарастващ
     */
    public static void main(String[] args) {
        int[] array = {6,7,11,16,18,20,2,6,95};
        boolean isMonoton = true;

        for(int i =0; i < array.length - 1; i++){
            if(!(array[i] < array[i+1])){
                isMonoton= false;
                break;
            }
        }
        System.out.println(isMonoton? "motononen e " : "nqkav drug e masiva");
    }
}
