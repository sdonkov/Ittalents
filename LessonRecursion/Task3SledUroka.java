public class Task3SledUroka {
    public static void main(String[] args) {
        int[] array = {2,5,3,1,5,0};
        int[] array2 = {512,412,21,-4,-5,0,2};

        int[] array3 = allElements(array, array2);
        for(int i =0; i< array3.length; i++){
            System.out.print(array3[i] + " ");
        }

    }

    static int[] allElements(int[] arr1, int[] arr2){
        int[] arr3 = new int[arr1.length + arr2.length];
        int secondStart =0;
        for(int i =0;i< arr3.length; i++){
            if(i >= arr1.length){
                arr3[i] = arr2[secondStart];
                secondStart++;
            }else{
                arr3[i] = arr1[i];
            }
        }
        return arr3;
    }
}
