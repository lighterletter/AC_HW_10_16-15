package com.company;

import java.util.Scanner;
import java.util.regex.Pattern;
public class ChessProblem

    //This is code I began to write to solve the chess problem for last week's homework.
    //I decided to leave it here as documentation, might return to the problem at some point.
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        //output
        System.out.println("Type any two integers separated by a space, by typing 00 you exit the program.");
        String outputTape = scan.nextLine();
        while(!outputTape.equals("0 0" ))
        {
            if(outputTape.contains(" ") )
            {
                String[] parts = outputTape.split(Pattern.quote(" ")); //Split by space
                String part1 = parts[0]; //1st part of the string
                String part2 = parts[1]; //2nd part of the string
                System.out.println(calcGrid(Integer.parseInt(part1), Integer.parseInt(part2)));
                outputTape = scan.nextLine();
            } else
            {
                break;
            }
        }
        System.out.println("Program terminated.");
    }
    public static double factor(double n){
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    public static double calcGrid(int n, int m)
    {
        //chess queen grid calculation goes here

        int inRange = 0;

        if (0 < m && n <= 1000000 )
        {
//            for(int i = 0; i < n; i++)
//            {
//                for(int j = 0; j < m; j++)
//                {
//                    System.out.println( "j: " + j );
//
//                    //inRange = factor(factor(n) * (n))/2; // number of spaces
//
//                    inRange += factor(3)/factor(3-(factor(factor(n) * (m))/2))/2;
//
//                    //inRange += inRange;
//                }
//
//                //System.out.println( "i: " +  i );
////                inRange += inRange;
////                System.out.println(inRange);
//
//            }

        }

        return factor(3) * (n * m)*2;
    }
}

