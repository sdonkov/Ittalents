package test;

public abstract class Human {
    private int age;

    static void opa(){
        System.out.println("Tropa bopa v human");
    }


    Human(){
        System.out.println("human constructor is invoked");
    }

    private int result(){
        return 3;
    };

    abstract int getNumber();
    public int method(){
        return 123;
    }
    protected abstract int getRow();
    private int sth(){
        return 12321;
    }
    abstract int aa();
}
