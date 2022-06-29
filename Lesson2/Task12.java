import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Въведете ден");
        int day = sc.nextInt();
        System.out.println("Въведете месец");
        int month = sc.nextInt();
        System.out.println("Въведете година");
        int year = sc.nextInt();
        int nextDay;
        int nextMonth;
        int nextYear;

        boolean notValid = false;
        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
            if(day<1 || day >31){
                notValid = true;
                System.out.println("невалидна дата");
            }
        }else{
            if(month == 4 || month == 6 || month == 9 || month == 11){
                if(day<1 || day >30){
                    notValid = true;
                    System.out.println("невалидна дата");
                }
            }else{
                if(month ==2 && year >=100 && (year/4) % 4 !=0){
                    if(day >28 || day <1){
                        notValid = true;
                    System.out.println("невалидна дата");
                    }
                }else{
                    if(month == 2 && year % 4 != 0){
                        if(day > 28 || day <1){
                            notValid= true;
                            System.out.println("невалидна дата");
                        }
                    }else{
                        if(month == 2) {
                            if(day >29 || day <1){
                                notValid = true;
                                System.out.println("невалидна дата");
                            }
                        }else{
                                System.out.println("невалидна дата");
                        }
                    }
                }
            }
        }if(!notValid && month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
            nextDay = day +1;
            if(nextDay>31 && month== 12 && !notValid){
                nextDay = 1;
                nextMonth = 1;
                nextYear = year + 1;
                System.out.println(nextDay + ", " + nextMonth + ", " + nextYear);
            }else{
                if(nextDay>31){
                    nextDay = 1;
                    nextMonth = month +1;
                    nextYear =year;
                    System.out.println(nextDay + ", " + nextMonth + ", " + nextYear);
                }else {
                    nextMonth = month;
                    nextYear = year;
                    System.out.println(nextDay + ", " + nextMonth + ", " + nextYear);
                }
            }
        }else{
            if(!notValid && month == 4 || month == 6 || month == 9 || month == 11 && !notValid){
                nextDay = day +1;
                if(nextDay>30){
                    nextDay = 1;
                    nextMonth = month +1;
                    nextYear = year;
                    System.out.println(nextDay + ", " + nextMonth + ", " + nextYear);
                }else{
                    nextMonth = month;
                    nextYear = year;
                    System.out.println(nextDay + ", " + nextMonth + ", " + nextYear);
                }
            }else{
                if(month==2 && year >=100 && (year/4) % 4 !=0 && !notValid){
                    nextDay = day +1;
                    if(nextDay > 28){
                        nextDay = 1;
                        nextMonth = month +1;
                        nextYear = year;
                        System.out.println(nextDay + ", " + nextMonth + ", " + nextYear);
                    }else{
                        nextMonth = month;
                        nextYear = year;
                        System.out.println(nextDay + ", " + nextMonth + ", " + nextYear);
                    }
                }else{
                    if(month == 2 &&year % 4 != 0 && !notValid){
                        nextDay = day +1;
                        if(nextDay >28){
                            nextDay = 1;
                            nextMonth = month +1;
                            nextYear = year;
                            System.out.println(nextDay + ", " + nextMonth + ", " + nextYear);
                        }else{
                            nextMonth = month;
                            nextYear =year;
                            System.out.println(nextDay + ", " + nextMonth + ", " + nextYear);
                        }
                    }else {
                        if(month ==2 && year %4 ==0 && !notValid){
                            nextDay = day +1;
                            if(nextDay >29){
                                nextDay = 1;
                                nextMonth = month+1;
                                nextYear = year;
                                System.out.println(nextDay + ", " + nextMonth + ", " + nextYear);
                            }else{
                                nextMonth = month;
                                nextYear = year;
                                System.out.println(nextDay + ", " + nextMonth + ", " + nextYear);
                            }
                        }
                    }
                }
            }
        }
    }
}
