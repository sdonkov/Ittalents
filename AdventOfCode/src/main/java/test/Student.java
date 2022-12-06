package test;

public class Student extends Human implements Test{

    static void opa(){
        System.out.println("Drugade tropa bopa");
    }
    Student(int age) {
        super();
    }

    public int test2(){
        return 321;
    }

    @Override
    public Human human() {
        return new Person(31);
    }

    @Override
    int getNumber() {
        return -123312;
    }

    @Override
    protected int getRow() {
        return 0;
    }

    @Override
    int aa() {
        return 0;
    }

    @Override
    public int test2(int x) {
        return 0;
    }
}
