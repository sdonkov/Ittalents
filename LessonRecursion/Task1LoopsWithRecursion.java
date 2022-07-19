public class Task1LoopsWithRecursion {
    /*
    Задача 1: Да се изведат на екрана числата от 1 до 100.
     */
    public static void main(String[] args) {
        printNums(1);

    }
    static void printNums(int start){
        if(start > 100){
            return;
        }
        System.out.println(start);

        printNums(start+1);
    }
}
