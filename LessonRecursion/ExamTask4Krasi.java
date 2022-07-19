public class ExamTask4Krasi {
    /*
    Write a method that by given map of parking lot and the
    coordinates of the entrance of the parking lot, finds the smallest
    amount of steps you need to park your car. You can drive on squares
    marked with ''(space). A free parking spot is marked with 'F'. Spots
    that are already taken are marked with 'T'. You cannot pass through
    taken parking spots. The method must return an integer value equal
    to the smallest amount of moves that are needed to park the car or
    -1 if there are no available parking spots that you can reach from
    the entrance.
     */
    public static void main(String[] args) {

        int x =0;
        int y=0;
//        int steps = 0;
        char[][] parkingLot ={
                {' ',' ',' ',' ',' ',' ',' ',' '},
                {'T','T','T',' ','T','T','T','T'},
                {' ',' ',' ',' ',' ',' ',' ',' '},
                {'T','T','T',' ',' ',' ',' ','T'},
                {' ',' ',' ',' ',' ',' ',' ',' '},
                {'T','F','T',' ',' ',' ',' ',' '},
                {' ',' ',' ',' ',' ',' ',' ',' '}
        };
        System.out.println(canPark(parkingLot, 0,0,0));
        for(int i =0; i < parkingLot.length; i++){
            for(int j =0; j<parkingLot[i].length; j++) {
                System.out.print(parkingLot[i][j]);
            }
            System.out.println();
        }

    }

    static int canPark(char[][] parkingLot, int x, int y, int steps){
        if(x<0 || y <0 || x == parkingLot.length || y == parkingLot[0].length){
            return -1;
        }

        if(parkingLot[x][y] == 'T'){
            return  -1;
        }
        if(parkingLot[x][y] == 'F'){
            return steps;
        }
        if(parkingLot[x][y] == '*'){
            return -1;
        }

        steps++;
        parkingLot[x][y] = '*';


        int stepsUp = canPark(parkingLot, x-1,y,steps);
        int stepsDown= canPark(parkingLot, x+1,y,steps);
        int stepsRight = canPark(parkingLot,x, y+1,steps);
        int stepsLeft = canPark(parkingLot,x, y-1,steps);
        int min = Integer.MAX_VALUE;

        int[] stepsArray = {stepsUp,stepsDown, stepsLeft, stepsRight};
        for(int i =0; i<stepsArray.length;i++){
            if(min > stepsArray[i] && stepsArray[i] != -1){
                min = stepsArray[i];
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}
