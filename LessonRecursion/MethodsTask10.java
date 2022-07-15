public class MethodsTask10 {
    public static void main(String[] args) {
        int[] arr1={100};
        int[] arr2 = {3,5,6,7,9};

        int[] result = sortedArray(arr1,arr2);
        for(int i =0; i <result.length; i++){
            System.out.print(result[i]+ " ");
        }
    }

    static int[] sortedArray(int[] arr1, int[] arr2){
        int[] result = new int[arr1.length + arr2.length];

        int indexFirstArray=0;
        int indexSecondArray=0;
        int index =0;

        while(indexFirstArray < arr1.length && arr2.length > indexSecondArray){
            if(arr1[indexFirstArray] > arr2[indexSecondArray]){
                result[index] = arr2[indexSecondArray];
                indexSecondArray++;
            }else{
                result[index] = arr1[indexFirstArray];
                indexFirstArray++;
            }
            index++;
        }
        while(arr1.length>indexFirstArray){
            result[index] = arr1[indexFirstArray];
            index++;
            indexFirstArray++;
        }
        while(arr2.length > indexSecondArray){
            result[index] = arr2[indexSecondArray];
            index++;
            indexSecondArray++;
        }
        return result;
    }
}
