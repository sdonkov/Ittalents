package test;

public interface Test extends Testov{

    default void test(){
        System.out.println("testing here");
    };
    int test2(int x);

//    private void testing();

    public static void main(String[] args) {
        int i = 1;
        Person person = new Person(30);
        if (i == 1) System.out.println("x"); ;
        switch (i) {
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("one");i++;
            case 2:
                System.out.println("two");i++;
            case 3:
                System.out.println("three");i++;
            default:
                System.out.println("default");
        }
    }

}
