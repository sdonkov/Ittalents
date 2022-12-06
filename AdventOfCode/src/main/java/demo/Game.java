package demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Game {

    public static void main(String[] args) {

        int points = 0;
        File file = new File("C:\\Users\\Karina\\IdeaProjects\\StringTest\\src\\game.txt");
//        System.out.println(file.exists());
        try(Scanner sc = new Scanner(file)){
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                char opponent = line.charAt(0);
                char needed = line.charAt(2);
                points = playTheGame(opponent, needed, points);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Nqma li go ");
        }
        System.out.println(points);
    }

    private static int playTheGame(char opponent, char needed, int points) {
        //X means you need to lose, Y means you need to end the round in a draw, and Z means you need to win.
        if(needed == 'X'){
            //need to lose
            if(opponent == 'A'){
                points+= 3;
            }else {
                if(opponent == 'B'){
                    points += 1;
                }else {
                    if(opponent == 'C'){
                        points += 2;
                    }
                }
            }
        }
        else{
            if(needed == 'Y'){
                points+= 3;
                // draw
                if(opponent == 'A'){
                    points+= 1;
                }else {
                    if(opponent == 'B'){
                        points += 2;
                    }else {
                        if(opponent == 'C'){
                            points += 3;
                        }
                    }
                }
            }
            else{
                if(needed == 'Z'){
                    //win
                    points += 6;
                    if(opponent == 'A'){
                        points+= 2;
                    }else {
                        if(opponent == 'B'){
                            points += 3;
                        }else {
                            if(opponent == 'C'){
                                points += 1;
                            }
                        }
                    }
                }

            }
        }
//        if(opponent == 'A' && me == 'Y'){
//            points += 6; // win
//            points += 2;
//        }else {
//            if(opponent == 'A' && me == 'Z'){
//                // lose
//                points += 3;
//            }
//        }
//        if(opponent == 'A' && me == 'X'){
//            points += 3;
//            points += 1;
//        }
//        if(opponent == 'B' && me == 'X'){
//            //lose
//            points +=1;
//        }else{
//            if(opponent == 'B' && me == 'Z'){
//                points +=6; //win
//                points +=3;
//            }
//        }
//        if(opponent == 'B' && me == 'Y'){
//            points += 3;
//            points+= 2;
//        }
//        if(opponent == 'C' && me == 'X'){
//            points +=6; // win
//            points += 1;
//        }else{
//            if(opponent == 'C' && me == 'Y'){
//                //lose
//                points+=2;
//            }
//        }
//        if(opponent == 'C' && me == 'Z'){
//            points += 3;
//            points += 3;
//        }
        return points;
    }
}
//X means you need to lose, Y means you need to end the round in a draw, and Z means you need to win.
// A for Rock, B for Paper, and C for Scissors.
// 1 for Rock, 2 for Paper, and 3 for Scissors
//  X for Rock, Y for Paper, and Z for Scissors.