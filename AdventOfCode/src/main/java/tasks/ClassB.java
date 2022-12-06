package tasks;

public class ClassB extends Snippet{
    int x =20;
//    public ClassB(){}

    public ClassB(int x){
//        this();
        System.out.println(this.x = x++);
        System.out.println(super.x = x);
    }

//    public void xaxa(){
//        System.out.println("xexe");
//    }
}