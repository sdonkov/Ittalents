import java.util.Scanner;

public class DemoBirthdates {

    /*
    да се състави програма, която приема за входни данни датите на раждане
    на двама човека. Програмата да изведе кой е по-голям, както и разликата
    във възрастта им. Да се използва while цикъл.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Birthdate of Ivan");
        System.out.println("Enter a day of birth");
        int day = sc.nextInt();
        System.out.println("Enter a month of birth");
        int month = sc.nextInt();
        System.out.println("Enter a year of birth");
        int year = sc.nextInt();

        System.out.println("Birthdate of Petar");

        System.out.println("Enter a day of birth");
        int dayPetar = sc.nextInt();
        System.out.println("Enter a month of birth");
        int monthPetar = sc.nextInt();
        System.out.println("Enter a year of birth");
        int yearPetar = sc.nextInt();


        boolean leapYearIvan = (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);
        boolean leapYearPetar = (yearPetar % 4 == 0) && (yearPetar % 400 == 0 || yearPetar % 100 != 0);
        int totalIvan;
        int totalPetar;
        int totalDay;
        int totalDayPetar;
        switch (month) {
            case 1:
                totalDay = day;
                break;
            case 2:
                totalDay = 31 + day;
                break;
            case 3:
                if (leapYearIvan) {
                    totalDay = 31 + 29 + day;
                } else {
                    totalDay = 31 + 28 + day;
                }
                break;
            case 4:
                if (leapYearIvan) {
                    totalDay = 31 + 29 + 31 + day;
                } else {
                    totalDay = 31 * 2 + 28 + day;
                }
                break;
            case 5:
                if (leapYearIvan) {
                    totalDay = 31 * 2 + 29 + 30 + day;
                } else {
                    totalDay = 31 * 2 + 28 + 30 + day;
                }
                break;
            case 6:
                if (leapYearIvan) {
                    totalDay = 31 * 3 + 29 + 30 + day;
                } else {
                    totalDay = 31 * 3 + 28 + 30 + day;
                }
                break;
            case 7:
                if (leapYearIvan) {
                    totalDay = (31 * 3) + (2 * 30) + 29 + day;
                } else {
                    totalDay = (31 * 3) + (2 * 30) + 28 + day;
                }
                break;
            case 8:
                if (leapYearIvan) {
                    totalDay = (31 * 4) + (2 * 30) + 29 + day;
                } else {
                    totalDay = (31 * 4) + (2 * 30) + 28 + day;
                }
                break;
            case 9:
                if (leapYearIvan) {
                    totalDay = (31 * 5) + (2 * 30) + 29 + day;
                } else {
                    totalDay = (31 * 5) + (2 * 30) + 28 + day;
                }
                break;
            case 10:
                if (leapYearIvan) {
                    totalDay = (31 * 5) + (3 * 30) + 29 + day;
                } else {
                    totalDay = (31 * 5) + (3 * 30) + 28 + day;
                }
                break;
            case 11:
                if (leapYearIvan) {
                    totalDay = (31 * 6) + (3 * 30) + 29 + day;
                } else {
                    totalDay = (31 * 6) + (3 * 30) + 28 + day;
                }
                break;
            case 12:
                if (leapYearIvan) {
                    totalDay = (31 * 6) + (4 * 30) + 29 + day;
                } else {
                    totalDay = (31 * 6) + (4 * 30) + 28 + day;
                }
                break;
            default:
                totalDay = day;
                break;

        }

        switch (monthPetar) {
            case 1:
                totalDayPetar = dayPetar;
                break;
            case 2:
                totalDayPetar = 31 + dayPetar;
                break;
            case 3:
                if (leapYearPetar) {
                    totalDayPetar = 31 + 29 + dayPetar;
                } else {
                    totalDayPetar = 31 + 28 + dayPetar;
                }
                break;
            case 4:
                if (leapYearPetar) {
                    totalDayPetar = 31 + 29 + 31 + dayPetar;
                } else {
                    totalDayPetar = 31 * 2 + 28 + dayPetar;
                }
                break;
            case 5:
                if (leapYearPetar) {
                    totalDayPetar = 31 * 2 + 29 + 30 + dayPetar;
                } else {
                    totalDayPetar = 31 * 2 + 28 + 30 + dayPetar;
                }
                break;
            case 6:
                if (leapYearPetar) {
                    totalDayPetar = 31 * 3 + 29 + 30 + dayPetar;
                } else {
                    totalDayPetar = 31 * 3 + 28 + 30 + dayPetar;
                }
                break;
            case 7:
                if (leapYearPetar) {
                    totalDayPetar = (31 * 3) + (2 * 30) + 29 + dayPetar;
                } else {
                    totalDayPetar = (31 * 3) + (2 * 30) + 28 + dayPetar;
                }
                break;
            case 8:
                if (leapYearPetar) {
                    totalDayPetar = (31 * 4) + (2 * 30) + 29 + dayPetar;
                } else {
                    totalDayPetar = (31 * 4) + (2 * 30) + 28 + dayPetar;
                }
                break;
            case 9:
                if (leapYearPetar) {
                    totalDayPetar = (31 * 5) + (2 * 30) + 29 + dayPetar;
                } else {
                    totalDayPetar = (31 * 5) + (2 * 30) + 28 + dayPetar;
                }
                break;
            case 10:
                if (leapYearPetar) {
                    totalDayPetar = (31 * 5) + (3 * 30) + 29 + dayPetar;
                } else {
                    totalDayPetar = (31 * 5) + (3 * 30) + 28 + dayPetar;
                }
                break;
            case 11:
                if (leapYearPetar) {
                    totalDayPetar = (31 * 6) + (3 * 30) + 29 + dayPetar;
                } else {
                    totalDayPetar = (31 * 6) + (3 * 30) + 28 + dayPetar;
                }
                break;
            case 12:
                if (leapYearPetar) {
                    totalDayPetar = (31 * 6) + (4 * 30) + 29 + dayPetar;
                } else {
                    totalDayPetar = (31 * 6) + (4 * 30) + 28 + dayPetar;
                }
                break;
            default:
                totalDayPetar = dayPetar;
                break;
        }
        totalIvan = (year * 365) + totalDay;
        totalPetar = (yearPetar * 365) + totalDayPetar;
        int big;
        int less;
        if(totalIvan > totalPetar){
            big = totalIvan;
            less = totalPetar;
        }else {
            big = totalPetar;
            less = totalIvan;
        }
        int dateDiff =0;
        while(big >less){
            dateDiff++;
            less++;
        }
        System.out.println(dateDiff);

        int result;
        if (totalIvan > totalPetar) {
            result = totalIvan - totalPetar;
        } else {
            result = totalPetar - totalIvan;
        }

        System.out.println("Иван е роден на " + day + "." + month + "." + year);
        System.out.println("Петър е роден на " + dayPetar + "." + monthPetar + "." + yearPetar);
        if (totalIvan > totalPetar) {
            System.out.println("Петър е по-голям от Иван с " + result + " дни");
        } else {
            System.out.println("Иван е по-голям от Петър с " + result + " дни");
        }

        System.out.println(result);
    }
}