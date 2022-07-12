public class Task2 {
    /*
    2. Едномерен масив наричаме назъбен, ако всеки елемент в
масива е > от предишния и < от следващия. Напишете
програма, която проверява дали даден масив от числа е
назъбен.
     */

    public static void main(String[] args) {
        int[] array = {4,0,4,2,5,1,2,0,4};
        boolean isForDentist = true;
        for (int i = 1; i < array.length - 1; i++) {
            boolean biggerThanNeighbours = array[i] > array[i - 1] && array[i] > array[i + 1];
            boolean smallerThanNeighbours = array[i] < array[i-1] && array[i] < array[i+1];
            if (!(biggerThanNeighbours || smallerThanNeighbours)) {
                isForDentist = false;
                break;
            }

        }
        System.out.println(isForDentist ? "Its zigzag" : "Its not zig zag");
    }
}
