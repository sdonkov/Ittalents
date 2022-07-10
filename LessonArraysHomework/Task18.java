public class Task18 {
    /*
    Задача 18:
Дадени са два едномерни масива с естествени числа.
Да се състави програма, която сравнява всички числа с еднакви
индекси от двата масива и записва в трети масив, по-голямото от
двете числа.
Да се изведе съдържанието и на трите масива
Пример:
18,19,32,1,3, 4, 5, 6, 7, 8
1, 2, 3,4,5,16,17,18,27,11
Изход:
18,19,32 ,4,5,16,17,18,27,11
     */
    public static void main(String[] args) {
        int[] array1 = {18, 19, 32, 1, 3, 4, 5, 6, 7, 8};
        int[] array2 = {1, 2, 3, 4, 5, 16, 17, 18, 27, 11};
        int[] array3 = new int[array1.length];

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] > array2[i]) {
                array3[i] = array1[i];
            } else {
                array3[i] = array2[i];
            }
        }System.out.println("Array1:");
        for(int i =0; i<array1.length; i++){

            System.out.print(array1[i] + " ");
        }
        System.out.println();
        System.out.println("Array 2:");
        for(int i =0; i<array2.length; i++){

            System.out.print(array2[i] +" ");
        }
        System.out.println();
        System.out.println("Array with bigger numbers:");
        for(int i =0; i<array3.length; i++){
            System.out.print(array3[i] + " ");
        }
    }
}