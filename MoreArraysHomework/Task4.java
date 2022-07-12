import java.util.Arrays;

public class Task4 {
    /*
    4. Напишете програма, която сортира (подрежда елементите във
възходящ ред) масив, съдържащ само 0 и 1.
     */

    public static void main(String[] args) {
        int[] array = {1,1,1,0,0,1,1,1,0,0,1,0};
        int count = 0;

        for(int i =0; i<array.length; i++){
            if(array[i] == 0){
                count++;
            }
        }
        for(int i =0; i < array.length; i++){
            array[i] = i<count ? 0 : 1;
//            if(i<count){
//                array[i]=0;
//            }else{
//                array[i] =1;
//            }
        }
        System.out.println(Arrays.toString(array));
    }
}
