public class Task20Recursion {
    /*
    Задача 20:
Да се състави програма, чрез която се извежда квадрат от
цифри. Сумите от елементите на произволен ред или стълб са
равни на 45.
     */
    public static void main(String[] args) {

        figure(1);
    }

    static void figure(int row){
        if(row>10){
            return;
        }
        for (int column = row; column < 10 + row; column++) {
            if (column >= 10) {
                System.out.print(column % 10 + " ");
            } else {
                System.out.print(column + " ");
            }
        }
        System.out.println();
        figure(row+1);

    }
}
