public class MethodsTask9 {
    public static void main(String[] args) {
        int[] arr1={1,4,8,3};
        int[] arr2 = {3,9,7,5};
        int[] result = lowArray(arr1,arr2);
        for (int i =0; i<result.length; i++){
            System.out.print(result[i] + " ");
        }
    }

    static int[] lowArray(int[] arr1, int[] arr2){
        int[] result = new int[arr1.length];
        for(int i=0 ; i<arr1.length; i++){
            if(arr1[i] > arr2[i]){
                result[i] = arr2[i];
            }else{
                result[i] = arr1[i];
            }
        }
        return  result;
    }
}
