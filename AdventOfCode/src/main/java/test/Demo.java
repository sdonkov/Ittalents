package test;

import javax.xml.crypto.Data;
import java.util.*;

public class Demo {

   private static int demo;

   void useInner(){
       Inner inner = new Inner();
       System.out.println(inner.test);
   }

//
    private static class Inner{
       private static int age = 31;
       private static String name = "nestho";
       private int test = 121;
       private void test(){
           System.out.println(demo);
           System.out.println(age);
       }

//        test.Human human = new test.Human();
}

    public static void main(String[] args) {
//        Demo.Inner inner2 = new Inner();
//        Inner.age = 31;
//        Inner inner = new Inner();
//        HashMap<int, int> map = new HashMap<int, int>();
        Person personaj = new Person(3);
        Student student1 = new Student(13);
        Student.opa();
        Human.opa();


//        personaj.
        int e =12;
        int c = nums(e);
        System.out.println(c);
        System.out.println(e);
        Classes classes = new Classes();
        classes.method();
        Classes.Inner inner = classes.getInner();
        inner.printFromOuter();
//        inner.
        Object obj = new Object();
        Human human;
        Test test;
//        obj.
        Testov testov =new Person(13);
//        testov.text();
        HashSet<Person> people = new HashSet<>();
        people.add(new Person(30));
        people.add(new Person(30));
//        Person personA = new Person(30);
//        personA.notStaticMethod();
        System.out.println(people.size());
        String are = "opa";
        String b = new String("opa");
        System.out.println(are == b);
        System.out.println(are.equals(b));
        StringBuilder builder = new StringBuilder("building text");
        builder.append(" other text here");
        System.out.println(builder.toString().equals("building text other text here"));
        System.out.println(builder);
//        are.
        System.out.println(are.substring(1));
        System.out.println("String a " + are.hashCode() + " string b " + b.hashCode());
        Human choveka = new Person(33);
        System.out.println(choveka.getNumber());
        choveka = new Student(21);
        System.out.println(choveka.getNumber());
        String word = "sotir";
        char a;
        a = 'a';
        System.out.println(word.replace(word.charAt(1), 'a'));
//        a = word.charAt(1);
        System.out.println(a);
        int[] arr = new int[2];
        arr[0] = 1;
        arr[1] = 12;
        arr[1] = 15;

        String word2 = word.replace(word.charAt(1), a );
        System.out.println(word.charAt(1));

        System.out.println(word);
        System.out.println(word2);

        int first = 101;
        int second = 222;
        System.out.println("First number is " + first + " Second number is " + second);
        int temp;
        temp = first;
        first = second;
        second = temp;
        System.out.println("First number is " + first + " Second number is " + second);

//         int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        int[] numbers = {3,1,4,7,5,6,2,2,12,12,12,1,5,4};
        //1,3,4,7,5,6,2
//        bubbleSort(numbers);
//        selectionSort(numbers);
        countringSort(numbers);
        System.out.println(Arrays.toString(numbers));
//        quickSort(numbers, 0, numbers.length - 1);
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.print(numbers[i]+" ");
//        }
//        System.out.println(Arrays.toString(numbers));
        TreeSet<Person> personTreeSet = new TreeSet<>(new ComparatorByAge());
        personTreeSet.add(new Person(5));
        personTreeSet.add(new Person(12));
        personTreeSet.add(new Person(12));
        System.out.println(personTreeSet);
        List<Integer> list = new ArrayList<Integer>();
        list.add(5);
        HashSet<String> set = new HashSet<>();
        Iterator<String> it = set.iterator();
        HashMap<String, Integer> map =new HashMap<>();
        map.put("text",3);
        map.get("text");
        int x =5;
        int y = 6;
//        x.equals(y);
//        CopyOnWriteArrayList
//        ConcurrentHashMap
        Thread t = new Thread(new Testing());
        t.start();
        Thread thread = new Chovek();
        thread.start();
        Thread treading = new Thread(() ->{
            while(true){
                System.out.println("threading");
            }
        });
//        treading.start();
        new Thread(() -> System.out.println("Run run")).start();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        for (Iterator<String> itt = set.iterator(); itt.hasNext();){
            System.out.println(itt.next());
        }
//        list.add(3,12);
        final Person gosho = new Person(20);
        gosho.setAge(30);
//        var xix = 3;
//        var axix = "text";
        System.out.println(gosho.getAge());
        Person tosho = new Person(12);
//        gosho = tosho;
        Person[] persons = new Person[5];
        persons[0] = gosho;
        persons[1] = tosho;
//        persons[2] = new test.Student(50);
//        persons[3] = new test.Student(12);
//        persons[4] = new test.Student(16);
        System.out.println(Arrays.toString(persons));
        Student student = new Student(15);
        System.out.println("test.Person test method " + tosho.test2());
        System.out.println("test.Student test method " + student.test2());
    }

    private static void countringSort(int[] numbers) {
        int max = numbers[0];
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if(numbers[i] > max){
                max = numbers[i];
            }
            if(numbers[i] < min){
                min = numbers[i];
            }
        }
//        int[] numbers = {3,1,3,4,3,6,2};
        int[] helper = new int[max-min + 1];
        for (int i = 0; i < numbers.length; i++) {
            helper[numbers[i]-min]++;
        }
        System.out.println(Arrays.toString(helper));

        int index = 0;
        for (int i = 0; i < helper.length; i++) {
            int counter = helper[i];
            int counted = i + min;
            for (int j = 0; j < counter; j++) {
                numbers[index] = counted;
                index++;
            }
        }
    }

    private static void quickSort(int[] numbers,int start, int end) {
        if(start >=end){
            return;
        }
        int pivotIndex =  partition(numbers, start, end);
        quickSort(numbers, start, pivotIndex -1);
        quickSort(numbers, pivotIndex + 1, end);
    }

    private static int partition(int[] numbers, int start, int end) {
        //int[] numbers = {3,1,4,7,5,6,2,2,12,12,12,1,5,4};
        int pivot = numbers[end];
        int pivotIndex = start;
        for (int i = start; i < end; i++) {
            if(numbers[i] < pivot) {
                int temp = numbers[i];
                numbers[i] = numbers[pivotIndex];
                numbers[pivotIndex] = temp;
                pivotIndex++;
            }
        }
//        int[] numbers = {3,1,4,7,5,6,2};
        int temp = numbers[pivotIndex];
        numbers[pivotIndex] = numbers[end];
        numbers[end] = temp;
        return pivotIndex;
    }

    private static void selectionSort(int[] numbers) {
        for (int times = 0; times < numbers.length/2; times++) {
            int minIdx = times;
//            int min = numbers[times];
            int maxIdx = times;
//            int max = numbers[times];
            for (int i = times+1; i < numbers.length-times; i++) {
                if(numbers[i] < numbers[minIdx]){
                    minIdx = i;
                }
                if(numbers[i] > numbers[maxIdx]){
                    maxIdx = i;
                }
            }
            int temp = numbers[minIdx];
            numbers[minIdx] = numbers[times];
            numbers[times] = temp;
            if(maxIdx == times){
                maxIdx = minIdx;
            }
            temp = numbers[maxIdx];
            numbers[maxIdx] = numbers[numbers.length-1-times];
            numbers[numbers.length-1-times] = temp;

        }
    }

    private static void bubbleSort(int[] numbers) {
        for(int i =0; i < numbers.length; i++){
            for (int j = 0; j < numbers.length - 1- i; j++) {
                if (numbers[j + 1] < numbers[j]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }
    }

    static int nums(int a){
       return a+5;
    }
}
