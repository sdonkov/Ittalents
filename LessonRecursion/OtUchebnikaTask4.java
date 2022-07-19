public class OtUchebnikaTask4 {
    public static void main(String[] args) {
        int[] arr= {1,2,5,4,13,20,50,13};
        boolean isRepeated = false;
        System.out.println(checkIfRepeated(arr, isRepeated, 0, 1));
//        for(int i =0; i< arr.length; i++){
//            for(int j = i+1; j<arr.length;j++){
//                if(arr[i] == arr[j]){
//                    isRepeated = true;
//                    break;
//                }
//            }
//        }
//        System.out.println(isRepeated);
    }

    static boolean checkIfRepeated(int[] arr, boolean isRepeated, int i, int j) {
        if( i == arr.length){
            return isRepeated;
        }

        isRepeated = oneByOne(arr, isRepeated, i,j);
        if(isRepeated){
            return true;
        }
        return checkIfRepeated(arr, isRepeated, i +1,j+1);
    }

    static boolean oneByOne(int[] arr, boolean isRepeated, int i, int j ){
        if(j == arr.length){
            return isRepeated;
        }
        if(arr[i] == arr[j]){
            return true;
        }
        return oneByOne(arr, isRepeated,i ,j +1);

    }
}
