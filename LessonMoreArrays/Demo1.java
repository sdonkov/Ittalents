public class Demo1 {
    public static void main(String[] args) {

        int[] arr = { 2, 1, 4, 3, 8, 6, 13 };
        boolean isZigUp = true;

        for (int i = 1; i < arr.length; i += 2) {

            if (arr.length % 2 == 0 && i == arr.length - 1) {
                if (arr[i] <= arr[i - 1]) {
                    isZigUp = false;
                    break;
                }
            } else {
                if (arr[i] <= arr[i - 1] && arr[i] <= arr[i + 1]) {
                    isZigUp = false;
                    break;
                }
            }
        }

        System.out.println(isZigUp ? "The array is a ZigUpArray." : "The array is not a ZigUpArray.");

    }

}
