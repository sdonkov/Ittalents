public class Task3Recursion {
    public static void main(String[] args) {
        int[] array = {6,7,11,16,18,20,0};
        boolean isMonoton = true;
        System.out.println(checkArray(array,0, isMonoton));
    }


  static boolean checkArray(int[] array, int i, boolean check ) {
        if(i == array.length-1){
            return check;
        }
      if (!(array[i] < array[i + 1])) {
          check = false;
          return false;
      }else{

          return checkArray(array, i +1, check);
      }
  }
}
