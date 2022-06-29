

import java.util.Scanner;

public class Demo
{
    public static void main(String[] args)
    {   // taking variable for loop iteration and row .
        int row;

        int r;
        int c;
        int d;
        //creating object
        Scanner s = new Scanner(System.in);
        // entering the number of row
        System.out.print("Enter rows : ");
        row = s.nextInt();
        //outer for loop
        // this for loop is responsible to print upper hollow part.
        for (r = 1; r<= row ; r++)
        {
            for (c = 1; c < r; c++)
                System.out.print(" ");
            for (c = r; c <= row ; c++)
            {
                if(r == 1 || c == r|| c == row )
                    System.out.print("# ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        // this for loop is responsible to print lower hollow part.
        for (r = row -1; r >= 1;r--)
        {
            for (c = 1; c < r; c++)
                System.out.print(" ");
            for (c = r; c <= row; c++)
            {
                if(r == 1 || c == r || c == row)
                    System.out.print("# ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}