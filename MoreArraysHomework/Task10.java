public class Task10 {
    /*
 10. Напишете програма, която намира най-често срещания елемент
в масив. Пример: {4, 1, 1, 4, 2, 3,4, 4, 1, 2, 4, 9, 3} => 4 (5 times).
     */
    public static void main(String[] args) {
        int[] array = {1,3,2,5,5,5,1,5,1};

        int maxCount = 1;
        int maxNum = array[0];

        for(int i =0;i< array.length; i++){
            int countedNum = array[i];
            if(countedNum == maxNum){
                continue;
            }
            int count = 0;
            for(int j =i; j<array.length; j++){
                if(array[j] == countedNum){
                    count++;
                }
            }
            if(count > maxCount){
                maxCount = count;
                maxNum = countedNum;
            }
        }
        System.out.println(maxNum + " se sreshta " + maxCount + " puti");
    }
}