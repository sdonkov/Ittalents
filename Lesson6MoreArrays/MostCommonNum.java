public class MostCommonNum {
    public static void main(String[] args) {
        int[] arr = { 40, 50, 30, 40, 50, 30, 30 };
        int maxCount = 0;
        int max =0;
        for(int i =0; i<arr.length;i++){
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count>maxCount){
                maxCount = count;
                max = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(maxCount);
    }
}
