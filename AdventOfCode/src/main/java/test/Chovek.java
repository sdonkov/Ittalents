package test;

public class Chovek extends Thread{

    @Override
    public void run() {
        System.out.println("running as a chovek");
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public interface FaceInter{
         int getNum();
    }

    public void returnX(){
        System.out.println("return X");
    }

    public void returnX(int a){

    }

//    public int returnX(int b){
//        return 3;
//    }
}
