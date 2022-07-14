import java.util.Scanner;

public class Task4 {
    /*
    Задача 4:
Да се състави програма, чрез която по въведени трите имена на двама
човека разделени със запетая, се извежда чие име има по-голям сбор
от ASCII кодовете на съставящите името букви.
Пример: Anna Dosewa Asenowa, Iwo Peew Peew
Изход: Anna Dosewa Asenowa
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] array = sc.nextLine().split(",");
        String name1 = array[0];
        String name2 = array[1];
        int sum1=0;
        int sum2=0;
        for(int i =0; i <name1.length(); i++){
            sum1 += name1.charAt(i);
        }
        for(int i =0; i < name2.length();i++){
            sum2 += name2.charAt(i);
        }
        System.out.println(sum1 > sum2 ? name1 : name2.strip());

    }

}
