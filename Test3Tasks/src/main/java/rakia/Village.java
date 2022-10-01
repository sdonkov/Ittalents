package rakia;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

public class Village {

    private HashMap<Fruit,Integer> firstCauldron = new HashMap<>();
    private HashMap<Fruit,Integer> secondCauldron = new HashMap<>();
    private HashMap<Fruit,Integer> thirdCauldron = new HashMap<>();
    private HashMap<Fruit,Integer> fourthCauldron = new HashMap<>();
    private HashMap<Fruit,Integer> fifthCauldron = new HashMap<>();
    private ArrayList<HashMap<Fruit,Integer>> ll = new ArrayList<>();
    private HashMap<Fruit,Integer> currentCauldron = new HashMap<>();
    private ArrayList<HashMap<Fruit,Integer>> readyForRakia = new ArrayList<>();
    private int rakiaMade = 0;

    Village(){
        ll.add(firstCauldron);
        ll.add(secondCauldron);
        ll.add(thirdCauldron);
        ll.add(fourthCauldron);
        ll.add(fifthCauldron);
    }
    public synchronized void add(Fruit f){
        if(rakiaMade > 10){
            Thread.currentThread().interrupt();
        }
        getCauldronWithSameFruit(f);
        currentCauldron.put(f,(currentCauldron.get(f)+1));
        System.out.println("V kazana ima  " + currentCauldron.get(f)+ " " + currentCauldron.keySet());
        if(currentCauldron.get(f) >= 10){
            notifyAll();
            if(!readyForRakia.contains(currentCauldron)) {
                readyForRakia.add(currentCauldron);
            }
            System.out.println("Ima gotov kazan za varene");
            System.out.println(readyForRakia);

            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("opa");
            }
        }

    }

    public synchronized void makeRakia(){
        while(readyForRakia.size() <= 0 ){
            if(rakiaMade > 10){
                Thread.currentThread().interrupt();
            }
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("A sega de");
                break;
            }
        }
        if(rakiaMade > 10){
            Thread.currentThread().interrupt();
        }
        for(Iterator<HashMap<Fruit, Integer>> it = readyForRakia.iterator();it.hasNext();){
            currentCauldron = it.next();
            for(Fruit f : currentCauldron.keySet()){
                System.out.print("NAPRAVIHME ------------ " + f.name());
                for(Integer i : currentCauldron.values()){
                    // да има поне 1 литър
                    int rand = new Random(). nextInt(1,i + 1);
                    System.out.println(" " + rand + " litra rakia");
                    rakiaMade += rand;
                    if(rakiaMade > 10){
                        Thread.currentThread().interrupt();
                    }
                    it.remove();
                    currentCauldron.put(f,0);
//                notifyAll();
                }
            }

        }
    }



    private void getCauldronWithSameFruit(Fruit f) {
        int rand = new Random().nextInt(ll.size());
        if(firstCauldron.containsKey(f)){
            currentCauldron = firstCauldron;
            return;
        }
        if(secondCauldron.containsKey(f)){
            currentCauldron = secondCauldron;
            return;
        }
        if(thirdCauldron.containsKey(f)){
            currentCauldron = thirdCauldron;
            return;
        }
        if(fourthCauldron.containsKey(f)){
            currentCauldron = fourthCauldron;
            return;
        }
        if(fifthCauldron.containsKey(f)){
            currentCauldron = fifthCauldron;
            return;
        }
        switch (rand){
            case 0: currentCauldron = firstCauldron; break;
            case 1: currentCauldron = secondCauldron; break;
            case 2: currentCauldron = thirdCauldron; break;
            case 3: currentCauldron = fourthCauldron; break;
            case 4: currentCauldron = fifthCauldron; break;
        }
        if(!currentCauldron.containsKey(f) && !currentCauldron.isEmpty()){
            getCauldronWithSameFruit(f);
        }
        if(currentCauldron.isEmpty()){
            currentCauldron.put(f,0);
        }
    }

    public int getRakiaMade() {
        return rakiaMade;
    }
}
