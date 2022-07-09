import java.util.Scanner;

public class Task2SledUroka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] masiv1 = {5, 8 , 12 ,3, 4};
        int[] masiv2 = {4, 3, 12,8,5};
        int[] masivOburnat1 = new int[masiv1.length];
        boolean ogledalni = true;

        //davane na stoinosti na masiv1
//        for (int i = 0; i <masiv1.length ; i++) {
//            masiv1[i] = sc.nextInt();
//        }
//        // za vtoriq masiv
//        for(int i = 0; i<masiv2.length; i++){
//            masiv2[i] = sc.nextInt();
//        }
        // da se proveri dali purviq oburnat naobratno

//        for(int i=0, y =4; i <masiv1.length && y>=0; i++, y--){
//            masivOburnat1[i] = masiv1[y];
//        }
        for (int i = 0, y =4; i <masiv1.length && y>=0 ; i++, y--) {
            if(masiv1[y] != masiv2[i]){
                ogledalni = false;
                break;
            }
        }
        System.out.println(ogledalni ? "Masivut e ednakuv na oburnatiq" : "Masivut ne e ednakuv s oburnatiq");
    }
}
