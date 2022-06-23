import java.util.Scanner;

public class DopulnitelniTask5 {

    /*
    Да се съствави програма, която по предварително създадена променлива language, която
може да приема една от стойностите: ‘en’, ‘es’, ‘de’, ‘bg’, ‘缩写’ отпечатва в конзолата: Hello
World в съответния език.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text;
        System.out.println("Input a language:");
        text = sc.nextLine();

        if(text.equals("en")){
            System.out.println("Hello words");
        }else{
            if(text.equals("es")){
                System.out.println("Hola Mundo");
            }else{
                if(text.equals("de")){
                    System.out.println("Hallo Welt");
                }else{
                    if(text.equals("bg")){
                        System.out.println("Здравей свят");
                    }else{
                        if(text.equals("缩写")){
                            System.out.println("你好世界");
                        }
                    }
                }
            }
        }
    }
}
