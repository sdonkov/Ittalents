package test;

public class Testing /*extends test.Person*/ implements Runnable{
//    test.Testing(int age) {
//        super(age);
//    }
    private String value;
    private static int count;

    private class Inner{
        private static String name = "ittalents";
        private String age = "Twenty";

        void print(){
            System.out.println(count);
            System.out.println(value);
            System.out.println(name);
        }
    }

    @Override
    public void run() {
        System.out.println("running");
    }

}
