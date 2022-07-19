public class Task2ForLoop {
    public static void main(String[] args) {
        int[] masiv = {500,1,23,210,0,-5,-15,20,50,10000};
        int min = masiv[0];
        for(int i =0; i<masiv.length; i++){
            if(min > masiv[i]){
                min = masiv[i];
            }
        }
        System.out.println(min);
    }
}
