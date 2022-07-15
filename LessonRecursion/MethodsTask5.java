public class MethodsTask5 {
    public static void main(String[] args) {
        int[] arr1 = {4,2,16,2,6};
        int[] arr2 = {13,50,4,14,7};

        int[] arr3 = multiplyArrays(arr1,arr2);

        for(int i =0; i<arr3.length;i++){
            System.out.print(arr3[i]+ " ");
        }
    }

    static int[] multiplyArrays(int[] arr1, int[] arr2){
        if(arr1.length == arr2.length){
        int[] arr3 = new int[arr1.length];
        for(int i =0; i<arr3.length;i++){
            arr3[i] = arr1[i] * arr2[i];
        }
        return arr3;
    }
        return new int[0];
    }

}
