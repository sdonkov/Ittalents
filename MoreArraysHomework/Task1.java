public class Task1 {
    /*
    1. Напишете програма, която проверява дали в масив от цели
числа всички числа са неотрицателни.
     */
    public static void main(String[] args) {
        int[] array = {1, 42, 3, 2, 0, -6, 7, 8, 9, 4};
        boolean allArePositive = true;
        for(int i =0; i<array.length; i++){
            if(array[i] <0){
                allArePositive = false;
                break;
            }
        }
        System.out.println(allArePositive ? "All are positive" : "Not all are positve");
    }
}
