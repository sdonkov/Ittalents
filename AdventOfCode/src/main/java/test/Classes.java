package test;

public class Classes {
    private String value;
    private static int count;
    private Inner inner;

    public Classes(){
        this.inner = new Inner();
    }

    public Inner getInner() {
        return inner;
    }

    void method(){
        Inner inner = new Inner();
        System.out.println(inner.word);
        System.out.println(Inner.x);
    }

    class Inner{
        private static String x = "text";
        private String word = "texting";

        private Inner(){

        }

        void printFromOuter(){
            System.out.println(value);
            System.out.println(count);
            System.out.println(word);
            System.out.println(x);
        }
    }
}
