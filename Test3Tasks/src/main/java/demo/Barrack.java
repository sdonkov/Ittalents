//package demo;
//
//import java.util.Random;
//
//public class Barrack {
//
//        private volatile List<Vegetable> tomatos = new ArrayList<>();
//        private volatile List<Vegetable> eggplants = new ArrayList<>();
//        private volatile List<Vegetable> pepper = new ArrayList<>();
//
//        Object object = new Object();
//        Object object1 = new Object();
//        Object object2 = new Object();
//
//public void pick(Vegetable v) {
//        switch (v.getName()) {
//                case "PEPPER" -> {
//                        synchronized (object) {
//                                while (this.pepper.size() >= 40) {
//                                        try {
//                                                object.wait();
//
//                                        } catch (InterruptedException e) {
//                                                System.out.println("s");
//                                        }
//                                }
//                                pepper.add(v);
//                                System.out.println("One pepper is added! Now we have: " + pepper.size());
//                                object.notifyAll();
//                        }
//                        break;
//                }
//                case "TOMATO" -> {
//                        synchronized (object1) {
//                                while (this.tomatos.size() >= 40) {
//                                        try {
//                                                object1.wait();
//                                        } catch (InterruptedException e) {
//                                                System.out.println("s");
//                                        }
//                                }
//                                tomatos.add(v);
//                                System.out.println("One tomato is added! Now we have: " + tomatos.size());
//                                object1.notifyAll();
//                        }
//                        break;
//                }
//                case "EGGPLANT" -> {
//                        synchronized (object2) {
//                                while (this.eggplants.size() >= 40) {
//                                        try {
//                                                object2.wait();
//                                        } catch (InterruptedException e) {
//                                                System.out.println("s");
//                                        }
//                                }
//                                eggplants.add(v);
//                                System.out.println("One eggplant is added! Now we have: " + eggplants.size());
//                                object2.notifyAll();
//                        }
//                        break;
//                }
//        }
//}
//
//public Vegetable process() {
//        int x = new Random().nextInt(3) + 1;
//        switch (x) {
//                case 1:
//                        synchronized (object1) {
//                                while (tomatos.size() <= 0) {
//                                        try {
//                                                object1.wait();
//                                        }
//                                        catch (InterruptedException e) {
//                                                System.out.println("s");
//                                        }
//                                }
//                                int x1 = new Random().nextInt(tomatos.size());
//                                Vegetable v;
//                                v = tomatos.get(x1);
//                                tomatos.remove(x1);
//                                System.out.println(v + " is in processing. Tomatos left: " + tomatos.size());
//                                object1.notifyAll();
//                                return v;
//                        }
//
//                case 2:
//                        synchronized (object) {
//                                while (pepper.size() <= 0) {
//                                        try {
//                                                object.wait();
//                                        }
//                                        catch (InterruptedException e) {
//                                                System.out.println("s");
//                                        }
//                                }
//                                int x1 = new Random().nextInt(pepper.size());
//                                Vegetable v;
//                                v = pepper.get(x1);
//                                pepper.remove(x1);
//                                System.out.println(v + " is in processing. Peppers left: " + pepper.size());
//                                object.notifyAll();
//                                return v;
//                        }
//
//                default:
//                        synchronized (object2) {
//                                while (eggplants.size() <= 0) {
//                                        try {
//                                                object2.wait();
//                                        }
//                                        catch (InterruptedException e) {
//                                                System.out.println("s");
//                                        }
//                                }
//                                int x1 = new Random().nextInt(eggplants.size());
//                                Vegetable v;
//                                v = eggplants.get(x1);
//                                eggplants.remove(x1);
//                                System.out.println(v + " is in processing. Eggplants left: " + eggplants.size());
//                                object2.notifyAll();
//                                return v;
//                        }
//        }
//        }
//}
