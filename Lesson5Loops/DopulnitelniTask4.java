import java.util.Scanner;

public class DopulnitelniTask4 {
    /*
    4. Да се състави програма, която по въведени три цели числа – ден, месец и година,
проверява колко дни са изминали от началото на годината до въведената дата.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day;
        int month;
        int year;
        boolean visokosnaGodina;
        do {
            System.out.println("Input day:");
            day = sc.nextInt();
            System.out.println("Input a month:");
            month = sc.nextInt();
            System.out.println("Input a year:");
            year = sc.nextInt();
            visokosnaGodina = (year % 4==0 && (year % 400 ==0 || year %100 !=0));

        }while (((month ==1 || month ==3 || month == 5 || month ==7 || month == 8 || month ==10 || month==12)
                && (day >31 || day<1)) || ((month ==4 || month ==6 || month ==9 || month ==11) && (day>30 || day <1))
                || (month ==2 && !visokosnaGodina && day >28) || (month ==2 && visokosnaGodina && day>29) ||
                (month <1 || month >12) || (day<1) || year <0
        );
        int result = 0;
        switch (month){
            case 1: result = day;
            break;
            case 2: result = 31+day;
            break;
            case 3: if(visokosnaGodina){
                result = 31+29 +day;
            }else {
                result = 31 +28 +day;
            }
                break;
            case 4: if(visokosnaGodina) {
                result = 2 * 31 + 29 + day;
            }else{
                result = 2*31 +28 +day;

            }break;
            case 5: if(visokosnaGodina){
                result = 2*31 + 29 + 30 +day;
            }else{
                result = 2*31 + 28 +30 +day;
            }break;
            case 6: if(visokosnaGodina){
                result = 3*31 + 29 +30 +day;
            }else{
                result = 3 * 31 + 28 +30 +day;
            }break;
            case 7: if(visokosnaGodina){
                result = 3*31 +29 + 2*30 + day;
            }else{
                result = 3*31 + 28 + 2*30 + day;
            }break;
            case 8:if(visokosnaGodina){
                result = 4*31 + 29 + 2*30 +day;
            }else{
                result = 4*31 + 28 + 2*30 + day;
            }break;
            case 9:if(visokosnaGodina){
                result = 5*31 + 29 + 2 * 30 +day;
            }else{
                result = 5*31 + 28 + 2*30 +day;
            }break;
            case 10:if(visokosnaGodina){
                result = 5 *31 + 29 + 3*30 + day;
            }else{
                result = 5*31 + 28 + 3*30 +day;
            }break;
            case 11:if(visokosnaGodina){
                result = 6*31 + 29 +3*30 +day;
            }else{
                result = 6*31 +28 + 3 *30 +day;
            }break;
            case 12:if(visokosnaGodina){
                result = 6*31 +29 + 4*30 + day;
            }else {
                result = 6*31+28 + 4*30 +day;
            }break;
        }
        System.out.println(result);
    }
}
