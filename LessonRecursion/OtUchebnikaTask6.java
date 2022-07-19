public class OtUchebnikaTask6 {
    public static void main(String[] args) {
        int num = 5634855;
//        int reversedNum =0;

//        while(num>0){
//            int currentNum = num % 10;
//            num = num/10;
//            reversedNum = reversedNum *10 + currentNum;
//        }
//        System.out.println(reversedNum);

        int reversedNum = reverseNum(num,0);
        System.out.println(reversedNum);
    }

    static int reverseNum(int num, int reversedNum){
        if(num<1){
            return reversedNum;
        }
        int currentNum = num % 10;
        num = num/10;
        reversedNum = reversedNum *10 + currentNum;

        return reverseNum(num,reversedNum);
    }
}
