package tasks;

import java.util.*;

public class Next {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int totalFigures = sc.nextInt();
        TreeMap<Character, Double> map =new TreeMap<>();
        map.put('r',0.0);
        map.put('c',0.0);
        map.put('s',0.0);
        double size;
        for (int i = 0; i < totalFigures; i++) {
            System.out.println("Enter figure");
            char fig = sc.next().charAt(0);
            if(fig == 'r'){
                System.out.println("Enter side a ");
                int sideA = sc.nextInt();
                System.out.println("Enter side b");
                int sideB = sc.nextInt();
                size =sideA * sideB;
                if(map.get('r') < size){
                    map.put('r',size);
                }
            }else {
                if (fig == 'c') {
                    System.out.println("Enter size");
                    int side = sc.nextInt();
                    size = side*side * 3.14;
                    if(map.get('c') < size){
                        map.put('c',size);
                    }
                }
                else{
                    System.out.println("Enter size");
                    int side = sc.nextInt();
                    size = side *side;
                    if(map.get('s') < size){
                        map.put('s',size);
                    }
                }
            }
        }
        ArrayList<Map.Entry<Character,Double>> list = new ArrayList<>();
        list.addAll(map.entrySet());
        Collections.sort(list,((o1, o2) -> Double.compare(o2.getValue(),o1.getValue())));
        System.out.println(list.get(0));
    }
}
