public class Task2Uchebnik {
    public static void main(String[] args) {
        int[] array = {41,-10,1,2,3,-50,-1,55};
        int index = 1;
        int min = array[0];
        System.out.println(minNumber(array, index, min));
    }
    static int minNumber(int[] arr, int idx, int min) {
        if(idx == arr.length-1){
            return min;
        }
        if(min > arr[idx]){
            min = arr[idx];
        }
        return minNumber(arr,idx+1,min);
    }
}
