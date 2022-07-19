public class Task12Recursion {
    /*
    Задача 12: Да се състави програма, която извежда всички
естествени трицифрени числа, които нямат еднакви цифри т.е.
100,101, 606 и т.н. не се извеждат.
     */
    public static void main(String[] args) {
//        for(int i =100; i<1000;i++){
//            int stotici = i/100;
//            int desetici = i /10 % 10;
//            int edinici = i %10;
//            if(stotici != desetici && stotici != edinici && edinici != desetici){
//                System.out.println(i);
//    }
//            }
        differentNum(100);
        }

    static void differentNum(int start) {
        if (start > 999) {
            return;
        }
        int stotici = start / 100;
        int desetici = start / 10 % 10;
        int edinici = start % 10;
        if (stotici != desetici && stotici != edinici && edinici != desetici) {
            System.out.println(start);
        }
        differentNum(start+1);
    }

}
