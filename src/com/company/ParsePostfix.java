package com.company;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by c4q-john on 10/11/15.
 */
public class ParsePostfix
{
    static String expression = "4 3 * 5 +";
    static String operators  = "+-/*";
    public static void main(String[] args){System.out.println(evaluate());}
    private static int evaluate()
    {
        Stack<Integer> operandStack = new Stack();
        Scanner input = new Scanner(expression);
        while(input.hasNext())
        {
            String token = input.next();
            if(isOperator(token))
            {
                int left = operandStack.pop();
                int right = operandStack.pop();
                int result = performOperation(left, right, token);
                operandStack.push(result);
            }
            else
            {
                int operand = Integer.parseInt(token);
                operandStack.push(operand);
            }
        }
        if(operandStack.size() != 1){throw new IllegalStateException("unexpected stack state");}
        return operandStack.pop();
    }
    private static int performOperation(int left, int right, String op)
    {
        if(op.equals("+")){return left + right;}
        else if(op.equals("-")){return left - right;}
        else if(op.equals("/")){return left / right;}
        else if(op.equals("*")){return left * right;}
        else{throw new IllegalArgumentException("Not a valid operator");}
    }
    private static boolean isOperator(String token)
    {return token.length() == 1 && operators.contains(token);}
}
