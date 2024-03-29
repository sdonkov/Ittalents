package test;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Arithmetic{
    int add(int a, int b){
        return a+b;
    }

    public static class Adder extends Arithmetic{

    }
    public static class Solution{
        public static void main(String []args){
            // Create a new Adder object
            Arithmetic.Adder a = new Arithmetic.Adder();

            // Print the name of the superclass on a new line
            System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());

            // Print the result of 3 calls to Adder's `add(int,int)` method as 3 space-separated integers:
            System.out.print(a.add(10,32) + " " + a.add(10,3) + " " + a.add(10,10) + "\n");
        }
    }

}



