package tasks;

import java.util.HashSet;

public class Test {

    public static void main(String[] args) {

        int[] arr = {6,3,8,10,2,9,1};
        int num = 13;
        findSumNum(arr,num);
    }

    private static boolean findSumNum(int[] arr, int target) {
        for (int i = 0; i < arr.length - 2; i++) {
            HashSet<Integer> set = new HashSet<>();
            int currSum = target - arr[i];
            for (int j = i+1; j < arr.length; j++){
                if (set.contains(currSum - arr[j])){
                    System.out.println(arr[i] + " " + (currSum - arr[j]) + " " + arr[j]);
                    return true;
                }
                set.add(arr[j]);
            }
        }
        return false;
    }
}
