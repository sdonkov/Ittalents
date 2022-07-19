import java.security.spec.PSSParameterSpec;

public class Task4LoopWithRecursion {
    /*
    Задача 4: Да се изведат на екрана числата от 10 до 1 в обратен
ред.
     */
    public static void main(String[] args) {
        reversed(10);
    }
    static void reversed(int start){
        if (start<1){
            return;
        }
        System.out.println(start);
        reversed(start - 1);
    }
}
