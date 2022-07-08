public class Task23 {
    /*
    Задача 23:
Да се състави програма, която чрез цикъл while извежда
таблицата за умножение, но без повторение.
Т.е. ако е изведено 4*5 не се извежда 5*4.
     */

    public static void main(String[] args) {
//        int startNum =1;
//        int controlingNum =1;
//        while(startNum<10){
//            for(int num = controlingNum; num<10;num++){
//                System.out.print(startNum + "*" + num + ";");
//            }
//            System.out.println();
//            startNum++;
//            controlingNum++;
//        }
        int start = 1;
        int end =1;
        while (start<10){
            System.out.print(start + "*" + end + ";");
            if(end ==9){
                System.out.println();
                end = ++start;
            }else{
                end++;
            }
        }
    }
}


/*
        int numA = 1;
        int numB =1;
        while(numA<10){
            System.out.print(numA + "*" + numB +";");
            numB++;
            if(numB>9){
                numB = ++ numA;
                System.out.println();
 */