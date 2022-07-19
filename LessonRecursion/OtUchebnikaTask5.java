public class OtUchebnikaTask5 {
    public static void main(String[] args) {
        int[] array ={-123,4,8,10,2,13,-5,3};

        findMaxIndex(array,0,0);
    }

    static void findMaxIndex(int[] arr, int index, int maxIndex){
        if(index == arr.length){
            System.out.println("Index with max value is  " + maxIndex);
            return;

        }
        if(arr[index] > arr[maxIndex]){
            maxIndex = index;
        }

        findMaxIndex(arr,index+1,maxIndex);
    }
}
