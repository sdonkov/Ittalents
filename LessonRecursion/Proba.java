public class Proba {
    public static void main(String[] args) {
        int[] array ={-123,4,8,10,2,13,-5,3};

        System.out.println(maxIndex(array,0));
    }

    static int maxIndex(int[] array, int index){
        if(index == array.length - 1){
            return  index;
        }
        int maxIndex = maxIndex(array, index +1);

        if(array[index] > array[maxIndex]){
            return  index;
        }else{
            return maxIndex;
        }
    }
}
