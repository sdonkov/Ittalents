public class MethodsTask8 {
    public static void main(String[] args) {
        int[] array = divideByFive();
        for(int i =0; i<array.length; i++){
            System.out.print(array[i] +" ");
        }
    }

    static int[] divideByFive(){

        int length = 0;

        for(int i=1; i<100; i++){
            if(i % 5==0){
                length++;
            }
        }
        int[] array = new int[length];
        int nula = 0;
        for(int i=1;i<100;i++){
            if(i % 5 ==0){
                array[nula]= i;
                nula++;
            }
        }
        return array;
    }
}
