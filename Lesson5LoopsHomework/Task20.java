public class Task20 {
    /*
    Задача 20:
Да се състави програма, чрез която се извежда квадрат от
цифри. Сумите от елементите на произволен ред или стълб са
равни на 45.
     */

    public static void main(String[] args) {
            // 10 rows 10 column
            for (int row = 1; row <= 10; row++) {
                for (int column = row; column < 10 + row; column++) {
                    if (column >= 10) {
                        System.out.print(column % 10 + " ");
                    } else {
                        System.out.print(column + " ");
                    }
                }
                System.out.println();


                // 10 rows 10 columns
      /*  int numberLeft=1;
        for(int row =1;row<=10;row++){
            for (int column = row; column <=10; column++){
                if (column==10){
                    System.out.print("0 ");
                    for(int leftNums =1; leftNums<numberLeft; leftNums++)
                    {
                        System.out.print(leftNums + " ");
                    }numberLeft++;
                }else{
                    System.out.print(column + " ");
                }
            }
            System.out.println();
            */
            }
        }
    }

