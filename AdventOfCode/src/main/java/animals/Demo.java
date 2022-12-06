package animals;

import java.util.Arrays;

public class Demo {

    public static void main(String[] args) {
        System.out.println(Pet.y);
        String str1 = "Hello World. This is a test.";
        String str2 = "This is my string";
        String str3 = str2.toUpperCase();
        System.out.println(str3);
        str3 = str2.replaceAll("String", "Test");
        System.out.println(str3);
        str1 = str1.split("\\.")[1].toLowerCase();
        str3 = str3.replaceAll("my", "a");
        System.out.println(Arrays.toString(Arrays.stream(str1.split(" ")).toArray()));
        str1 = str1.split(" ")[3];
        System.out.println(str3);
        System.out.println(Arrays.toString(Arrays.stream(str3.split(" ")).toArray()));
        str3 = str3.split(" ")[3];

        System.out.println(str1+":"+str2+":"+str3);


        Animal[] animals = new Animal[5];
        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Cat();
        animals[3] = new Dog();
        animals[4] = new Dog();

        for (int i = 0; i < animals.length - 1; i++) {
            Mammal mammal = (Mammal) animals[i];
            mammal.breath();
        }
    }
}
