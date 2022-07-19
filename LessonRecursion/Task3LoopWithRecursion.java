public class Task3LoopWithRecursion {
    /*
    Задача 3: Да се изведат на екрана всички нечетни числа от -10
до 10
     */
    public static void main(String[] args) {
        odd(-10);
    }

    static void odd(int start){
        if(start>10){
            return;
        }
        if(start % 2 != 0) {
            System.out.println(start);
        }
        odd(start + 1);
    }
}
