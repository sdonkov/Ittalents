package rakia;

import java.util.Random;

public class Demo {

    public static void main(String[] args) {

        Village village = new Village();
        Rakidjiq.village = village;
        Picker.village = village;
        for (int i = 0; i < 7; i++) {
            new Thread(new Picker("Goshkata "+i, 35+i)).start();
            if(i < 3){
                new Thread(new Rakidjiq("Bai Pesho"+i,67+i)).start();
            }
        }
        Statistik st = new Statistik();
        st.setDaemon(true);
        st.start();
        Statistik.village = village;
    }
}
