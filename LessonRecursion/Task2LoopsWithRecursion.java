public class Task2LoopsWithRecursion {
    /*
    Задача 2: Да се изведат на екрана числат от -20 до 50.
     */

    public static void main(String[] args) {
        printResult(-20);
    }

    static void printResult(int startNum){
        if(startNum>50){
            return;
        }
        System.out.println(startNum);
        printResult(startNum+1);
    }
}
