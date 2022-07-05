public class Task2 {


    /*
     Task2. Write a program that prints all odd numbers between 0 and 50 and all even numbers
 * between 51 and 100.
     */

    public static void main(String[] args) {
        for(int odd = 1; odd<50; odd+=2){
            System.out.println(odd);
        }
        System.out.println("Now printing even numbers");
        for(int even =52; even<=100; even +=2){
            System.out.println(even);
        }
    }
}
