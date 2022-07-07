public class Task12 {

    /*
    Задача 12: Да се състави програма, която извежда всички
естествени трицифрени числа, които нямат еднакви цифри т.е.
100,101, 606 и т.н. не се извеждат.
     */
    public static void main(String[] args) {

        for (int i=100; i<1000;i++){
            int hundreds = i/100;
            int tens = (i % 100) /10;
            int units = i %10;
            if(hundreds != tens && hundreds != units && tens!= units){
                System.out.println(i);
            }
        }
    }
}
