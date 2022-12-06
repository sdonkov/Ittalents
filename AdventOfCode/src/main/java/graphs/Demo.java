package graphs;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Demo {

    public static void main(String[] args) {

        int[] frontier = {0,1,2,3,4,5};
        int frontierEnd = frontier[2];
        while(frontierEnd > 0){
            frontierEnd--;
            int currentVerr = frontier[frontierEnd];
            System.out.println(currentVerr);
            break;
        }

        var list = new LinkedList<String>();
        int x = 0;
        while(x != 10){
            x = new Random().nextInt(50);
            System.out.println(x);
        }
    }
}