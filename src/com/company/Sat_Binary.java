package com.company;
/**
 * Created by c4q-john on 10/11/15.
 */
public class Sat_Binary
{
    public static void main(String[] args){

        System.out.println(DecimalToBinary(-8,2));

//        negDecimalToBinary();
//
//        numOf1sInBinary();

    }
    public static String DecimalToBinary(int number, int groupSize) {
        StringBuilder result = new StringBuilder();

        for(int i = 12; i >= 0 ; i--) {
            int mask = 1 << i;
            result.append((number & mask) != 0 ? "1" : "0");

            if (i % groupSize == 0)
                result.append(" ");
        }
        result.replace(result.length() - 1, result.length(), "");

        return result.toString();
    }
    public static void negDecimalToBinary(){
        System.out.println("51: "+Integer.toBinaryString(51));
        System.out.println("+");
        System.out.println("-8: "+Integer.toBinaryString(-8));
        System.out.println("=");
        System.out.println("binary String: "+Integer.toBinaryString(51 + -8) + "\n");
        System.out.println("51 + -8 in decimal val: " + Integer.parseInt(Integer.toBinaryString(51 + -8), 2));

    }
    public static void numOf1sInBinary(){
        //number of 1's in binary representation
        String number = Integer.toBinaryString(51 + -8);
        int posValNum = 0;
        for(int i = 0; i < number.length(); i++)
        {
            if(Integer.parseInt(String.valueOf(number.charAt(i))) == 1){
                posValNum++;
            }
        }
        System.out.println("number of 1's: " + posValNum);
    }

}
