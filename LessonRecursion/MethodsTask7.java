public class MethodsTask7 {
    public static void main(String[] args) {
        char[] arr = {'o','.',',','m','t'};
        System.out.println(numsInArray(arr));
    }

    static int numsInArray(char[] array){
        int count =0;
        for(int i =0; i<array.length; i++){
            if(array[i] >= '0' && array[i] <='9'){
                count++;
            }
        }
        return count;
    }
}
