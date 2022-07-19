public class Task23Recursion {
    /*
    Задача 23:
Да се състави програма, която чрез цикъл while извежда
таблицата за умножение, но без повторение.
Т.е. ако е изведено 4*5 не се извежда 5*4.
     */
    public static void main(String[] args) {
        table(1,1);
    }

    static void table(int start, int end) {
        if(start==10){
            return;
        }
        System.out.print(start + "*" + end + ";");
        if (end == 9) {
            System.out.println();
            end = ++start;
        } else {
            end++;
        }
        table(start, end);

    }
}
