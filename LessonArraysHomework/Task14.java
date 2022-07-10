public class Task14 {
    /*
    Задача 14:
Имате предварително въведен едномерен масив, съдържащ реални
числа.
Да се състави програма, чрез която се избират само елементи от
масива със стойности от интервала [-2.99..2.99] и се отпечатват в нов
масив. Новият масив да се извежда на екрана.
Пример: 7.1,8.5,0.2,3.7,0.99,1.4,-3.5,-110,212,341,1.2
Изход: 0.2; 0.99; 1.4; 1.2

     */
    public static void main(String[] args) {
       double[] array = {7.1,8.5,0.2,3.7,0.99,1.4,-3.5,-110,212,341,1.2};
       int count=0;
       for(int i =0; i<array.length; i++){
           if(array[i]<=2.99 && array[i] >=-2.99){
               count++;
           }
       }
       double[] newArray = new double[count];
       int index=0;
       for(int i =0; i<array.length; i++){
           if(array[i]<=2.99 && array[i] >=-2.99){
               newArray[index] = array[i];
               index++;
           }
       }
       if(newArray.length>0) {
           for (int i = 0; i < newArray.length; i++) {
               System.out.print(newArray[i] + "; ");
           }
       }else{
           System.out.println("No numbers in this range");
       }
    }
}