package test;

public abstract interface Testov {

    int test2();

    default void test(){
        System.out.println("testing in testov");
    }

    default int text(){
        System.out.println("aaxaxa");
        return 3;
    };

//    private abstract int x(){
//        System.out.println("axaxa");
//        return 3;
//    };

    Human human();

//    default int texting(){
//        System.out.println("text text");
//        return 3;
//    }

//    public abstract int testing();
}
