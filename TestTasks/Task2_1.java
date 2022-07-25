public class Task2_1 {

    public static void main(String[] args) {

        /*
        Да се напише метод, който взима изречение и го рамкира. В рамката всяка дума да е на нов ред

        "This is an impossible test"
       ************
       *This      *
       *is        *
       *an        *
       *impossible*
       *test      *
       ************
         */

        String text = "this is an impossible test";
        String longest = "";
        String[] words = text.split(" ");
        for (int i = 0; i < words.length; i++) {
            if(longest.length() < words[i].length()){
                longest = words[i];
            }
        }

        //print row:
        //print longest word + 2 stars
        System.out.println("*".repeat(longest.length()+2));
        //words times//print 1 star + 1 word + x spaces + 1 star
        for (int i = 0; i < words.length; i++) {
            System.out.print("*");
            System.out.print(words[i]);
            //print x spaces
            System.out.print(" ".repeat(longest.length() - words[i].length()));
            System.out.println("*");
        }
        //print longest word + 2 stars
        System.out.println("*".repeat(longest.length()+2));
    }
}
